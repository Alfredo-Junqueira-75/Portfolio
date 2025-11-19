package org.junqueira.portfolio.component

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun SkillCard(
    icon: DrawableResource,
    skillTitle: String,
    skills: List<String>,
    modifier: Modifier = Modifier
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.inversePrimary.copy(alpha = 0.1f)),
        shape = ShapeDefaults.Medium,
        border = BorderStroke(1.dp, Color.Gray.copy(alpha = 0.4f)),
        modifier = modifier
            .widthIn(max = 380.dp)
            .heightIn(max = 220.dp)


    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp)

        ) {
            Icon(
                painter = painterResource(icon),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .padding(bottom = 8.dp)
            )
            Text(
                text = skillTitle,
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding( vertical = 8.dp)
            )
            FlowRow(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalArrangement = Arrangement.Center,
                maxLines = 2,
                modifier = Modifier
                    .padding(top = 8.dp)
            ) {
                skills.forEachIndexed { _, skill ->
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = skill,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier
                            .background(color = Color.Gray.copy(alpha = 0.4f), shape = ShapeDefaults.Medium)
                            .padding(horizontal = 8.dp, vertical = 4.dp)

                    )
                    Spacer(modifier = Modifier.width(4.dp))
                }
            }

        }
    }
}