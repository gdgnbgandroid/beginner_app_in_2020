package de.handler.astronaut

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object DataProvider {
    private val httpClient: OkHttpClient = OkHttpClient.Builder().build()
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("http://api.open-notify.org/")
        .addConverterFactory(MoshiConverterFactory.create())
        .client(httpClient)
        .build()
    private val service: Service = retrofit.create(Service::class.java)

    suspend fun fetchAstronauts(): List<Astronaut> {
        val astronautWrapper = service.getAstronauts()
        return astronautWrapper.people;
    }
}