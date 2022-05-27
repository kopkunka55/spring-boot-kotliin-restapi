import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.ir.backend.js.compile

plugins {
	id("org.springframework.boot") version "2.7.0"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.6.21"
	kotlin("plugin.spring") version "1.6.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web:2.6.7")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.3")
	implementation("org.jetbrains.kotlin:kotlin-reflect:1.6.21")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.21")
	implementation("org.springframework.boot:spring-boot-starter-data-jdbc:2.6.7")
	runtimeOnly("org.postgresql:postgresql:42.3.6")
	testImplementation("io.mockk:mockk:1.12.4")
	implementation("org.springframework.boot:spring-boot-starter-test:2.6.7")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}


