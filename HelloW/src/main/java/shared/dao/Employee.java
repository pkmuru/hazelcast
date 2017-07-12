package shared.dao;

import java.io.Serializable;

/**
 * Created by muru on Jul-11-17.
 */
public class Employee implements Serializable {

    private static final long serialVersionUID = 3423423423423432L;

    private Long empId;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String name;
    private String dept;
    private String dob;
    private String email;

    public Employee(Long empId, String name, String dept, String dob, String email) {
        this.empId = empId;
        this.name = name;
        this.dept = dept;
        this.dob = dob;
        this.email = email;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "shared.dao.Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (empId != null ? !empId.equals(employee.empId) : employee.empId != null) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (dept != null ? !dept.equals(employee.dept) : employee.dept != null) return false;
        if (dob != null ? !dob.equals(employee.dob) : employee.dob != null) return false;
        return email != null ? email.equals(employee.email) : employee.email == null;

    }

    @Override
    public int hashCode() {
        int result = empId != null ? empId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dept != null ? dept.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
