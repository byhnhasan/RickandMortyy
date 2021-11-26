package com.hsnbyhn.rickandmorty.data

/**
 * Created by hasanbayhan on 26.11.2021
 **/
sealed class Result<out T> {
    data class Success<out T>(val value: T): Result<T>()
    data class Error(val error: Exception): Result<Nothing>()
    object Loading: Result<Nothing>()
}