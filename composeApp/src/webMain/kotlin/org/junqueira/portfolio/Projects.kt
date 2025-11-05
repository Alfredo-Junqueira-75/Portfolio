package org.junqueira.portfolio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.junqueira.portfolio.data.Project
import org.junqueira.portfolio.data.projectsList
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.photo_Editor_Image

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