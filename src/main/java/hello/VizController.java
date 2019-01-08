package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VizController {

    @GetMapping("/map")
    public String map(Model model) {
//        model.addAttribute("name", name);
        return "map";
    }

}