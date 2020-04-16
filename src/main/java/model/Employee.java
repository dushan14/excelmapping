package model;

import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class Employee {
    private String name;
    private Date birthDate;
    private Double payment;
    private Double bonus;

    public Employee(String name, String birthDate, Double payment, Double bonus) {
        this.name = name;
        this.payment = payment;
        this.bonus = bonus;
        try {
            this.birthDate = new SimpleDateFormat("yyyy/MM/dd").parse(birthDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
