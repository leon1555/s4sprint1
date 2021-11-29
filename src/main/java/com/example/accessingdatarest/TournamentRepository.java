package com.example.accessingdatarest;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tournament", path = "tournament")
public interface TournamentRepository extends PagingAndSortingRepository<Tournament, Long> {
    List<Tournament> findById(@Param("id") long id);
    List<Tournament> findByName(@Param("name") String name);
    List<Tournament> findByStart(@Param("start") LocalDate start);
    List<Tournament> findByEnd(@Param("end") LocalDate end);
    List<Tournament> findByLocation(@Param("location") String location);
    List<Tournament> findByFee(@Param("fee") int fee);
    List<Tournament> findByPrize(@Param("prize") int prize);

    // Still not sure exactly how to make this bridge between tournament and member work.
    // That the columns are called "first_place," "second_place," etc. instead of "member"
    // makes it a little more complicated than the example with Person and Car we did in class.
//    List<Tournament> findTournamentByMemberId(@Param("id") long id);
//    List<Tournament> findBySecondPlace(@Param("secondPlace") long id);
//    List<Tournament> findByThirdPlace(@Param("thirdPlace") long id);
}
