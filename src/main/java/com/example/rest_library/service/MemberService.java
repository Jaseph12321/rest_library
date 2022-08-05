package com.example.rest_library.service;


import com.example.rest_library.model.Book;
import com.example.rest_library.model.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    List<Member> memberList = new ArrayList<>();

    public MemberService(){
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Java Spring Boot","programming","Jordan", "4F"));
        bookList.add(new Book("The right time","fiction","Marry Smith","2F"));
        bookList.add(new Book("How to love","health","Tyson William","6F"));
        memberList.add(new Member(1,"Jaseph","Male",bookList));

        List<Book> bookList2 = new ArrayList<>();
        bookList2.add(new Book("Where are you","literature","Kate", "4F"));
        bookList2.add(new Book("I miss you","fiction","John Smith","2F"));
        bookList2.add(new Book("Are you ok","inspiration","Ben Solomon","5F"));
        memberList.add(new Member(2,"Betty", "Female", bookList2));

    }

    public List<Member> getAllMembers(){return this.memberList;}

    public Member getMemberByName(String name){
        for(Member member: this.memberList){
            if(name.toLowerCase().equals(member.getName().toLowerCase())){
                return member;
            }
        }
        return null;
    }

    public Member createMember(Member member){
        this.memberList.add(member);
        return member;
    }

    public Member updateMember(int id , Member member){
        for(Member updateMember: this.memberList){
            if(id == updateMember.getId()){
                updateMember.setName(member.getName());
                updateMember.setGender(member.getGender());
                updateMember.setBookList(member.getBookList());
                return updateMember;
            }
        }
        return null;
    }

    public Member deleteMember(int id){
        for(Member deleteMember: this.memberList){
            if(id == deleteMember.getId()){
                this.memberList.remove(deleteMember);
                return deleteMember;
            }
        }
        return null;

    }

}
