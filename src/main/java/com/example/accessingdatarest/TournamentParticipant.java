package com.example.accessingdatarest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
    public class TournamentParticipant {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private long idTournament; // Foreign Key from Tournament
        private long idMember; // Foreign Key from Member
        private int resultRank;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdTournament() {
        return idTournament;
    }

    public void setIdTournament(long idTournament) {
        this.idTournament = idTournament;
    }

    public long getIdMember() {
        return idMember;
    }

    public void setIdMember(long idMember) {
        this.idMember = idMember;
    }

    public int getResultRank() {
        return resultRank;
    }

    public void setResultRank(int resultRank) {
        this.resultRank = resultRank;
    }
}
