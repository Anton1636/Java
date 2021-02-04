package Utils;

public class Country {
    public String countryName;
    public String capital;
    public String officialLanguages;
    public String areaTotal;
    public String population;
    public String currency;
    public String timeZone;
    public String callingCode;

    public Country(String countryName, String capital, String officialLanguages, String areaTotal, String population, String currency, String timeZone, String callingCode) {
        this.countryName = countryName;
        this.capital = capital;
        this.officialLanguages = officialLanguages;
        this.areaTotal = areaTotal;
        this.population = population;
        this.currency = currency;
        this.timeZone = timeZone;
        this.callingCode = callingCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getOfficialLanguages() {
        return officialLanguages;
    }

    public void setOfficialLanguages(String officialLanguages) {
        this.officialLanguages = officialLanguages;
    }

    public String getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(String areaTotal) {
        this.areaTotal = areaTotal;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getCallingCode() {
        return callingCode;
    }

    public void setCallingCode(String callingCode) {
        this.callingCode = callingCode;
    }
}
