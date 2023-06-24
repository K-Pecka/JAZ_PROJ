package pl.pjwstk.jaz25668nbp.model;


import java.util.List;

public class Nbp {
    private Long id;
    private String code;
    private List<Rate> rates;
    public Nbp(){}

    public Nbp(Long id, String code, List<Rate> rates) {
        this.id = id;
        this.code = code;
        this.rates = rates;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }
}
