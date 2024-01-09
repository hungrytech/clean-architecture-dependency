import org.springframework.boot.gradle.tasks.bundling.BootJar


val jar: Jar by tasks
jar.enabled = true

val bootJar: BootJar by tasks
bootJar.enabled = false
