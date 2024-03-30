package com.record.record.service;

import org.springframework.stereotype.Service;

import com.record.record.model.Animal;
import com.record.record.model.Mammal;
import com.record.record.model.Person;

@Service
public class MainService {

  Animal person = new Person("John Doe", 20, "Male");

  public boolean execute () {
    System.out.println("This is " + ((Person) person).name() + ", " + ((Person) person).age() + ", " + ((Person) person).gender());

    if (person instanceof Person(String name, Integer age, String gender)) {
      System.out.println("This is an instace of Person");
    }

    String response = switch(person) {
      case Person p -> "Person: " + ((Person) p).name();
      case Mammal m -> "Mammal: " + ((Mammal) m).type();
      case null -> "This is null value string";
      default -> "This is default string";
    };

    switch(person) {
      case Person p -> {
        if (p.age() > 0) {
          System.out.println("Age is greater than 0");
        }
      }
      default -> System.out.println("This is default string");
    }

    return response != null ? true : false;
  }
  
}
