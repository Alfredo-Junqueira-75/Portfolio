package org.junqueira.portfolio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.junqueira.portfolio.ui.theme.AppTheme


@Composable
fun App() {

    AppTheme {
        Scaffold(
            topBar = { TopBar() },
            modifier = Modifier
                .background(color = MaterialTheme.colorScheme.background)
                .padding(horizontal = 220.dp)
                .fillMaxSize(),
        ) { innerPadding ->

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(horizontal = 32.dp)


            ) {
                item {
                    Profile(
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(top = 16.dp)
                            .wrapContentHeight()
                            .fillMaxWidth()

                    )
                }
                item {
                    Projects(
                        modifier = Modifier
                            .padding(innerPadding)

                    )
                }
                item {
                    Skills(
                        modifier = Modifier
                            .padding(innerPadding)
                    )
                }
                item {
                    AboutMe(
                        modifier = Modifier
                            .padding(innerPadding)
                    )
                }
                item {
                    Contact(
                        modifier = Modifier
                            .padding(innerPadding)
                    )
                }
                item {
                    BottomBar(
                        modifier = Modifier
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}
