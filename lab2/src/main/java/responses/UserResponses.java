package responses;

import com.example.lab2.models.UserEntity;

import java.util.List;

public class UserResponses {
    private Integer pageNumber;
    private Integer pageCount;
    private Integer pageSize;
    private Integer totalCount;
    private List<UserEntity> users;

    public UserResponses() {}
    public UserResponses(Integer pageNumber, Integer pageCount, Integer pageSize, Integer totalCount, List<UserEntity> users) {
        this.pageNumber = pageNumber;
        this.pageCount = pageCount;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.users = users;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
