package com.example.visualnovel

import kotlinx.serialization.Serializable

@Serializable
data class Screen(
    val id: Int,
    val header: String,
    val ArrayOfVariants: List<Variant>
)

@Serializable
data class Variant(
    val nextId: Int,
    val varintText: String
)

@Serializable
data class ArrayOfScreens(
    val arrayOfScreens: List<Screen>
)
