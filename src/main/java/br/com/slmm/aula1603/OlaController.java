import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OlaController {

    // tela na raiz
    @GetMapping("/ola")
    public String ola() {
	return "Alo Mundo de TI...";
    }


}

