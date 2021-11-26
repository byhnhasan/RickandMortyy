package com.hsnbyhn.rickandmorty.data.model

/**
 * Created by hasanbayhan on 26.11.2021
 **/
data class CharacterResponse(
    val info: ApiInfo,
    val results: List<Character>
)
