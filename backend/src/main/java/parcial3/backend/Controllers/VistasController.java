package parcial3.backend.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import parcial3.backend.Services.VistasDb;
import parcial3.backend.Entities.nav;
import parcial3.backend.Entities.Vista2;
import parcial3.backend.Entities.Vista3;
import parcial3.backend.Entities.Vista4;
import parcial3.backend.Entities.Vista5;
import parcial3.backend.Entities.Vista6;
import parcial3.backend.Entities.Vista7;
import parcial3.backend.Entities.Vista8;
import parcial3.backend.Entities.Vista9;
import parcial3.backend.Entities.Vista10;


@RestController
public class VistasController {
    
    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    @GetMapping("/nav")
    public List<nav> ObtenerVistaNav(){
        return new VistasDb().ObtenerVistaNav();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    @GetMapping("/vista2")
    public List<Vista2> ObtenerVista2(){
        return new VistasDb().ObtenerVista2();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    @GetMapping("/vista3")
    public List<Vista3> ObtenerVista3(){
        return new VistasDb().ObtenerVista3();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    @GetMapping("/vista4")
    public List<Vista4> ObtenerVista4(){
        return new VistasDb().ObtenerVista4();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    @GetMapping("/vista5")
    public List<Vista5> ObtenerVista5(){
        return new VistasDb().ObtenerVista5();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    @GetMapping("/vista6")
    public List<Vista6> ObtenerVista6(){
        return new VistasDb().ObtenerVista6();
    }

    //parte de Brian
    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    @GetMapping("/vista7")
    public List<Vista7> ObtenerVista7(){
        return new VistasDb().ObtenerVista7();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    @GetMapping("/vista8")
    public List<Vista8> ObtenerVista8(){
        return new VistasDb().ObtenerVista8();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    @GetMapping("/vista9")
    public List<Vista9> ObtenerVista9(){
        return new VistasDb().ObtenerVista9();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    @GetMapping("/vista10")
    public List<Vista10> ObtenerVista10(){
        return new VistasDb().ObtenerVista10();
    }
}
