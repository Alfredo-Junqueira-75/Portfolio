package org.junqueira.portfolio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import org.junqueira.portfolio.component.BottomBar
import org.junqueira.portfolio.component.TopBar
import org.junqueira.portfolio.ui.theme.AppTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.icons8_menu_96


@Composable
fun App() {
    var width by remember { mutableStateOf(0.dp) }
    var gestureEnabled by remember { mutableStateOf(true) }
    val lazyListState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    val state = DrawerState(DrawerValue.Closed)
    AppTheme {
        ModalNavigationDrawer(
            gesturesEnabled = gestureEnabled,
            drawerContent = {
                ModalDrawerSheet {
                    Column(
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                            .verticalScroll(state = rememberScrollState())
                    ) {
                        Spacer(Modifier.height(12.dp))
                        Text("Alfredo Junqueira", modifier = Modifier.padding(16.dp), style = MaterialTheme.typography.titleLarge)
                        HorizontalDivider(
                            color = Color.Gray,
                            thickness = 2.dp
                        )

                        NavigationDrawerItem(
                            label = { Text(text = "Projects") },
                            selected = false,
                            onClick = {
                                scrollToTheSection(1, coroutineScope, lazyListState)
                                coroutineScope.launch {state.close()}
                            }

                        )
                        NavigationDrawerItem(
                            label = { Text(text = "Skills") },
                            selected = false,
                            onClick = {
                                scrollToTheSection(2, coroutineScope, lazyListState)
                                coroutineScope.launch {state.close()}
                            }

                        )
                        NavigationDrawerItem(
                            label = { Text(text = "About") },
                            selected = false,
                            onClick = {
                                scrollToTheSection(3, coroutineScope, lazyListState)
                                coroutineScope.launch {state.close()}
                            }

                        )
                        NavigationDrawerItem(
                            label = { Text(text = "Contact") },
                            selected = false,
                            onClick = {
                                scrollToTheSection(4, coroutineScope, lazyListState)
                                coroutineScope.launch {state.close()}
                            }

                        )
                        NavigationDrawerItem(
                            label = { Text(text = "Get in Touch") },
                            selected = false,
                            onClick = {
                                scrollToTheSection(4, coroutineScope, lazyListState)
                                coroutineScope.launch {state.close()}
                            }

                        )

                    }
                }
            },
            drawerState = state,
            modifier = Modifier
        ) {
            Scaffold(
                topBar = {
                    if (width > 600.dp) {
                        TopBar(
                            lazylistState = lazyListState,
                            coroutineScope = coroutineScope,
                            modifier = Modifier
                        )
                        gestureEnabled = false
                    } else {
                        gestureEnabled = true
                    }

                },
                floatingActionButton = {
                    if (width < 600.dp) {
                        FloatingActionButton(
                            containerColor = ButtonDefaults.buttonColors().containerColor,
                            onClick = {
                                coroutineScope.launch {
                                    if (state.isClosed) {
                                        state.open()
                                    } else {
                                        state.close()
                                    }
                                }
                            }
                        ) {
                            Icon(
                                painter = painterResource(Res.drawable.icons8_menu_96),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(48.dp)
                                    .padding(8.dp)
                            )
                        }
                    }
                },
                modifier = Modifier
                    .background(color = MaterialTheme.colorScheme.background)
                    .fillMaxSize(),
            ) { innerPadding ->

                LazyColumn(
                    state = lazyListState,
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize()
                        .onSizeChanged({it ->
                            run {
                                width = it.width.dp
                            }
                        })
                ) {
                    item {
                        Profile(
                            coroutineScope = coroutineScope,
                            lazylistState = lazyListState,
                            modifier = Modifier
                                .padding(innerPadding)
                                .wrapContentHeight()
                                .widthIn(max = 1320.dp)
                                .fillMaxWidth()

                        )
                    }
                    item {
                        Projects(
                            modifier = Modifier
                                .padding(innerPadding)
                                .widthIn(max = 1320.dp)

                        )
                    }
                    item {
                        Skills(
                            modifier = Modifier
                                .padding(innerPadding)
                                .widthIn(max = 1320.dp)
                        )
                    }
                    item {
                        AboutMe(
                            modifier = Modifier
                                .padding(innerPadding)
                                .widthIn(max = 1320.dp)
                        )
                    }
                    item {
                        Contact(
                            modifier = Modifier
                                .padding(innerPadding)
                                .widthIn(max = 1320.dp)
                        )
                    }
                    item {

                        BottomBar(
                            modifier = Modifier
                                .padding(innerPadding)
                                .widthIn(max = 1320.dp)
                        )
                    }
                }
            }
        }
        }
}

fun scrollToTheSection(index: Int, coroutineScope: CoroutineScope, lazyListState: LazyListState) {
    coroutineScope.launch {
        lazyListState.animateScrollToItem(index)
    }
}