package gl51.Movie.service

import gl51.Movie.data.Movie

/**
 * stores movie
 */
// Alt + Enter => implement interface
interface MovieRegistry {
    /**
     * adds a film to favorites
     * @param imdbID the id of the film
     */
    void addMovieToFavorites(String imdbID)

    /**
     * return a list of my movies with their details
     * @return
     */
    List<Movie> listFavorites()
}