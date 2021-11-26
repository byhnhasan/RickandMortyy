package com.hsnbyhn.rickandmorty.data.model

/**
 * Created by hasanbayhan on 26.11.2021
 **/

data class Character(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val location: Location,
    val image: String,
    val episode: List<String>,

) {
}