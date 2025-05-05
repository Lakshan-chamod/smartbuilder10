package lk.ijse.smartbuilder10.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    public AnchorPane ancMainContainer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        navigateTo("/view/LoginPage.fxml");
    }

    public void btnGoCustomerPageOnAction(ActionEvent actionEvent) {
        navigateTo("/view/CustomerPage.fxml");
    }

    public void btnGoInventoryPageOnAction(ActionEvent actionEvent) {
        navigateTo("/view/InventoryPage.fxml");
    }

    public void btnGoOrderPageOnAction(ActionEvent actionEvent) {
        navigateTo("/view/OrderPage.fxml");
    }

    public void btnGoDeliveryPageOnAction(ActionEvent actionEvent) { navigateTo("/view/DeliveryPage.fxml"); }

    public void btnGoDiscountPageOnAction(ActionEvent actionEvent) { navigateTo("/view/DiscountPage.fxml"); }

    public void btnGoEmployeePageOnAction(ActionEvent actionEvent) { navigateTo("/view/EmployeePage.fxml"); }

    public void btnGoInvoicePageOnAction(ActionEvent actionEvent) { navigateTo("/view/InvoicePage.fxml"); }

    public void btnGoReturnPageOnAction(ActionEvent actionEvent) { navigateTo("/view/ReturnPage.fxml");}

    public void btnGoPaymentPageOnAction(ActionEvent actionEvent) { navigateTo("/view/PaymentPage.fxml"); }

    public void btnGoSupplierPageOnAction(ActionEvent actionEvent) { navigateTo("/view/SupplierPage.fxml"); }


    public void btnGoUserPageOnAction(ActionEvent actionEvent) { navigateTo("/view/UserPage.fxml"); }


    private void navigateTo(String path) {
        try {
            ancMainContainer.getChildren().clear();

            AnchorPane anchorPane = FXMLLoader.load(getClass().getResource(path));

            anchorPane.prefWidthProperty().bind(ancMainContainer.widthProperty());
            anchorPane.prefHeightProperty().bind(ancMainContainer.heightProperty());

            ancMainContainer.getChildren().add(anchorPane);
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Page not found..!").show();
            e.printStackTrace();
        }
    }
}