package pl.pjwstk.jaz25668nbp.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjwstk.jaz25668nbp.model.Nbp;
import pl.pjwstk.jaz25668nbp.service.NbpService;

@RestController
@RequestMapping("/")
public class NbpController {
    private final NbpService nbpService;

    public NbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }
    @GetMapping("/{code}/{start}/{end}")
    public ResponseEntity<Nbp> getMovieById(@PathVariable("code") String code,@PathVariable("start") String start,@PathVariable("end") String end) {
        return ResponseEntity.ok(nbpService.getNbp(code,start,end));
    }
}
