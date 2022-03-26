//package com.company;
//
//public class ex7 {
//    public class User {
//
//        private String name;
//        private int age;
//
//        public User(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//
//        public String getName() {
//            return this.name;
//        }
//
//        public int getAge() {
//            return this.age;
//        }
//    }
//    public static void main(String[] args) {
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        User userObject = new User("John", 21);
//        String userJson = objectMapper.writeValueAsString(userObject);
//
//        System.out.println(userJson); // {"name":"John","age":21}
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        User userObject = new User("John", 21);
//        String userJson = objectMapper.writeValueAsString(userObject);
//
//        System.out.println(userJson); // {"name":"John","age":21}
//
//    }
//}
//
