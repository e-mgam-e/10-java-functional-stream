package com.example.task05;

public class Salary implements Mail<Integer> {
    private final String from;
    private final String to;
    private final Integer salary;

    public Salary(String from, String to, Integer salary) {
        this.from = from;
        this.to = to;
        this.salary = salary;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public Integer getContent() {
        return salary;
    }
}