package cmsc256;

public class ArtInstallation {
    private String agency;
    private String stationName;
    private String line;
    private String artist;
    private String artTitle;
    private int artDate;
    private String artMaterial;
    private String artLink;

    ArtInstallation (String agency, String stationName, String line, String artist, String artTitle, String artDate, String artMaterial, String artLink){
        this.agency = agency;
        this.stationName = stationName;
        this.line = line;
        this.artist = artist;
        this.artTitle = artTitle;
        this.artDate = Integer.parseInt(artDate);
        this.artMaterial = artMaterial;
        this.artLink = artLink;
    }

    ArtInstallation (String agency, String stationName, String line, String artist, String artTitle, int artDate, String artMaterial, String artLink){
        this.agency = agency;
        this.stationName = stationName;
        this.line = line;
        this.artist = artist;
        this.artTitle = artTitle;
        this.artDate = artDate;
        this.artMaterial = artMaterial;
        this.artLink = artLink;
    }

    public String getAgency() {
        return agency;
    }
    public void setAgency(String agency) {
        this.agency = agency;
    }
    public String getStationName() {
        return stationName;
    }
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
    public String getLine() {
        return line;
    }
    public void setLine(String line) {
        this.line = line;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getArtTitle() {
        return artTitle;
    }
    public void setArtTitle(String artTitle) {
        this.artTitle = artTitle;
    }
    public int getArtDate() {
        return artDate;
    }
    public void setArtDate(int artDate) {
        this.artDate = artDate;
    }
    public String getArtMaterial() {
        return artMaterial;
    }
    public void setArtMaterial(String artMaterial) {
        this.artMaterial = artMaterial;
    }
    public String getArtLink() {
        return artLink;
    }
    public void setArtLink(String artLink) {
        this.artLink = artLink;
    }

    public String toString(){
        return ("Agency: " + agency + ", Station Name: " + stationName + ", Line: " + line + ", Artist: " + artist + ", Art Title: " + artTitle + ", Art Data: " + artDate + ", Art Material: " + artMaterial + ", Art Link: " + artLink);
    }

}
