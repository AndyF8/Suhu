
package praktikum.java.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author acer
 */

@Controller
public class ProjectController {
    
    
    @RequestMapping("/Suhu")
    @ResponseBody
    public String FarenheitCelcius(){
        int Farenheit = 98;
        int result = (int) ((5.0/9)*(Farenheit-32));
        return " Farenheit = " + Farenheit + "Hasil ke celcius = " + result;
                
    }
   
}
