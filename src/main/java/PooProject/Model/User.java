package PooProject.Model;

public class User {
    private String name;
    private Long userId;
    private String cpf;
    private String email;
    private String phone;

    public User (String name, String email , String cpf, String phone, Long userId){
        this.name = name;
        this.cpf = cpf;
        this.userId = userId;
        this.email = email;
        this.phone = phone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone() {
        this.phone = phone;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId() {
        this.userId = userId;
    }

    public void authenticate() {

    }

    public void viewLoans() {

    }
}
