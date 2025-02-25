package arnaud.projects.org.example.domain.model

class Movie(
    val title: String,
    val duration: Int,
    val genre: String,
    val releaseDate: String,
    val director: String,
    val actors: List<String>,
    val showTimes: List<String>,
    val isComingSoon: Boolean,
    val isNowPlaying: Boolean
)