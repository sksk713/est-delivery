package com.example.estdelivery.adapters.`in`.web.controller

import com.example.estdelivery.adapters.`in`.web.dto.request.MemberCommand
import com.example.estdelivery.application.dto.member.MemberResponse
import com.example.estdelivery.application.port.`in`.member.CreateMemberUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/members")
class MemberController(
    private val createMemberUseCase: CreateMemberUseCase
) {
    @PostMapping
    fun createMember(@RequestBody request: MemberCommand): MemberResponse {
        return createMemberUseCase.createMember(request)
    }
}