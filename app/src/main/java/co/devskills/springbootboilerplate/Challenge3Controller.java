package co.devskills.springbootboilerplate;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Challenge3Controller {

    @PostMapping("/challenge-3")
    public int implementation(
        @RequestParam("start") int start,
        @RequestParam("end") int end
    ) {
        // Write the code for Challenge 3 here

        return start + end;
    }
}