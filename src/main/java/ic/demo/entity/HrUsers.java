package ic.demo.entity;

public class HrUsers {
    private Integer uId;

    private String uName;

    private String uRoleId;

    private String uPassword;

    public HrUsers(Integer uId, String uName, String uRoleId, String uPassword) {
        this.uId = uId;
        this.uName = uName;
        this.uRoleId = uRoleId;
        this.uPassword = uPassword;
    }

    public HrUsers() {
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuRoleId() {
        return uRoleId;
    }

    public void setuRoleId(String uRoleId) {
        this.uRoleId = uRoleId == null ? null : uRoleId.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }
}