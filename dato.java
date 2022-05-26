/** */

public class dato {

    private String station;
    private String name;
    private String date;
    private double PRCP;
    private double Tavg;
    private double Tmax;
    private double Tmin;

    public dato() {

    }

    public dato(String station, String name, String date, double PRCP, double Tavg, double Tmax, double Tmin) {
        this.station = station;
        this.name = name;
        this.date = date;
        this.PRCP = PRCP;
        this.Tavg = Tavg;
        this.Tmax = Tmax;
        this.Tmin = Tmin;
    }

    public String getStation() {
        return this.station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getPRCP() {
        return this.PRCP;
    }

    public void setPRCP(Double PRCP) {
        this.PRCP = PRCP;
    }

    public double getTavg() {
        return this.Tavg;
    }

    public void setTavg(double Tavg) {
        this.Tavg = Tavg;
    }

    public double getTmax() {
        return this.Tmax;
    }

    public void setTmax(double Tmax) {
        this.Tmax = Tmax;
    }

    public double getTmin() {
        return this.Tmin;
    }

    public void setTmin(double Tmin) {
        this.Tmin = Tmin;
    }

}