group = "com.nagarin.androidApp"
version = "1.0"

val kotlinVersion = "1.4.21"
val composeVersion = "1.0.0-alpha08"
val arrowVersion = "0.11.0"

plugins {
	id("com.android.application")
	kotlin("android")
	kotlin("kapt")
}

android {
	compileSdkVersion(30)
	defaultConfig {
		applicationId = "com.nagarin.baseproject"
		minSdkVersion(28)
		targetSdkVersion(30)
		versionCode = 1
		versionName = "1.0"
		manifestPlaceholders["appName"] = "Base Project"
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
	kotlinOptions {
		jvmTarget = "1.8"
		useIR = true
	}
	buildFeatures {
		compose = true
	}
	composeOptions {
		kotlinCompilerExtensionVersion = composeVersion
		kotlinCompilerVersion = kotlinVersion
	}
}

dependencies {
	implementation(project(":shared"))
	implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
	implementation("androidx.core:core-ktx:1.3.2")
	implementation("androidx.appcompat:appcompat:1.2.0")
	implementation("com.google.android.material:material:1.2.1")
	implementation("androidx.compose.ui:ui:$composeVersion")
	implementation("androidx.compose.material:material:$composeVersion")
	implementation("androidx.compose.ui:ui-tooling:$composeVersion")
	implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.0-rc01")
	implementation("io.arrow-kt:arrow-fx:$arrowVersion")
	implementation("io.arrow-kt:arrow-optics:$arrowVersion")
	implementation("io.arrow-kt:arrow-syntax:$arrowVersion")
	kapt("io.arrow-kt:arrow-meta:$arrowVersion")
}
