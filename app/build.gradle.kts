plugins {
    id("com.android.application")
    kotlin("android")
}

val versionMajor = 1
val versionMinor = 0
val versionPatch = 6
val versionBuild = 0

android {
    compileSdk = 35
    defaultConfig {
        applicationId = "fr.smarquis.soundquicksettings"
        namespace = "fr.smarquis.soundquicksettings"
        minSdk = 24
        targetSdk = 35
        versionCode = versionMajor * 10000 + versionMinor * 1000 + versionPatch * 100 + versionBuild
        versionName = "$versionMajor.$versionMinor.$versionPatch"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}
