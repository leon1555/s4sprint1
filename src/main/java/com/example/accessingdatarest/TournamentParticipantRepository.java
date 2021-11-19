package com.example.accessingdatarest;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tournament", path = "tournament")
public interface TournamentParticipantRepository extends PagingAndSortingRepository<TournamentParticipant, Long> {
    List<TournamentParticipant> findById(@Param("id") long id);
    List<TournamentParticipant> findByIdMember(@Param("idMember") long idMember);
    List<TournamentParticipant> findByIdTournament(@Param("idTournament") long idTournament);
    List<TournamentParticipant> findByResultRank(@Param("resultRank") int resultRank);
}
