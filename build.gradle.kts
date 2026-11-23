plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.vibex.entertainment"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.vibex.entertainment"
        minSdk = 23
        targetSdk = 28
        versionCode = 1
        versionName = "1.0"
    }
}
