package structural.adapter;

public class EmployeeLdap {
    private String uuid;
    private String firstName;
    private String surName;
    private String email;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmployeeLdap(String uuid, String firstName, String surName, String email){
        this.uuid = uuid;
        this.firstName = firstName;
        this.surName = surName;
        this.email = email;
    }


}
