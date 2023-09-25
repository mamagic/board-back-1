package com.api.board.controller;

import com.api.board.entity.Member;
import com.api.board.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MemberController {

   MemberService memberService;

   @PostMapping("/signin")
   public ResponseEntity<?> signIn(@RequestBody Member member){
      System.out.println(member.toString());
      return ResponseEntity.ok("ok");
   }
}
