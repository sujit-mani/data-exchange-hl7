/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://imagehub.cdc.gov/repository/maven-ede-group/")
    }

    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    api("gov.nist:hl7-v2-parser:1.6.3")
    api("gov.nist:hl7-v2-profile:1.6.3")
    api("gov.nist:hl7-v2-validation:1.6.3")
    api("com.google.code.gson:gson:2.10.1")
    api("org.jetbrains.kotlin:kotlin-stdlib:1.7.20")
    api("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    api("org.slf4j:slf4j-api:2.0.5")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.7.20")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.0")
}

group = "gov.cdc.dex"
version = "1.3.5-SNAPSHOT"
description = "lib-nist-validator"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}
