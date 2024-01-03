plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")
}

android {
    namespace = "com.example.ubergoogle"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.ubergoogle"
        minSdk = 26
        targetSdk = 33
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
    buildFeatures {
        viewBinding = true
        buildConfig = true

    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-auth:22.3.0")
    implementation("com.google.firebase:firebase-database:20.3.0")
    implementation("com.google.firebase:firebase-core:21.1.1")
    implementation("com.google.android.gms:play-services-maps:17.0.1")
    implementation("com.google.firebase:firebase-auth:22.3.0")

    implementation("com.google.firebase:firebase-storage:20.3.0")

    implementation("com.google.android.gms:play-services-location:21.0.1")

    implementation ("com.github.bumptech.glide:glide:4.16.0")
    //implementation ("com.android.support:design:28.0.0")

    // Full GeoFire library for Realtime Database users
    implementation ("com.firebase:geofire-android:3.2.0")

    // GeoFire utililty functions for Cloud Firestore users who
    // want to implement their own geo solution, see:
    // https://firebase.google.com/docs/firestore/solutions/geoqueries
    implementation ("com.firebase:geofire-android-common:3.2.0")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}