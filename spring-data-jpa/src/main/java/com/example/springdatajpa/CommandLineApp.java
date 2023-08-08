package com.example.springdatajpa;

import com.example.springdatajpa.models.Passport;
import com.example.springdatajpa.models.Person;
import com.example.springdatajpa.repository.PassportRepository;
import com.example.springdatajpa.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

@Component
@RequiredArgsConstructor
public class CommandLineApp implements CommandLineRunner {

    private final PersonRepository personRepository;

    private final PassportRepository passportRepository;

    @Override
    public void run(String... args) throws Exception {

    }


    private void oneToOneExample() {
        Person person = Person.builder()
                .name("mert")
                .surname("test1")

                .build();
        Passport passport = Passport.builder()
                .expireDate(Instant.now().plus(10, ChronoUnit.YEARS).getEpochSecond())
                .person(person)
                .build();

        this.passportRepository.save(passport);
        System.out.println(passport);
    }
}
