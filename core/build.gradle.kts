plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.javen.sambabackup.core"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        minSdk = 26
    }
}
