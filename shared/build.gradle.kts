group = "com.nagarin.shared"
version = "1.0"

plugins {
	kotlin("multiplatform")
	id("com.android.library")
}

kotlin {
	android()
}

android {
	compileSdkVersion(30)
	sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
	defaultConfig {
		minSdkVersion(28)
		targetSdkVersion(30)
		versionCode = 1
		versionName = "1.0"
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
}
