package pt.renepont.foo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    
    private static final String template = "Hello, %s!";
    private static AtomicLong counter = new AtomicLong();



    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double greeting(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception{

        Double sum = convertToDouble(numberOne) + convertToDouble(numberTwo);

        return sum;
    }

    private Double convertToDouble(String strNumber) {
        return Double.parseDouble(strNumber);
    }

}
