package com.example.myapplication

object Auth {
    private const val RIGHT_EMAIL = "user@gmail.com"
    private const val RIGHT_PASSWORD = "password123"

    fun login(email: String, password: String): Boolean {
        return email == RIGHT_EMAIL && password == RIGHT_PASSWORD
    }

}