package parcial3.backend.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import parcial3.backend.Entities.Texto;
import parcial3.backend.Services.TextoDb;

@RestController
public class TextoController {
    
    @GetMapping("/texto")
    public List<Texto> TodosLosTextos(){
        return new TextoDb().ObtenerTodosLosTextos();
    }
}
