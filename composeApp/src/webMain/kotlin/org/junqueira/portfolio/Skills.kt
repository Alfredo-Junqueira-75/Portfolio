package org.junqueira.portfolio

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.junqueira.portfolio.component.SkillCard
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.icons8_phone_32

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
                .wrapContentHeight()
        )
        FlowRow(
            horizontalArrangement = Arrangement.Center,
            verticalArrangement = Arrangement.spacedBy(space = 8.dp),
            modifier = modifier
                .wrapContentHeight()
                .fillMaxWidth(),

        ) {
            repeat(6){
                Spacer(modifier = Modifier.width(4.dp))
                SkillCard(
                    icon = Res.drawable.icons8_phone_32,
                    skillTitle = "category1",
                    skills = listOf("skill1", "skill2", "skill3", "skill4", "skill5", "skill6", "skill7", "skill8"),
                )
                Spacer(modifier = Modifier.width(4.dp))
            }

        }
    }
}