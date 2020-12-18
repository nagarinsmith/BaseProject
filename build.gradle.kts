group = "com.nagarin"
version = "1.0"

buildscript {

	val kotlinVersion = "1.4.21"
	val gradleVersion = "7.0.0-alpha02"

	repositories {
		gradlePluginPortal()
		jcenter()
		google()
		mavenCentral()
	}

	dependencies {
		classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
		classpath("com.android.tools.build:gradle:$gradleVersion")
	}
}

allprojects {
	repositories {
		google()
		jcenter()
		mavenCentral()
	}
}

tasks.register("clean", Delete::class) {
	delete(rootProject.buildDir)
}
