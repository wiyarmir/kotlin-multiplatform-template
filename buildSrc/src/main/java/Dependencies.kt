object Versions {
    const val androidGradlePlugin = "3.3.0"
    const val detekt = "1.0.0-RC14"
    const val ehcache = "3.6.1"
    const val fuel = "1.11.0"
    const val gson = "2.8.0"
    const val html = "0.6.9"
    const val jsoup = "1.9.1"
    const val junit = "4.12"
    const val kotlin = "1.3.41"
    const val react = "16.8.6"
    const val kotlinFrontendPlugin = "0.0.45"
    const val kotlinJsExt = "1.0.1-pre.79-kotlin-1.3.41"
    const val kotlinWrapper = "$react-pre.79-kotlin-1.3.41"
    const val kotlinxCoroutines = "1.2.1"
    const val ktor = "1.2.2"
    const val logback = "1.2.1"
    const val node = "10.13.0"
    const val mockitoKotlin = "2.1.0"
    const val serialization = "0.11.1"
    const val squash = "0.2.4"
    const val reactRouterDom = "4.3.1"
    const val kotlinReactRouterDom = "$reactRouterDom-pre.79-kotlin-1.3.41"
    const val okhttp = "4.0.1"
}

object Libs {
    const val appcompat = "androidx.appcompat:appcompat:1.0.2"
    const val cardview = "androidx.cardview:cardview:1.0.0"
    const val recyclerview = "androidx.recyclerview:recyclerview:1.0.0"
    const val material = "com.google.android.material:material:1.0.0"
    const val constraintlayout = "com.android.support.constraint:constraint-layout:1.1.3"

    const val ehcache = "org.ehcache:ehcache:${Versions.ehcache}"
    const val fuel = "com.github.kittinunf.fuel:fuel:${Versions.fuel}"
    const val jsoup = "org.jsoup:jsoup:${Versions.jsoup}"
    const val junit = "junit:junit:${Versions.junit}"

    const val kotlinExtensions = "org.jetbrains:kotlin-extensions:${Versions.kotlinJsExt}"
    const val kotlinReact = "org.jetbrains:kotlin-react:${Versions.kotlinWrapper}"
    const val kotlinReactDom = "org.jetbrains:kotlin-react-dom:${Versions.kotlinWrapper}"
    const val kotlinReactRouterDom = "org.jetbrains:kotlin-react-router-dom:${Versions.kotlinReactRouterDom}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"

    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val kotlinStdlibCommon = "org.jetbrains.kotlin:kotlin-stdlib-common:${Versions.kotlin}"
    const val kotlinStdlibJs = "org.jetbrains.kotlin:kotlin-stdlib-js:${Versions.kotlin}"

    const val kotlinTest = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
    const val kotlinTestCommon = "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlin}"
    const val kotlinTestJs = "org.jetbrains.kotlin:kotlin-test-js:${Versions.kotlin}"
    const val kotlinTestJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"

    const val kotlinxCoroutinesCoreCommon =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${Versions.kotlinxCoroutines}"
    const val kotlinxCoroutinesCoreJs = "org.jetbrains.kotlinx:kotlinx-coroutines-core-js:${Versions.kotlinxCoroutines}"
    const val kotlinxCoroutinesCoreNative =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core-native:${Versions.kotlinxCoroutines}"
    const val kotlinxCoroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinxCoroutines}"
    const val kotlinxCoroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinxCoroutines}"

    const val kotlinxHtmlJs = "org.jetbrains.kotlinx:kotlinx-html-js:${Versions.html}"

    const val kotlinxSerializationRuntime =
        "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.serialization}"
    const val kotlinxSerializationRuntimeCommon =
        "org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${Versions.serialization}"
    const val kotlinxSerializationRuntimeJs =
        "org.jetbrains.kotlinx:kotlinx-serialization-runtime-js:${Versions.serialization}"
    const val kotlinxSerializationRuntimeNative =
        "org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:${Versions.serialization}"

    const val kaml = "com.charleskorn.kaml:kaml:0.11.0"

    const val ktorAuthJwt = "io.ktor:ktor-auth-jwt:${Versions.ktor}"
    const val ktorFreemaker = "io.ktor:ktor-freemarker:${Versions.ktor}"
    const val ktorHtmlBuilder = "io.ktor:ktor-html-builder:${Versions.ktor}"
    const val ktorLocations = "io.ktor:ktor-locations:${Versions.ktor}"
    const val ktorServerNetty = "io.ktor:ktor-server-netty:${Versions.ktor}"
    const val ktorServerTestHost = "io.ktor:ktor-server-test-host:${Versions.ktor}"

    const val ktorClientAuth = "io.ktor:ktor-client-auth:${Versions.ktor}"
    const val ktorClientJson = "io.ktor:ktor-client-json:${Versions.ktor}"
    const val ktorClientJsonJvm = "io.ktor:ktor-client-json-jvm:${Versions.ktor}"
    const val ktorClientJsonJs = "io.ktor:ktor-client-json-js:${Versions.ktor}"
    const val ktorClientJsonNative = "io.ktor:ktor-client-json-native:${Versions.ktor}"
    const val ktorClientSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
    const val ktorClientSerializationJs = "io.ktor:ktor-client-serialization-js:${Versions.ktor}"
    const val ktorClientSerializationNative = "io.ktor:ktor-client-serialization-native:${Versions.ktor}"
    const val ktorClientSerializationJvm = "io.ktor:ktor-client-serialization-jvm:${Versions.ktor}"
    const val ktorClientCore = "io.ktor:ktor-client-core:${Versions.ktor}"
    const val ktorClientAndroid = "io.ktor:ktor-client-android:${Versions.ktor}"
    const val ktorClientIos = "io.ktor:ktor-client-ios:${Versions.ktor}"
    const val ktorClientJs = "io.ktor:ktor-client-js:${Versions.ktor}"
    const val ktorClientLogging = "io.ktor:ktor-client-logging:${Versions.ktor}"
    const val ktorClientLoggingJvm = "io.ktor:ktor-client-logging-jvm:${Versions.ktor}"
    const val ktorClientLoggingJs = "io.ktor:ktor-client-logging-js:${Versions.ktor}"
    const val ktorClientLoggingNative = "io.ktor:ktor-client-logging-native:${Versions.ktor}"
    const val ktorClientOkHttp = "io.ktor:ktor-client-okhttp:${Versions.ktor}"

    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.okhttp}"

    const val slf4jApi = "org.slf4j:slf4j-api:1.7.25"
    const val slf4jAndroid = "uk.uuid.slf4j:slf4j-android:1.7.25-1"

    const val logbackClassic = "ch.qos.logback:logback-classic:${Versions.logback}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"
    const val squashH2 = "org.jetbrains.squash:squash-h2:${Versions.squash}"
}
