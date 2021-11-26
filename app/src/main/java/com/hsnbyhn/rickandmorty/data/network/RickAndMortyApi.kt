package com.hsnbyhn.rickandmorty.data.network

import com.hsnbyhn.rickandmorty.data.Result
import com.hsnbyhn.rickandmorty.data.model.CharacterResponse
import retrofit2.http.GET

/**
 * Created by hasanbayhan on 26.11.2021
 **/

interface RickAndMortyApi {

    @GET
    suspend fun fetchCharacters(): Result<CharacterResponse>

}