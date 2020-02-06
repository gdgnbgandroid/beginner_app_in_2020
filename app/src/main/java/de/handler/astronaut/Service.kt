package de.handler.astronaut

import kotlinx.coroutines.Deferred
import retrofit2.Call
import retrofit2.http.GET

// http://api.open-notify.org/
interface Service {
    @GET("astros.json")
    suspend fun getAstronauts(): AstronautWrapper
}