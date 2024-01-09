import org.springframework.boot.gradle.tasks.bundling.BootJar

apply(plugin = "org.jetbrains.kotlin.plugin.spring")


val jar: Jar by tasks
jar.enabled = false

val bootJar: BootJar by tasks
bootJar.enabled = true


dependencies {
    implementation(project(":trading-domain"))
}
