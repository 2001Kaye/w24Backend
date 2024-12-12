package kr.ac.kumoh.ce.s20240058.w24backend.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/message")
class MessageController {
    @GetMapping
    // TODO: React 주소 추가
    @CrossOrigin(origins= ["http:localhost:3000"])
    fun getMessage() = mapOf("status" to "success")
}