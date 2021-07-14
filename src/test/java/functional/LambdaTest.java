package functional;

import functional.objects.Person;
import functional.services.DataService;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.IOException;
import java.util.List;


public class LambdaTest {
    @Test
    public void getPeople() throws IOException {
        List<Person> people = DataService.getPeople();
        Assertions.assertThat(people).hasSize(1000);

    }
}
