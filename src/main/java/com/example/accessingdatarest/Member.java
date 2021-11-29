package com.example.accessingdatarest;

import javax.persistence.*;
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
        // To record the duration of the membership, I wanted to set up a trigger in the MySQL database, but I ran
        // out of time. (Haven't had much practice with triggers.)

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

        public MembershipType getMembershipType() {
        return membershipType;
    }

        public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

}

