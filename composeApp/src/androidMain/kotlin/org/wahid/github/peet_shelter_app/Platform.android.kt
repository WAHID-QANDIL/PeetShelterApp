package org.wahid.github.peet_shelter_app

import android.os.Build

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
    override fun getKtor() {
        TODO("Not yet implemented")
    }
}

actual fun getPlatform(): Platform = AndroidPlatform()