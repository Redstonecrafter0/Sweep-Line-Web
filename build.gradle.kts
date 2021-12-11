plugins {
    kotlin("js") version "1.6.0"
}

group = "net.redstonecraft"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven")
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-html:0.7.2")
}

kotlin {
    js {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}
