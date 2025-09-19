package cmsc256;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String fileName = "C:\\Users\\alexa\\IdeaProjects\\Project_SearchingAndSorting\\src\\cmsc256\\MTA_Permanent_Art_Catalog__Beginning_1980_20250720.csv";
        MyMTARtCatalogAnalyzer myAnalyzer = new MyMTARtCatalogAnalyzer();
        myAnalyzer.loadData(fileName);


    }
}