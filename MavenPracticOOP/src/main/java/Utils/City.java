package Utils;

public class City {
    public String cityName;
    public String country;
    public String AreaRank;
    public String TimeZone;
    public String OfficialLanguages;
    public int PopulationEstimate;

    public City() {
    }

    public City(String cityName, String country, String areaRank, String timeZone, String officialLanguages, int populationEstimate) {
        this.cityName = cityName;
        this.country = country;
        AreaRank = areaRank;
        TimeZone = timeZone;
        OfficialLanguages = officialLanguages;
        PopulationEstimate = populationEstimate;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAreaRank() {
        return AreaRank;
    }

    public void setAreaRank(String areaRank) {
        AreaRank = areaRank;
    }

    public String getTimeZone() {
        return TimeZone;
    }

    public void setTimeZone(String timeZone) {
        TimeZone = timeZone;
    }

    public String getOfficialLanguages() {
        return OfficialLanguages;
    }

    public void setOfficialLanguages(String officialLanguages) {
        OfficialLanguages = officialLanguages;
    }

    public int getPopulationEstimate() {
        return PopulationEstimate;
    }

    public void setPopulationEstimate(int populationEstimate) {
        PopulationEstimate = populationEstimate;
    }
}
