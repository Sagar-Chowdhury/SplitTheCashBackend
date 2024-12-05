package com.example.SplitTheCash.services;

import com.example.SplitTheCash.entities.Expense;
import com.example.SplitTheCash.entities.Member;

import java.util.List;

public interface MemberService {
    List<Member> getMembersByTrip(String tripId); // Get members of a trip
    List<Expense> getExpensesByMember(String memberId); // Get expenses paid by a member
}
