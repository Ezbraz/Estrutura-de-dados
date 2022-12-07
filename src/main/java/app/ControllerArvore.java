package app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ControllerArvore {

    ArrayList<Integer> arrayLista = new ArrayList<>();

    @FXML
    private Button btnList;

    @FXML
    private Button btnList1;

    @FXML
    private Button btnListEnc;

    @FXML
    private Button btnPile;

    @FXML
    private Button btnQueue;

    @FXML
    private Button btnTree;

    // ---------------------------------------------

    @FXML
    private TextField input;
    @FXML
    private TextField caminhamento;

    @FXML
    private Rectangle slot00;

    @FXML
    private Rectangle slot09;

    @FXML
    private Rectangle slot01;

    @FXML
    private Rectangle slot02;

    @FXML
    private Rectangle slot03;

    @FXML
    private Rectangle slot04;

    @FXML
    private Rectangle slot05;

    @FXML
    private Rectangle slot06;

    @FXML
    private Rectangle slot07;

    @FXML
    private Rectangle slot08;

    @FXML
    private Rectangle slot10;

    @FXML
    private Rectangle slot11;

    @FXML
    private Rectangle slot12;

    @FXML
    private Rectangle slot13;

    @FXML
    private Rectangle slot14;

    @FXML
    private Text t00;

    @FXML
    private Text t01;

    @FXML
    private Text t02;

    @FXML
    private Text t03;

    @FXML
    private Text t04;

    @FXML
    private Text t05;

    @FXML
    private Text t06;

    @FXML
    private Text t07;

    @FXML
    private Text t08;

    @FXML
    private Text t09;

    @FXML
    private Text t10;

    @FXML
    private Text t11;

    @FXML
    private Text t12;

    @FXML
    private Text t13;

    @FXML
    private Text t14;

    @FXML
    private Button btnSubmit;

    @FXML
    private Line line1;

    @FXML
    private Line line10;

    @FXML
    private Line line11;

    @FXML
    private Line line12;

    @FXML
    private Line line13;

    @FXML
    private Line line14;

    @FXML
    private Line line2;

    @FXML
    private Line line3;

    @FXML
    private Line line4;

    @FXML
    private Line line5;

    @FXML
    private Line line6;

    @FXML
    private Line line7;

    @FXML
    private Line line8;

    @FXML
    private Line line9;

    @FXML
    private Button btnHelp;

    // --------------------------------------------

    @FXML
    void GoToLista(MouseEvent event) throws IOException {
        Stage stage = (Stage) btnList.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("page-lista.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Estrutura de dados - Lista");
        stage.setScene(scene);
    }

    @FXML
    void GoToListaEncadeada(MouseEvent event) throws IOException {
        Stage stage = (Stage) btnListEnc.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("page-listaEncadeada.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Estrutura de dados - Lista Encadeada");
        stage.setScene(scene);
    }

    @FXML
    void GoToPilha(MouseEvent event) throws IOException {
        Stage stage = (Stage) btnPile.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("page-pilha.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Estrutura de dados - Pilha");
        stage.setScene(scene);
    }

    @FXML
    void GoToFila(MouseEvent event) throws IOException {
        Stage stage = (Stage) btnQueue.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("page-fila.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Estrutura de dados - Fila");
        stage.setScene(scene);
    }

    @FXML
    void GoToArvore(MouseEvent event) throws IOException {
        Stage stage = (Stage) btnTree.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("page-arvore.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Estrutura de dados - Arvore");
        stage.setScene(scene);
    }

    @FXML
    void GoToHome(MouseEvent event) throws IOException {
        Stage stage = (Stage) btnList1.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("page-home.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Estrutura de dados - Home");
        stage.setScene(scene);
    }

    @FXML
    void submit() {
        try {
            String aInserir = input.getText().trim();
            if (aInserir.length() == 0) {
                throw new NullPointerException();
            } else if (arrayLista.size() == 15) {
                throw new IndexOutOfBoundsException("Index 16 out of bounds for length 15");
            }

            int elementoProArray = Integer.parseInt(aInserir);
            arrayLista.add(elementoProArray);

            sortMeu();
            balancearArvore();

            input.clear();
        } catch (IndexOutOfBoundsException e) {
            msgErrorAlert("Árvore cheia!",
                    "A árvore atual atingiu seu tamanho máximo, para fins didáticos o tamanho máximo dessa árvore são 15 elementos.");
        } catch (NullPointerException e) {
            inputErrorAlert();
        } catch (Exception e) {
            msgErrorAlert("Entrada inválida.",
                    "Entrada inválida, verifique o campo. obs: inteiros em java vão de -2147483648 até 2147483647");
        }
    }

    void sortMeu() {
        Collections.sort(arrayLista);
    }

    void turnOn(Line line, Rectangle rec, Text text, String elemento) {
        line.setVisible(true);
        rec.setVisible(true);
        text.setVisible(true);
        text.setText(elemento);
    }

    void turnOn1(Rectangle rec, Text text, String elemento) {
        rec.setVisible(true);
        text.setVisible(true);
        text.setText(elemento);
    }

    void balancearArvore() {
        if (arrayLista.size() == 1) {
            turnOn1(slot07, t07, String.valueOf(arrayLista.get(0)));
            caminhamento.setText(String.valueOf(arrayLista));
        } else if (arrayLista.size() == 2) {
            turnOn1(slot07, t07, String.valueOf(arrayLista.get(1)));
            turnOn(line1, slot03, t03, String.valueOf(arrayLista.get(0)));
            caminhamento.setText(String.valueOf(arrayLista));
        } else if (arrayLista.size() == 3) {
            turnOn1(slot07, t07, String.valueOf(arrayLista.get(1)));
            turnOn(line1, slot03, t03, String.valueOf(arrayLista.get(0)));
            turnOn(line2, slot11, t11, String.valueOf(arrayLista.get(2)));
            caminhamento.setText(String.valueOf(arrayLista));
        } else if (arrayLista.size() == 4) {
            turnOn1(slot07, t07, String.valueOf(arrayLista.get(2)));
            turnOn(line1, slot03, t03, String.valueOf(arrayLista.get(1)));
            turnOn(line2, slot11, t11, String.valueOf(arrayLista.get(3)));
            turnOn(line3, slot01, t01, String.valueOf(arrayLista.get(0)));
            caminhamento.setText(String.valueOf(arrayLista));
        } else if (arrayLista.size() == 5) {
            turnOn1(slot07, t07, String.valueOf(arrayLista.get(2)));
            turnOn(line1, slot03, t03, String.valueOf(arrayLista.get(1)));
            turnOn(line2, slot11, t11, String.valueOf(arrayLista.get(3)));
            turnOn(line3, slot01, t01, String.valueOf(arrayLista.get(0)));
            turnOn(line6, slot13, t13, String.valueOf(arrayLista.get(4)));
            caminhamento.setText(String.valueOf(arrayLista));
        } else if (arrayLista.size() == 6) {
            turnOn1(slot07, t07, String.valueOf(arrayLista.get(3)));
            turnOn(line1, slot03, t03, String.valueOf(arrayLista.get(1)));
            turnOn(line2, slot11, t11, String.valueOf(arrayLista.get(4)));
            turnOn(line3, slot01, t01, String.valueOf(arrayLista.get(0)));
            turnOn(line6, slot13, t13, String.valueOf(arrayLista.get(5)));
            turnOn(line4, slot05, t05, String.valueOf(arrayLista.get(2)));
            caminhamento.setText(String.valueOf(arrayLista));
        } else if (arrayLista.size() == 7) {
            turnOn1(slot07, t07, String.valueOf(arrayLista.get(3)));
            turnOn(line1, slot03, t03, String.valueOf(arrayLista.get(1)));
            turnOn(line2, slot11, t11, String.valueOf(arrayLista.get(5)));
            turnOn(line3, slot01, t01, String.valueOf(arrayLista.get(0)));
            turnOn(line6, slot13, t13, String.valueOf(arrayLista.get(6)));
            turnOn(line4, slot05, t05, String.valueOf(arrayLista.get(2)));
            turnOn(line5, slot09, t09, String.valueOf(arrayLista.get(4)));
            caminhamento.setText(String.valueOf(arrayLista));
        } else if (arrayLista.size() == 8) {
            turnOn1(slot07, t07, String.valueOf(arrayLista.get(4)));
            turnOn(line1, slot03, t03, String.valueOf(arrayLista.get(2)));
            turnOn(line2, slot11, t11, String.valueOf(arrayLista.get(6)));
            turnOn(line3, slot01, t01, String.valueOf(arrayLista.get(1)));
            turnOn(line6, slot13, t13, String.valueOf(arrayLista.get(7)));
            turnOn(line4, slot05, t05, String.valueOf(arrayLista.get(3)));
            turnOn(line5, slot09, t09, String.valueOf(arrayLista.get(5)));
            turnOn(line7, slot00, t00, String.valueOf(arrayLista.get(0)));
            caminhamento.setText(String.valueOf(arrayLista));
        } else if (arrayLista.size() == 9) {
            turnOn1(slot07, t07, String.valueOf(arrayLista.get(4)));
            turnOn(line1, slot03, t03, String.valueOf(arrayLista.get(2)));
            turnOn(line2, slot11, t11, String.valueOf(arrayLista.get(6)));
            turnOn(line3, slot01, t01, String.valueOf(arrayLista.get(1)));
            turnOn(line6, slot13, t13, String.valueOf(arrayLista.get(7)));
            turnOn(line4, slot05, t05, String.valueOf(arrayLista.get(3)));
            turnOn(line5, slot09, t09, String.valueOf(arrayLista.get(5)));
            turnOn(line7, slot00, t00, String.valueOf(arrayLista.get(0)));
            turnOn(line14, slot14, t14, String.valueOf(arrayLista.get(8)));
            caminhamento.setText(String.valueOf(arrayLista));
        } else if (arrayLista.size() == 10) {
            turnOn1(slot07, t07, String.valueOf(arrayLista.get(5)));
            turnOn(line1, slot03, t03, String.valueOf(arrayLista.get(2)));
            turnOn(line2, slot11, t11, String.valueOf(arrayLista.get(7)));
            turnOn(line3, slot01, t01, String.valueOf(arrayLista.get(1)));
            turnOn(line6, slot13, t13, String.valueOf(arrayLista.get(8)));
            turnOn(line4, slot05, t05, String.valueOf(arrayLista.get(3)));
            turnOn(line5, slot09, t09, String.valueOf(arrayLista.get(6)));
            turnOn(line7, slot00, t00, String.valueOf(arrayLista.get(0)));
            turnOn(line14, slot14, t14, String.valueOf(arrayLista.get(9)));
            turnOn(line10, slot06, t06, String.valueOf(arrayLista.get(4)));
            caminhamento.setText(String.valueOf(arrayLista));
        } else if (arrayLista.size() == 11) {
            turnOn1(slot07, t07, String.valueOf(arrayLista.get(5)));
            turnOn(line1, slot03, t03, String.valueOf(arrayLista.get(2)));
            turnOn(line2, slot11, t11, String.valueOf(arrayLista.get(8)));
            turnOn(line3, slot01, t01, String.valueOf(arrayLista.get(1)));
            turnOn(line6, slot13, t13, String.valueOf(arrayLista.get(9)));
            turnOn(line4, slot05, t05, String.valueOf(arrayLista.get(3)));
            turnOn(line5, slot09, t09, String.valueOf(arrayLista.get(7)));
            turnOn(line7, slot00, t00, String.valueOf(arrayLista.get(0)));
            turnOn(line14, slot14, t14, String.valueOf(arrayLista.get(10)));
            turnOn(line10, slot06, t06, String.valueOf(arrayLista.get(4)));
            turnOn(line11, slot08, t08, String.valueOf(arrayLista.get(6)));
            caminhamento.setText(String.valueOf(arrayLista));
        } else if (arrayLista.size() == 12) {
            turnOn1(slot07, t07, String.valueOf(arrayLista.get(6)));
            turnOn(line1, slot03, t03, String.valueOf(arrayLista.get(3)));
            turnOn(line2, slot11, t11, String.valueOf(arrayLista.get(9)));
            turnOn(line3, slot01, t01, String.valueOf(arrayLista.get(1)));
            turnOn(line6, slot13, t13, String.valueOf(arrayLista.get(10)));
            turnOn(line4, slot05, t05, String.valueOf(arrayLista.get(4)));
            turnOn(line5, slot09, t09, String.valueOf(arrayLista.get(8)));
            turnOn(line7, slot00, t00, String.valueOf(arrayLista.get(0)));
            turnOn(line14, slot14, t14, String.valueOf(arrayLista.get(11)));
            turnOn(line10, slot06, t06, String.valueOf(arrayLista.get(5)));
            turnOn(line11, slot08, t08, String.valueOf(arrayLista.get(7)));
            turnOn(line8, slot02, t02, String.valueOf(arrayLista.get(2)));
            caminhamento.setText(String.valueOf(arrayLista));
        } else if (arrayLista.size() == 13) {
            turnOn1(slot07, t07, String.valueOf(arrayLista.get(6)));
            turnOn(line1, slot03, t03, String.valueOf(arrayLista.get(3)));
            turnOn(line2, slot11, t11, String.valueOf(arrayLista.get(10)));
            turnOn(line3, slot01, t01, String.valueOf(arrayLista.get(1)));
            turnOn(line6, slot13, t13, String.valueOf(arrayLista.get(11)));
            turnOn(line4, slot05, t05, String.valueOf(arrayLista.get(4)));
            turnOn(line5, slot09, t09, String.valueOf(arrayLista.get(8)));
            turnOn(line7, slot00, t00, String.valueOf(arrayLista.get(0)));
            turnOn(line14, slot14, t14, String.valueOf(arrayLista.get(12)));
            turnOn(line10, slot06, t06, String.valueOf(arrayLista.get(5)));
            turnOn(line11, slot08, t08, String.valueOf(arrayLista.get(7)));
            turnOn(line8, slot02, t02, String.valueOf(arrayLista.get(2)));
            turnOn(line12, slot10, t10, String.valueOf(arrayLista.get(9)));
            caminhamento.setText(String.valueOf(arrayLista));
        } else if (arrayLista.size() == 14) {
            turnOn1(slot07, t07, String.valueOf(arrayLista.get(7)));
            turnOn(line1, slot03, t03, String.valueOf(arrayLista.get(3)));
            turnOn(line2, slot11, t11, String.valueOf(arrayLista.get(11)));
            turnOn(line3, slot01, t01, String.valueOf(arrayLista.get(1)));
            turnOn(line6, slot13, t13, String.valueOf(arrayLista.get(12)));
            turnOn(line4, slot05, t05, String.valueOf(arrayLista.get(5)));
            turnOn(line5, slot09, t09, String.valueOf(arrayLista.get(9)));
            turnOn(line7, slot00, t00, String.valueOf(arrayLista.get(0)));
            turnOn(line14, slot14, t14, String.valueOf(arrayLista.get(13)));
            turnOn(line10, slot06, t06, String.valueOf(arrayLista.get(6)));
            turnOn(line11, slot08, t08, String.valueOf(arrayLista.get(8)));
            turnOn(line8, slot02, t02, String.valueOf(arrayLista.get(2)));
            turnOn(line12, slot10, t10, String.valueOf(arrayLista.get(10)));
            turnOn(line9, slot04, t04, String.valueOf(arrayLista.get(4)));
            caminhamento.setText(String.valueOf(arrayLista));
        } else if (arrayLista.size() == 15) {
            turnOn1(slot07, t07, String.valueOf(arrayLista.get(7)));
            turnOn(line1, slot03, t03, String.valueOf(arrayLista.get(3)));
            turnOn(line2, slot11, t11, String.valueOf(arrayLista.get(11)));
            turnOn(line3, slot01, t01, String.valueOf(arrayLista.get(1)));
            turnOn(line6, slot13, t13, String.valueOf(arrayLista.get(13)));
            turnOn(line4, slot05, t05, String.valueOf(arrayLista.get(5)));
            turnOn(line5, slot09, t09, String.valueOf(arrayLista.get(9)));
            turnOn(line7, slot00, t00, String.valueOf(arrayLista.get(0)));
            turnOn(line14, slot14, t14, String.valueOf(arrayLista.get(14)));
            turnOn(line10, slot06, t06, String.valueOf(arrayLista.get(6)));
            turnOn(line11, slot08, t08, String.valueOf(arrayLista.get(8)));
            turnOn(line8, slot02, t02, String.valueOf(arrayLista.get(2)));
            turnOn(line12, slot10, t10, String.valueOf(arrayLista.get(10)));
            turnOn(line9, slot04, t04, String.valueOf(arrayLista.get(4)));
            turnOn(line13, slot12, t12, String.valueOf(arrayLista.get(12)));
            caminhamento.setText(String.valueOf(arrayLista));
        }
    }

    // alertas
    private void msgErrorAlert(String title, String textContent) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Aviso!");
        alert.setHeaderText(title);
        alert.setContentText(textContent);
        alert.showAndWait();
    }

    private void inputErrorAlert() {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Aviso!");
        alert.setHeaderText("Campo vazio.");
        alert.setContentText("Verifique os campos inseridos.");
        alert.showAndWait();
    }

    @FXML
    private void helpAlert() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Help!");
        alert.setHeaderText("Info.");
        alert.setContentText("Para fins didáticos o tamanho máximo dessa árvore são 15 elementos.");
        alert.showAndWait();
    }
}