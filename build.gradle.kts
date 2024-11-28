plugins {
    kotlin("jvm") version "1.9.23"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val exposedVersion: String by project
dependencies {
    testImplementation(kotlin("test"))

    implementation("org.xerial:sqlite-jdbc:3.47.0.0")
    implementation("org.jetbrains.exposed:exposed-core:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-jdbc:$exposedVersion")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}