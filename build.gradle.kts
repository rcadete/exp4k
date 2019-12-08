import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript{
    repositories{
        jcenter()
    }
}


plugins {
    kotlin("jvm") version "1.3.61"
}

repositories {
    jcenter()
}

dependencies {
    // kotlin
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    // Junit
    testImplementation("junit:junit:4.12")
}


tasks.withType<Test>{
    useJUnitPlatform()
}


tasks.withType<KotlinCompile>{
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}