package com.ll.spring_0318

import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicInteger

@Service
class MemberService (
    private var memberCount : AtomicInteger = AtomicInteger(0)
){
    fun count(): Int = plusMemberCount()

    private fun plusMemberCount(): Int = memberCount.incrementAndGet()
}
