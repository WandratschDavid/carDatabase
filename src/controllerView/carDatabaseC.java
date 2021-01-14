package controllerView;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.CarDatabase;
import model.Vehicle;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class carDatabaseC implements Initializable
{
    @FXML
    TextField searchField;

    @FXML
    ListView<Vehicle> listViewOutput;

    @FXML
    private Label errorOutput;


    private List<Vehicle> foundedVehicles;

    CarDatabase carDatabase = new CarDatabase();


    public void searchBtn()
    {
        doSearch();
    }

    public void exactSearchBtn()
    {
        exactSearch();
    }

    public void exactSearch()
    {
        foundedVehicles = carDatabase.search(searchField.getText(), true);

        search();
    }

    public void doSearch()
    {
        foundedVehicles = FXCollections.observableList(carDatabase.search(searchField.getText(), false));

        search();
    }

    private void search()
    {
        if((foundedVehicles.size() < 1) || foundedVehicles.contains(null))
        {
            errorOutput.setText("Vehicle not found!");
            errorOutput.setVisible(true);
            listViewOutput.setItems(FXCollections.emptyObservableList());
        }
        else
        {
            errorOutput.setVisible(false);
            listViewOutput.setItems(FXCollections.observableList(foundedVehicles));
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}
}