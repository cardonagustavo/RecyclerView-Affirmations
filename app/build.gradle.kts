@file:Suppress("UNUSED_EXPRESSION")

plugins {
    id("com.android.application") // Plugin para una aplicación de Android
    id("org.jetbrains.kotlin.android") // Plugin para admitir Kotlin en Android
}

android {
    namespace = "com.example.affirmations" // Namespace de la aplicación
    compileSdk = 34 // Versión del SDK de compilación de Android

    defaultConfig {
        applicationId = "com.example.affirmations" // ID del paquete de la aplicación
        minSdk = 22 // Versión mínima de Android que admite la aplicación
        targetSdk = 34 // Versión de Android a la que se dirige la aplicación
        versionCode = 1 // Código de versión de la aplicación
        versionName = "1.0" // Nombre de versión de la aplicación

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner" // Runner de pruebas de instrumentación
        vectorDrawables {
            useSupportLibrary = true // Habilita el uso de vectores en la aplicación
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false // Deshabilita la minificación en el tipo de compilación "release"
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8 // Configuración de compatibilidad de origen
        targetCompatibility = JavaVersion.VERSION_1_8 // Configuración de compatibilidad de destino
    }
    kotlinOptions {
        jvmTarget = "1.8" // Versión de destino de JVM para Kotlin
    }
    buildFeatures {
        compose = true // Habilita Compose para la interfaz de usuario
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3" // Versión del compilador de Kotlin para Compose
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}" // Excluye ciertos recursos en el empaquetado
        }
    }
}

dependencies {
    // Dependencias del proyecto, incluyendo bibliotecas de AndroidX, Compose, material design, pruebas, Mockito, etc.
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.recyclerview:recyclerview:1.3.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.test.ext:junit-ktx:1.1.5")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
    androidTestImplementation ("androidx.test.espresso:espresso-contrib:3.5.1")
    testImplementation ("org.mockito:mockito-core:3.12.4")

}
