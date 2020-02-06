package de.handler.astronaut

data class AstronautWrapper(
    val people: List<Astronaut>
)

data class Astronaut(
    val name: String,
    val craft: String
)
