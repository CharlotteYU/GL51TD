package gl51.Movie.service

import gl51.Movie.data.Movie

/**
 * get movie details from internet
 */
interface MovieClient {
    /**
     * get a movie details from the internet
     * @param imdbID
     * @return
     */
    Movie getMovieDetail(String imdbID)
}