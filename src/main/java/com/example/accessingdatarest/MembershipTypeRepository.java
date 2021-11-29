package com.example.accessingdatarest;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "membershipType", path = "membership_type")
public interface MembershipTypeRepository extends PagingAndSortingRepository<Member, Long> {
    List<MembershipType> findById(@Param("id") long id);
    List<MembershipType> findByMembershipType(@Param("membershipType") String membershipType);
}
