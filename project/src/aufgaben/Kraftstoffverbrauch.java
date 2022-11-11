package aufgaben;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Kraftstoffverbrauch {
    private LocalDate datum;
    private BigDecimal getankt;
    private BigDecimal preisProLiter;
    private BigDecimal gefahren;

    public Kraftstoffverbrauch(LocalDate datum, BigDecimal getankt, BigDecimal preisProLiter, BigDecimal gefahren) {
        this.datum = datum;
        this.getankt = getankt.setScale(2, RoundingMode.HALF_UP);
        this.preisProLiter = preisProLiter.setScale(2, RoundingMode.HALF_UP);
        this.gefahren = gefahren.setScale(2, RoundingMode.HALF_UP);
    }

    public Kraftstoffverbrauch(BigDecimal getankt, BigDecimal preisProLiter, BigDecimal gefahren) {
        this.datum = LocalDate.now();
        this.getankt = getankt.setScale(2, RoundingMode.HALF_UP);
        this.preisProLiter = preisProLiter.setScale(2, RoundingMode.HALF_UP);
        this.gefahren = gefahren.setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return "Kraftstoffverbrauch{" +
                "datum = " + datum.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                ", getankt = " + getankt +
                ", preisProLiter = " + preisProLiter +
                ", gefahren = " + gefahren +
                '}';
    }

    public BigDecimal durchschnitt() {
        return getankt.divide(
                        gefahren.divide(
                                new BigDecimal("100"),
                                RoundingMode.HALF_UP
                        ),
                        RoundingMode.HALF_UP)
                .setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal durchschnitt(BigDecimal scaling) {
        return getankt.divide(
                        gefahren.divide(
                                scaling,
                                RoundingMode.HALF_UP),
                        RoundingMode.HALF_UP)
                .setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal krafstoffkostenPro100() {
        return (preisProLiter.multiply(getankt)).divide(
                        gefahren.divide(
                                new BigDecimal("100"),
                                RoundingMode.HALF_UP),
                        RoundingMode.HALF_UP)
                .setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal krafstoffkostenPro100(BigDecimal scaling) {
        return (preisProLiter.multiply(getankt)).divide(
                        gefahren.divide(
                                scaling,
                                RoundingMode.HALF_UP),
                        RoundingMode.HALF_UP)
                .setScale(2, RoundingMode.HALF_UP);
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public BigDecimal getGetankt() {
        return getankt;
    }

    public void setGetankt(BigDecimal getankt) {
        this.getankt = getankt;
    }

    public BigDecimal getPreisProLiter() {
        return preisProLiter;
    }

    public void setPreisProLiter(BigDecimal preisProLiter) {
        this.preisProLiter = preisProLiter;
    }

    public BigDecimal getGefahren() {
        return gefahren;
    }

    public void setGefahren(BigDecimal gefahren) {
        this.gefahren = gefahren;
    }
}
