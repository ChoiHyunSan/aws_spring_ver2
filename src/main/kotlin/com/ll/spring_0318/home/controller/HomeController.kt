package com.ll.spring_0318.home.controller

import com.ll.spring_0318.MemberService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController (
    private val memberService: MemberService
){
    @GetMapping("/")
    fun main() = "현재 총 ${memberService.count()}"
}
