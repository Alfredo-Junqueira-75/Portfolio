package org.junqueira.portfolio.data

import org.junqueira.portfolio.Skills
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.food_delivery_image
import portfolio.composeapp.generated.resources.icons8_code_50
import portfolio.composeapp.generated.resources.icons8_database_50
import portfolio.composeapp.generated.resources.icons8_experiment_50
import portfolio.composeapp.generated.resources.icons8_github_48
import portfolio.composeapp.generated.resources.icons8_layers_48
import portfolio.composeapp.generated.resources.icons8_smartphone_50
import portfolio.composeapp.generated.resources.icons8_thunder_48
import portfolio.composeapp.generated.resources.photo_editor_image
import portfolio.composeapp.generated.resources.portfolio_image
import portfolio.composeapp.generated.resources.travel_blog_image
import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.js


@OptIn(ExperimentalWasmJsInterop::class)
val projectsList = listOf(
         Project(
             name = "Portfolio",
             description = "Design and development project created to strengthen my professional online presence.",
             image = Res.drawable.portfolio_image ,
             tags = listOf("Kotlin", "Jetpack Compose", "coroutines", "Kotlin Multiplatform", "Compose Multiplatform", "Material Design"),
             openGithub = { js("window.open('https://github.com/Alfredo-Junqueira-75/Portfolio', '_blank')") },
             demoUrl = "TODO()",
             isLast = true
         ),
         Project(
            name = "Photo Editor1",
            description = "A minimal photo editing app focused on usability — pick a photo, experiment with filters, and save your creation in seconds.",
            image = Res.drawable.photo_editor_image ,
            tags = listOf("Kotlin", "Android", "XML", "Coroutines", "MediaStore", "Bitmap"),
             openGithub = { js("window.open('https://github.com/Alfredo-Junqueira-75/Photo_Editor', '_blank')") },
            demoUrl = "TODO()",
            isLast = false
        ),
         Project(
             name = "Travel Blog",
             description = "A minimal photo editing app focused on usability — pick a photo, experiment with filters, and save your creation in seconds.",
             image = Res.drawable.travel_blog_image ,
             tags = listOf("Java", "Android", "XML", "OkHttp", "Room", "SharedPreferences", "Material Design", "Glide"),
             openGithub = { js("window.open('', '_blank')") },
             demoUrl = "TODO()",
             isLast = false
         ),
         Project(
             name = "Food Delivery",
             description = "Native delivery app for Android, built with Kotlin and Firebase. Allows you to browse menus, place orders, and track everything in real time.",
             image = Res.drawable.food_delivery_image ,
             tags = listOf("Kotlin", "Android", "Jetpack Compose", "Firebase Auth", "Firebase Realtime DB", "Firebase Firestore", "SharedPreferences"),
             openGithub = { js("window.open('https://github.com/Alfredo-Junqueira-75/Food_Delivery_App', '_blank')") },
             demoUrl = "TODO()",
             isLast = false
         ),

    )

val skillsList = listOf(
    Skill(
        painter = Res.drawable.icons8_smartphone_50,
        title = "Android Development",
        skills = listOf("Kotlin", "Java", "Jetpack Compose", "XML Layouts"),
    ),
    Skill(
        painter = Res.drawable.icons8_layers_48,
        title = "Architecture",
        skills = listOf("MVVM", "Clean Architecture", "MVC", "Repository Pattern"),
    ),
    Skill(
        painter = Res.drawable.icons8_database_50,
        title = "Database & Backend",
        skills = listOf("SQL", "SQLITE", "Room", "Retrofit", "Okhttp", "Firebase", "Rest APIs"),
    ),
    Skill(
        painter = Res.drawable.icons8_thunder_48,
        title = "Modern Tools",
        skills = listOf("Kotlin Coroutines", "Kotlin Multiplatform"),
    ),
    Skill(
        painter = Res.drawable.icons8_experiment_50,
        title = "Testing",
        skills = listOf("TDD", "JUnit", "Espresso", "Mockito", "UI Testing"),
    ),
    Skill(
        painter = Res.drawable.icons8_code_50,
        title = "Additional Skills",
        skills = listOf("Git & Github", "Agile", "Postman", "Material Design"),
    )
)
