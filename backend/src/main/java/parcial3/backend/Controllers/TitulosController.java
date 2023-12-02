package parcial3.backend.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import parcial3.backend.Entities.Titulos;
import parcial3.backend.Services.TitulosDb;

@RestController
public class TitulosController {
    
    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    @GetMapping("/titulos")
    public List<Titulos> TodosLosTitulos(){
        return new TitulosDb().ObtenerTodosLosTitulos();
    }
}
