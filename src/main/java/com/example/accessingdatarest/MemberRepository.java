package com.example.accessingdatarest;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "member", path = "member")
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {
    List<Member> findById(@Param("idmember") long id);
    List<Member> findByLastName(@Param("lastName") String lastName);
    List<Member> findByFirstName(@Param("firstName") String firstName);
    List<Member> findByAddress(@Param("address") String address);
    List<Member> findByEmail(@Param("email") String email);
    List<Member> findByPhone(@Param("phone") String phone);
    List<Member> findByMemberStartDate(@Param("memberStartDate") LocalDate memberStart);
    List<Member> findMemberByMembershipTypeId(@Param("id") long id);
    List<Member> findMemberByMembershipTypeMembershipType(@Param("membershipType") String membershipType);
}
