package org.junqueira.portfolio.utils

fun isValidEmail(email: String): Boolean {
    return email.contains("@") && email.contains(".com")
}