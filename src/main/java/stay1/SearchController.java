package stay1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

    @RequestMapping("/search")
    public String greeting(@RequestParam(value="city", required=false, defaultValue="NYC") String city, Model model) {
        model.addAttribute("city", city);
        return "search";
    }

}