package pt.renepont.foo.services;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import pt.renepont.foo.model.Person;

@Service
public class PersonService {
    
    private final AtomicLong counter = new AtomicLong();

    public Person findById(String id) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("firstName");
        person.setLastName("lastName");
        person.setAddress("address");
        person.setGender("M");
        return person;
    }

}
