import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Board extends Application {
    // potential strategy:
    // white keys (button), black keys (button), white label to adjust for the black keys being shorter
    // idea extensions: playing w number keys/letter keys instead of cursor, 
    // volume controls, different instrument options like an action piano
    // advanced: blending of sounds like a real piano instead of stopping once another key is started 

    Key C1 = new Key(Color.ANTIQUEWHITE, "enter media file");
    Key Csharp1 = new Key(Color.BLACK, "enter media file");
    Key D1 = new Key(Color.ANTIQUEWHITE, "enter media file");
    Key Eb1 = new Key(Color.BLACK, "enter media file");
    Key E1 = new Key(Color.ANTIQUEWHITE, "enter media file");
    Key F1 = new Key(Color.ANTIQUEWHITE, "enter media file");
    Key Fsharp1 = new Key(Color.BLACK, "enter media file");
    Key G1 = new Key(Color.ANTIQUEWHITE, "enter media file");
    Key Ab1 = new Key(Color.BLACK, "enter media file");
    Key A1 = new Key(Color.ANTIQUEWHITE, "enter media file");
    Key Bb1 = new Key(Color.BLACK, "enter media file");
    Key B1 = new Key(Color.ANTIQUEWHITE, "enter media file");
    Key C2 = new Key(Color.ANTIQUEWHITE, "enter media file");
    Key Csharp2 = new Key(Color.BLACK, "enter media file");
    Key D2 = new Key(Color.ANTIQUEWHITE, "enter media file");
    Key Eb2 = new Key(Color.BLACK, "enter media file");
    Key E2 = new Key(Color.ANTIQUEWHITE, "enter media file");
    Key F2 = new Key(Color.ANTIQUEWHITE, "enter media file");
    Key Fsharp2 = new Key(Color.BLACK, "enter media file");
    Key G2 = new Key(Color.ANTIQUEWHITE, "enter media file");
    Key Ab2 = new Key(Color.BLACK, "enter media file");
    Key A2 = new Key(Color.ANTIQUEWHITE, "enter media file");
    Key Bb2 = new Key(Color.BLACK, "enter media file");
    Key B2 = new Key(Color.ANTIQUEWHITE, "enter media file");
    Key C3 = new Key(Color.ANTIQUEWHITE, "enter media file");

    public static Button makeButton(Key key) {
        Button button = new Button();
        button.setBackground(new Background(new BackgroundFill(key.getColor(), null, null)));
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        return button;
    }

    @Override
    public void start(Stage stage) throws Exception {
        HBox keys = new HBox();
        VBox board = new VBox();

        Button C1button = makeButton(C1);
        C1button.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                C1.startPlayer();
            }
        });
        
        Button Csharp1button = makeButton(Csharp1);
        Csharp1button.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                Csharp1.startPlayer();
            }
        });

        Button D1button = makeButton(D1);
        D1button.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                D1.startPlayer();
            }
        });

        Button Eb1button = makeButton(Eb1);
        Eb1button.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                Eb1.startPlayer();
            }
        });

        Button E1button = makeButton(E1);
        E1button.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                E1.startPlayer();
            }
        });

        Button F1button = makeButton(F1);
        F1button.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                F1.startPlayer();
            }
        });

        Button Fsharp1button = makeButton(Fsharp1);
        Fsharp1button.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                Fsharp1.startPlayer();
            }
        });

        Button G1button = makeButton(G1);
        G1button.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                G1.startPlayer();
            }
        });

        Button Ab1button = makeButton(Ab1);
        Ab1button.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                Ab1.startPlayer();
            }
        });

        Button B1button = makeButton(B1);
        B1button.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                B1.startPlayer();
            }
        });

        Button Bb1button = makeButton(Bb1);
        Bb1button.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                Bb1.startPlayer();
            }
        });

        Button C2button = makeButton(C2);
        C2button.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                C2.startPlayer();
            }
        });

        keys.getChildren().add(C1button);
        keys.getChildren().add(Csharp1button);
        keys.getChildren().add(D1button);
        keys.getChildren().add(Eb1button);
        keys.getChildren().add(E1button);
        keys.getChildren().add(F1button);
        keys.getChildren().add(Fsharp1button);
        keys.getChildren().add(G1button);
        keys.getChildren().add(Ab1button);
        keys.getChildren().add(B1button);
        keys.getChildren().add(Bb1button);
        keys.getChildren().add(C2button);

        Label border = new Label();
        border.setBackground(new Background(new BackgroundFill(Color.AZURE, null, null)));

        board.getChildren().add(border);
        board.getChildren().add(keys);

        Scene s = new Scene(board);
        stage.setScene(s);
        stage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
