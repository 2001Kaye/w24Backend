package kr.ac.kumoh.ce.s20240058.w24backend.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins= ["http://localhost:3000", "https://kaye-w24frontend.netlify.app/"])
class MessageController {
    @GetMapping
    fun getRoot() = mapOf("status" to "success")

    @GetMapping("/api/message")
    fun getMessage() = mapOf("status" to "success")
}