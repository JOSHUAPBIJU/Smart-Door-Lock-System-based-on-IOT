plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.smartdoor"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.smartdoor"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    // Existing dependencies
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // OkHttp dependency (Kotlin DSL syntax)
    implementation("com.squareup.okhttp3:okhttp:4.9.3")

    // Optional: Gson for JSON parsing
    implementation("com.google.code.gson:gson:2.8.9")
    implementation ("androidx.cardview:cardview:1.0.0")


}
