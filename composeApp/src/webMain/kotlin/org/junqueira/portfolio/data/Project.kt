package org.junqueira.portfolio.data

import org.jetbrains.compose.resources.DrawableResource

data class Project(
    val name: String = "",
    val description: String = "",
    val image: DrawableResource,
    val tags: List<String>,
    val githubUrl: String,
    val demoUrl: String,
    val isLast: Boolean = false,
)