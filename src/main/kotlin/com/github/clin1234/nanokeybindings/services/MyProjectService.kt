package com.github.clin1234.nanokeybindings.services

import com.intellij.openapi.project.Project
import com.github.clin1234.nanokeybindings.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
