package com.example.praktek;

public class praktek {
    plugins {
        id &#39;com.android.application&#39;
        id &#39;kotlin-android&#39;
        id &#39;kotlin-android-extensions&#39;
        id &#39;kotlin-kapt&#39;
    }
    android {
        compileSdk 31
        defaultConfig {
            applicationId &quot;studio.afandi.crudroomapp&quot;
            minSdk 21
            targetSdk 31
            versionCode 1
            versionName &quot;1.0&quot;
            testInstrumentationRunner &quot;androidx.test.runner.AndroidJUnitRunner&quot;
        }
        buildTypes {
            release {
                minifyEnabled false
                proguardFiles getDefaultProguardFile(&#39;proguard-android-
                        optimize.txt&#39;), &#39;proguard-rules.pro&#39;
            }
        }
        compileOptions {
            sourceCompatibility JavaVersion.VERSION_1_8
            targetCompatibility JavaVersion.VERSION_1_8
        }
        kotlinOptions {

            jvmTarget = &#39;1.8&#39;
        }
        buildFeatures {
            viewBinding true
        }
    }
    dependencies {
        implementation &#39;androidx.core:core-ktx:1.7.0&#39;
        implementation &#39;androidx.appcompat:appcompat:1.4.1&#39;
        implementation &#39;com.google.android.material:material:1.4.0&#39;
        implementation &#39;androidx.constraintlayout:constraintlayout:2.1.2&#39;
        testImplementation &#39;junit:junit:&#39;
        androidTestImplementation &#39;androidx.test.ext:junit:1.1.3&#39;
        androidTestImplementation &#39;androidx.test.espresso:espresso-core:3.4.0&#39;
// install room
        implementation &quot;androidx.room:room-runtime:2.4.1&quot;
        kapt &quot;androidx.room:room-compiler:2.4.1&quot;
// install coroutines
        implementation &quot;androidx.room:room-ktx:2.4.1&quot;
        implementation &quot;org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2&quot;
    }
}
