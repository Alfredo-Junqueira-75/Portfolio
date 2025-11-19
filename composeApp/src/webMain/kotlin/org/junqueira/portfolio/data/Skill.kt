package org.junqueira.portfolio.data

import androidx.compose.ui.graphics.painter.Painter
import org.jetbrains.compose.resources.DrawableResource

data class Skill (
    val painter: DrawableResource,
    val title: String,
    val skills: List<String>
)