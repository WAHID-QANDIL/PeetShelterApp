package org.wahid.github.peet_shelter_app

interface Platform {
    val name: String
    fun getKtor()
}

expect fun getPlatform(): Platform