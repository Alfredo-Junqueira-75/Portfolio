package org.junqueira.portfolio

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.junqueira.portfolio.component.SkillCard
import org.junqueira.portfolio.data.skillsList
import portfolio.composeapp.generated.resources.Res

private object Skills {
    val skills = skillsList
}
@Composable
fun Skills(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .wrapContentHeight()
            .fillMaxWidth(),

    ) {
        Text(
            text = "Skills & Technologies",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
                .wrapContentHeight()
        )
        FlowRow(
            horizontalArrangement = Arrangement.Center,
            verticalArrangement = Arrangement.spacedBy(space = 8.dp),
            modifier = modifier
                .wrapContentHeight()
                .fillMaxWidth(),

        ) {
            Skills.skills.forEach { skill ->
                Spacer(modifier = Modifier.width(4.dp))
                SkillCard(
                    icon = skill.painter,
                    skillTitle = skill.title,
                    skills = skill.skills
                )
                Spacer(modifier = Modifier.width(4.dp))
            }


        }
    }
}