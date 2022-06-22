package at.technikum.datetime;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;

@RestController
public class DateTime {
    @RequestMapping("/api/today")
    public LocalDate date (){
        LocalDate d = LocalDate.now();
        return d;
    }

        @RequestMapping("/api/now")
        public LocalTime time (){
            LocalTime t = LocalTime.now();
            return t;
        }
}
