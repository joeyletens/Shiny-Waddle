import javafx.application.Application;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Main extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage mainPage) throws Exception {

    mainPage.setTitle("Title");

    BorderPane mainLayout = new BorderPane();
    MenuBar topMenuBar = new MenuBar(topMenuStudent());
    mainLayout.setTop(topMenuBar);
    mainPage.setScene(new Scene(mainLayout, 400, 350));
    mainPage.show();

  }

  public Menu topMenuStudent() {

    Menu studentMenu = new Menu("Student");
    studentMenu.getItems().add(new MenuItem("Create"));
    studentMenu.getItems().add(new MenuItem("Update"));
    studentMenu.getItems().add(new MenuItem("Read"));
    studentMenu.getItems().add(new MenuItem("Delete"));

    return studentMenu;
  }

}