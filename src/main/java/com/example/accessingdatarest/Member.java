package com.example.accessingdatarest;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDate;



@Entity
    public class Member {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        private String firstName;
        private String lastName;
        private String address;
        private String email;
        private String phone;
        private LocalDate memberStartDate;
//        private double memberDurationDays;

        @OneToOne
        private MembershipType membershipType;

    public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getMemberStartDate() {
        return memberStartDate;
    }

    public void setMemberStartDate(LocalDate memberStartDate) {
        this.memberStartDate = memberStartDate;
    }

//    public double getMemberDurationDays() {
//            LocalDate now = LocalDate.now();
//            Duration duration = Duration.between(now, memberStartDate);
//            double diffHours = Math.abs(duration.toHours());
//            double diffDays = diffHours / 24;
//            return diffDays;
//    }
    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

}

