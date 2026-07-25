plugins {
    id("com.android.application")
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
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlin {
        compilerOptions.jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11)
    }
}
