package gl51.Movie.service.impl

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class MovieClientImplTest extends Specification {
    @Inject
    MovieClientImpl client

    void "should get the info of a movie"() {
        expect:
        client.getMovieDetail() != null
    }
}
