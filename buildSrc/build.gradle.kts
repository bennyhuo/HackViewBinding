plugins {
    `kotlin-dsl`
}

repositories {
    maven("https://mirrors.tencent.com/nexus/repository/maven-public/")
}

dependencies {
    implementation("com.android.tools.build:gradle:7.1.2")
    implementation("com.android.tools.build:gradle-api:7.1.2")

    implementation("androidx.databinding:databinding-compiler-common:7.1.2")
    implementation("org.antlr:antlr4:4.5.3")
    implementation("com.android.tools:annotations:30.1.2")
    implementation("com.google.guava:guava:30.1-jre")
    implementation("com.googlecode.juniversalchardet:juniversalchardet:1.0.3")
    implementation("commons-io:commons-io:2.4")
}