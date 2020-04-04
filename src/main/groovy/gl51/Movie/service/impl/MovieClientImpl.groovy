package gl51.Movie.service.impl

import gl51.Movie.data.Movie
import gl51.Movie.service.MovieClient

import javax.inject.Singleton

@Singleton
class MovieClientImpl implements MovieClient {
    @Override
    Movie getMovieDetail(String imdbID) {
        return null
    }
}
