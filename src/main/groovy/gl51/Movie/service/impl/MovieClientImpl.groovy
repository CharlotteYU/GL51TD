package gl51.Movie.service.impl

import gl51.Movie.data.Movie
import javax.inject.Singleton

@Singleton
class MovieClientImpl implements gl51.Movie.service.MovieClient {
    @Override
    Movie getMovieDetail(String imdbID) {
        return new Movie(imdbID: imdbID)
    }
}
