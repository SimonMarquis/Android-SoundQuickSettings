plugins {
    alias(libs.plugins.android.application)
}

val versionMajor = 1
val versionMinor = 1
val versionPatch = 0
val versionBuild = 0

android {
    compileSdk = 37
    defaultConfig {
        applicationId = "fr.smarquis.soundquicksettings"
        namespace = "fr.smarquis.soundquicksettings"
        minSdk = 24
        targetSdk = 37
        versionCode = versionMajor * 10000 + versionMinor * 1000 + versionPatch * 100 + versionBuild
        versionName = "$versionMajor.$versionMinor.$versionPatch"
    }
    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}
