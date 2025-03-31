package org.wahid.github.peet_shelter_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform