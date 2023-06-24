package pl.pjwstk.jaz25668nbp.model;

public class Rate {
    private String effectiveDate;
    private Double mid;
    public Rate()
    {

    }
    public Rate(String effectiveDate, Double mid) {
        this.effectiveDate = effectiveDate;
        this.mid = mid;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Double getMid() {
        return mid;
    }

    public void setMid(Double mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "effectiveDate='" + effectiveDate + '\'' +
                ", mid=" + mid +
                '}';
    }
}
