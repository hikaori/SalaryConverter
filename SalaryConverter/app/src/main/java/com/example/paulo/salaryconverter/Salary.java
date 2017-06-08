package com.example.paulo.salaryconverter;

import android.widget.TextView;

/**
 * Created by kaorihirata on 2017-06-07.
 */

public class Salary {
    Country slaryCountry;
    CharSequence AverageSalary;
    Job salaryJobName;

    public Salary(Country slaryCountry, CharSequence averageSalary, Job salaryJobName) {
        this.slaryCountry = slaryCountry;
        AverageSalary = averageSalary;
        this.salaryJobName = salaryJobName;
    }

    public CharSequence getAverageSalary() {
        return AverageSalary;
    }

    public void setAverageSalary(CharSequence averageSalary) {
        AverageSalary = averageSalary;
    }

    public Country getSlaryCountry() {
        return slaryCountry;
    }

    public void setSlaryCountry(Country slaryCountry) {
        this.slaryCountry = slaryCountry;
    }

    public Job getSalaryJobName() {
        return salaryJobName;
    }

    public void setSalaryJobName(Job salaryJobName) {
        this.salaryJobName = salaryJobName;
    }
}
