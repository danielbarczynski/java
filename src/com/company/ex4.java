package com.company;

public class ex4 {
    public static void main(String[] args) {
        CRC32 crc = new CRC32();
        System.out.println(crc.execute("This is example text ..."));
    }

}

 class CRC32{
    int[] CRC_TABLE;
    public  CRC32() {
            CRC_TABLE = new int[256];

            for (int i = 0; i < 256; ++i) {
                int code = i;
                for (int j = 0; j < 8; ++j) {
                    code = (code & 0x01) == 0 ? (0xEDB88320 ^ (code >>> 1)) : (code >>> 1); // nie mam pojecia o co tu kaman
                }
                CRC_TABLE[i] = code;
            }
        }

        public int execute(String text) {
        int crc = -1;
        for (int i = 0; i < text.length(); ++i) {
            int code = Character.codePointAt(text, i);
            crc = CRC_TABLE[(code ^ crc) & 0xFF] ^ (crc >>> 8);
        }
        return (-1 ^ crc) >>> 0;
    }
}