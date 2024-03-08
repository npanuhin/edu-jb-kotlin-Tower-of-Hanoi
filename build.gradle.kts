import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

group = "me.npanuhin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

//tasks.test {
//    useJUnitPlatform()
//}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "21"
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}

application {
    mainClass = "MainKt"
}
