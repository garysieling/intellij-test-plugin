package com.github.garysieling.intellijtestplugin.services

import com.github.garysieling.intellijtestplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
