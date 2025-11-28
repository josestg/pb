plugins {
    id("java")
}

group = "com.josestg"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("io.grpc:grpc-core:1.77.0")
    implementation("io.grpc:grpc-protobuf:1.77.0")
    implementation("io.grpc:grpc-stub:1.77.0")
    implementation("com.google.protobuf:protobuf-java:4.33.1")
    implementation("build.buf:protovalidate:1.0.0")
    implementation("com.google.api.grpc:proto-google-common-protos:2.39.0")

}

tasks.test {
    useJUnitPlatform()
}