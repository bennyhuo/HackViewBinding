pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://mirrors.tencent.com/nexus/repository/maven-public/")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven("https://mirrors.tencent.com/nexus/repository/maven-public/")
    }
}

include(":app")
