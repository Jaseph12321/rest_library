package com.example.rest_library.controller;

import com.example.rest_library.model.Member;
import com.example.rest_library.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping()
    public List<Member> getAllMembers(){
        List<Member> memberList = this.memberService.getAllMembers();
        return memberList;
    }

    @GetMapping("/{name}")
    public Member getMemberByName(@PathVariable String name){
        Member member = this.memberService.getMemberByName(name);
        return member;
    }

    @PostMapping()
    public Member createMember(@RequestBody Member member){
        Member createMember = this.memberService.createMember(member);
        return createMember;
    }

    @PutMapping("/update")
    public Member updateMember(@RequestParam int id, @RequestBody Member member){
        Member updateMember = this.memberService.updateMember(id,member);
        return updateMember;
    }

    @DeleteMapping("/{id}")
    public Member deleteMember(@PathVariable int id){
        Member deleteMember = this.memberService.deleteMember(id);
        return deleteMember;
    }
}
