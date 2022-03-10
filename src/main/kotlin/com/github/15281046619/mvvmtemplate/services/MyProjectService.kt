package com.github.15281046619.mvvmtemplate.services

import com.intellij.openapi.project.Project
import com.github.15281046619.mvvmtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
