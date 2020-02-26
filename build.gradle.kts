plugins {
    id ("org.jetbrains.kotlin.multiplatform") version "1.3.61"
    `maven-publish`
}

repositories {
    mavenCentral()
}

group = "com.example"
version = "0.0.1"

kotlin {
    jvm()
    js {
        browser {}
        nodejs {}
    }
    sourceSets {
        commonMain {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        named("jvmMain") {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
            }
        }
        named("jvmTest") {
            dependencies {
                implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
            }
        }
        named("jsMain") {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
        named("jsTest") {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}