package org.junqueira.portfolio

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.junqueira.portfolio.component.ProjectCard
import org.junqueira.portfolio.data.projectsList

private val projects = projectsList
@Composable
fun Projects(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        Text(
            text = "Projects",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(vertical = 16.dp)
        )
        projectsList.forEach { project ->
            ProjectCard(project, Modifier.padding(vertical = 8.dp))
        }
    }
}