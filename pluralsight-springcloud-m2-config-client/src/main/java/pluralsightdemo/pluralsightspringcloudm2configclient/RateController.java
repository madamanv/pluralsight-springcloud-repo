package pluralsightdemo.pluralsightspringcloudm2configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/rateservice")
public class RateController {

    @Value("${rate}")
    String rate;

    @Value("${lanecount}")
    String lanecount;

    @Value("${tollstart}")
    String tollstart;

    @RequestMapping(value = "/rate", method = RequestMethod.GET)
    public ResponseEntity<?> getRate(){
        Map<String,String> rates = new HashMap<String,String>();
        rates.put("rate", rate);
        rates.put("lanecount", lanecount);
        rates.put("tollstart", tollstart);
        return ResponseEntity.ok(rates);
    }
}
