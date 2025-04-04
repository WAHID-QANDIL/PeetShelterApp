package org.wahid.github.peet_shelter_app

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
    override fun getKtor() {
        TODO("Not yet implemented")
    }
}

actual fun getPlatform(): Platform = IOSPlatform()