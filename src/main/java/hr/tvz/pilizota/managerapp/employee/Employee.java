package hr.tvz.pilizota.managerapp.employee;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Employee implements Serializable {
    public enum Gender {
        MALE, FEMALE
    }
    public enum Contract {
        INDEFINITE, DETERMINED
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="name", nullable = false, unique = true)
    private String name;

    private String picture;

    private Gender gender;

    private Integer year_of_birth;

    private String work_start_date;

    private Contract contract_type;

    private String contract_length;

    private String department;

    private Integer annual_leave_days;

    private Integer vacation_days;

    private Integer paid_leave_days;

    public Employee() {
    }

    public Employee(String name, String picture, Gender gender, Integer year_of_birth, String work_start_date, Contract contract_type, String contract_length, String department, Integer annual_leave_days, Integer vacation_days, Integer paid_leave_days) {
        this.name = name;
        this.picture = picture;
        this.gender = gender;
        this.year_of_birth = year_of_birth;
        this.work_start_date = work_start_date;
        this.contract_type = contract_type;
        this.contract_length = contract_length;
        this.department = department;
        this.annual_leave_days = annual_leave_days;
        this.vacation_days = vacation_days;
        this.paid_leave_days = paid_leave_days;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(Integer year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public String getWork_start_date() {
        return work_start_date;
    }

    public void setWork_start_date(String work_start_date) {
        this.work_start_date = work_start_date;
    }

    public Contract getContract_type() {
        return contract_type;
    }

    public void setContract_type(Contract contract_type) {
        this.contract_type = contract_type;
    }

    public String getContract_length() {
        return contract_length;
    }

    public void setContract_length(String contract_length) {
        this.contract_length = contract_length;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getAnnual_leave_days() {
        return annual_leave_days;
    }

    public void setAnnual_leave_days(Integer annual_leave_days) {
        this.annual_leave_days = annual_leave_days;
    }

    public Integer getVacation_days() {
        return vacation_days;
    }

    public void setVacation_days(Integer vacation_days) {
        this.vacation_days = vacation_days;
    }

    public Integer getPaid_leave_days() {
        return paid_leave_days;
    }

    public void setPaid_leave_days(Integer paid_leave_days) {
        this.paid_leave_days = paid_leave_days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", gender=" + gender +
                ", year_of_birth=" + year_of_birth +
                ", work_start_date='" + work_start_date + '\'' +
                ", contract_type=" + contract_type +
                ", contract_length='" + contract_length + '\'' +
                ", department='" + department + '\'' +
                ", annual_leave_days=" + annual_leave_days +
                ", vacation_days=" + vacation_days +
                ", paid_leave_days=" + paid_leave_days +
                '}';
    }
}
