public class Student {
    private Integer coltrolnumber;
    private String name;
    private String lastname;
    private String email;
    private Integer semester;
    private String carrer;

    public Integer getColtrolnumber() {
        return coltrolnumber;
    }

    public void setColtrolnumber(Integer coltrolnumber) {
        this.coltrolnumber = coltrolnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;
}
