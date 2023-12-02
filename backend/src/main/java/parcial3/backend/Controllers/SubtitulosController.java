package parcial3.backend.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import parcial3.backend.Entities.Subtitulos;
import parcial3.backend.Services.SubtitulosDb;

@RestController
public class SubtitulosController {
    
    @GetMapping("/subtitulos")
    public List<Subtitulos> TodosLosSubtitulos(){
        return new SubtitulosDb().ObtenerTodosLosSubtitulos();
    }
}
