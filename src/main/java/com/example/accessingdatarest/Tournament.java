package com.example.accessingdatarest;

import javax.persistence.*;

import java.time.LocalDate;

@Entity
    public class Tournament {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String name;
        private LocalDate start;
        private LocalDate end;
        private String location;
        private int fee;
        private int prize;

        @OneToOne
        private Person firstPlace;
        @OneToOne
        private Person secondPlace;
        @OneToOne
        private Person thirdPlace;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public Person getFirstPlace() {
        return firstPlace;
    }

    public void setFirstPlace(Person firstPlace) {
        this.firstPlace = firstPlace;
    }

    public Person getSecondPlace() {
        return secondPlace;
    }

    public void setSecondPlace(Person secondPlace) {
        this.secondPlace = secondPlace;
    }

    public Person getThirdPlace() {
        return thirdPlace;
    }

    public void setThirdPlace(Person thirdPlace) {
        this.thirdPlace = thirdPlace;
    }
}
