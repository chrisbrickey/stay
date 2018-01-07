package stay1;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchAPIController {

    private static final String template = "These are the results for %s:";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/api/search")
    public Search search(@RequestParam(value="city", defaultValue="Barcelona") String city) {
        return new Search(counter.incrementAndGet(),
                String.format(template, city));
    }
}