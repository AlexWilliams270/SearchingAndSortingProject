package cmsc256;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyMTARtCatalogAnalyzer implements MTARtCatalogAnalyzer {
    private List <ArtInstallation> catalog = new ArrayList<>();


    public int countLines(String csvFileName) throws IOException {
        Scanner myReader = new Scanner(new File(csvFileName));
        myReader.nextLine();
        int counter = 0;

        while(myReader.hasNextLine()){
            myReader.nextLine();
            counter++;
        }
        return counter;
    }

    /**
     * Reads the provided CSV file and populates the internal data structure(s)
     * with MTA art installation data.
     *
     * @param csvFileName The path to the CSV file.
     * @return true if the data was successfully loaded, false otherwise.
     * @throws IOException If an I/O error occurs during file reading.
     */
    @ Override
    public boolean loadData(String csvFileName) throws IOException{
        try {
            Scanner myReader = new Scanner(new File(csvFileName));
            myReader.nextLine();

            String[] temp = new String[8];
            int numEntries = countLines(csvFileName);

            for (int i = 0; i < numEntries; i++) {
                temp = myReader.nextLine().split(",", -1);
                ArtInstallation tempData = new ArtInstallation(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7]);
                this.catalog.add(tempData);
                // DEBUGGING LINE
                System.out.println("Line: " + i + "\n" + this.catalog.get(i).toString());
            }
            return true;
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    /**
     * Adds an ArtInstallation to this catalog
     *
     * @param artInstallation
     */
    @Override
    public void add(ArtInstallation artInstallation) {
        this.catalog.add(artInstallation);
    }

    @Override
    public int getTotalArtInstallations() {
        return this.catalog.size();
    }

    @Override
    public List<String> getAllUniqueArtists() {
        return List.of();
    }

    @Override
    public List<ArtInstallation> getInstallationsByStation(String stationName) {
        return List.of();
    }

    @Override
    public List<ArtInstallation> getInstallationsByArtist(String artistName) {
        return List.of();
    }

    @Override
    public double getAverageInstallationYear() {
        return 0;
    }

    @Override
    public List<String> getArtistWithMostInstallations() {
        return List.of();
    }

    @Override
    public List<ArtInstallation> getInstallationsByLine(String subwayLine) {
        return List.of();
    }

    @Override
    public List<ArtInstallation> getInstallationsSortedByYear() {
        return List.of();
    }

    @Override
    public double getAverageInstallationsPerStation() {
        return 0;
    }

    @Override
    public List<ArtInstallation> searchByKeyword(String keyword) {
        return List.of();
    }
}
