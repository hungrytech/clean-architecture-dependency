import org.springframework.boot.gradle.tasks.bundling.BootJar

apply(plugin = "org.jetbrains.kotlin.plugin.spring")


val jar: Jar by tasks
jar.enabled = true

val bootJar: BootJar by tasks
bootJar.enabled = false


dependencies {
    implementation(project(":trading-domain"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    runtimeOnly("com.h2database:h2")
}
