package csvPractice;

public class Company {
    private String ticker;
    private String company;
    private String sector;

    public Company(String ticker, String company, String sector) {
        this.ticker = ticker;
        this.company = company;
        this.sector = sector;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Company{" +
                "ticker='" + ticker + '\'' +
                ", company='" + company + '\'' +
                ", sector='" + sector + '\'' +
                '}';
    }
}
