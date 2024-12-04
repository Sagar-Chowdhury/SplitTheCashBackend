package com.example.SplitTheCash.repositories;

import com.example.SplitTheCash.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,String> {
    List<Member> findByEmail();
}
