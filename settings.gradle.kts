rootProject.name = "kotlin-notebook"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        maven("https://cache-redirector.jetbrains.com/plugins.gradle.org/m2")
        maven("https://central.sonatype.com/repository/maven-snapshots/")
        gradlePluginPortal()
        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

include(
    ":core",
    ":tables",
    ":plots",
    ":export:pdf",
    ":buildSystems:gradle",
    ":liveTemplates",
    ":k2",
    ":notekit",
    ":tests:unitTests",
)
