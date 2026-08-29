plugins {
    kotlin("jvm") version "2.3.21"
}

group = "group.bifrost"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.KarbonGroup:Bifrost:1.0.0")
}

kotlin {
    jvmToolchain(25)
}

tasks.test {
    useJUnitPlatform()
}