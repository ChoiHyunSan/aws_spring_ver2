package com.ll.spring_0318

import org.springframework.stereotype.Service

@Service
class MemberService (
    private var memberCount : Int = 0
){
    fun count(): Int = plusMemberCount()

    private fun plusMemberCount(): Int = memberCount++
}
