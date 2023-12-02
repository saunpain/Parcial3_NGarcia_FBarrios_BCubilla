package parcial3.backend.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import parcial3.backend.Entities.Imagenes;
import parcial3.backend.Services.ImagenesDb;

@RestController
public class ImagenesController {
    
    @GetMapping("/imagenes")
    public List<Imagenes> TodasLasImagenes(){
        return new ImagenesDb().ObtenerTodasLasImagenes();
    }
}
