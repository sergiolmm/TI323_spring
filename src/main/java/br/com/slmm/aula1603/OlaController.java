import org.springframework.boot.*;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/");
public class OlaController {

    // tela na raiz
    @GetMapping("/ola")
    public String home(){
	return "Alo Mundo de TI...";
    }


}

