package com.anup.health

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform