pluginManagement {
    repositories {
        mavenLocal()
        maven(url = "https://mirrors.huaweicloud.com/repository/maven")
        gradlePluginPortal()
        mavenCentral()
        jcenter()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
    }
}
rootProject.name = "mirai-hello-world"