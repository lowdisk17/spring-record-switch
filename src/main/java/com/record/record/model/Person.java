package com.record.record.model;

public record Person(String name, Integer age, String gender) implements Animal {}
