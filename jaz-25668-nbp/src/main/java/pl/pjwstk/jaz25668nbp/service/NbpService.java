package pl.pjwstk.jaz25668nbp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjwstk.jaz25668nbp.model.Nbp;
import pl.pjwstk.jaz25668nbp.model.NbpEntity;
import pl.pjwstk.jaz25668nbp.repository.NbpRepository;


@Service
public class NbpService {
    public final RestTemplate restTemplate;
    public final RestTemplate nbpRepository;
    public NbpService(RestTemplate restTemplate, NbpRepository nbpRepository) {
        this.restTemplate = restTemplate;
        this.nbpRepository= (RestTemplate) nbpRepository;
    }
    public Nbp getNbp(String code,String start,String end)
    {
        String url = "https://api.nbp.pl/api/exchangerates/rates/a/"+code+"/"+start+"/"+end+"/?format=json";
        Nbp nbp = restTemplate.getForObject(url, Nbp.class);
        return restTemplate.getForObject(url, Nbp.class);
    }
}
