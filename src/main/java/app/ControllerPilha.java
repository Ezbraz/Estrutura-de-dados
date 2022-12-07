package app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ControllerPilha {

    ArrayList<String> array = new ArrayList<>();
    ArrayList<Integer> posicoes = new ArrayList<>();
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
    // ----------------------------------slots
    // ----------------------------------slots
    // ----------------------------------slots

    @FXML
    private Rectangle slot00;

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
    private Rectangle slot09;

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
    private TextField textoInsert;

    @FXML
    private TextField removed;

    // ----------------------------------slots
    // ----------------------------------slots
    // ----------------------------------slots

    // ----------------------------------menu
    // ----------------------------------menu
    // ----------------------------------menu
    @FXML
    private TextField resultBusca;

    @FXML
    void Busca(MouseEvent event) throws IOException {
        try {
            resultBusca.setText(array.get(array.size() - 1));
        } catch (Exception e) {
            resultBusca.setText("");
            msgErrorAlert("Pilha vazia!",
                    "A pilha está vazia, não há nada a ser consultado.");
        }
    }

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
    void insert(MouseEvent event) {
        try {
            String elemento = textoInsert.getText().trim();

            if (elemento.length() == 0) {
                throw new NullPointerException();
            } else if (array.size() == 15) {
                throw new IndexOutOfBoundsException("Index 16 out of bounds for length 15");
            }

            array.add(elemento);
            setAllPossibleVisible();

            textoInsert.setText("");
        } catch (IndexOutOfBoundsException e) {
            msgErrorAlert("Pilha cheia!",
                    "A pilha está cheia, se deseja inserir um elemento algum outro deve ser removido antes.");
        } catch (Exception e) {
            inputErrorAlert(); // campo vazio
        }
    }

    @FXML
    void remove(MouseEvent event) {
        try {
            int tamanho = array.size();
            removed.setText(array.remove(tamanho - 1));
            setAllPossibleVisibleRemove();
        } catch (IndexOutOfBoundsException e) {
            msgErrorAlert("Pilha vazia!",
                    "A pilha está vazia, se deseja remover um elemento por favor insira algum antes.");
        }

    }

    void setSlotVisible(Rectangle slot, Text text) {
        if (!slot.isVisible()) {
            slot.setVisible(true);
            text.setVisible(true);
        } else if (slot.isVisible()) {
            slot.setVisible(false);
            text.setVisible(false);
        }
    }

    void setAllPossibleVisible() {
        if (array.size() == 1) {
            setSlotVisible(slot00, t00);
            t00.setText(array.get(0));
        } else if (array.size() == 2) {
            setSlotVisible(slot01, t01);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
        } else if (array.size() == 3) {
            setSlotVisible(slot02, t02);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
        } else if (array.size() == 4) {
            setSlotVisible(slot03, t03);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
        } else if (array.size() == 5) {
            setSlotVisible(slot04, t04);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
        } else if (array.size() == 6) {
            setSlotVisible(slot05, t05);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
        } else if (array.size() == 7) {
            setSlotVisible(slot06, t06);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
            t06.setText(array.get(6));
        } else if (array.size() == 8) {
            setSlotVisible(slot07, t07);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
            t06.setText(array.get(6));
            t07.setText(array.get(7));
        } else if (array.size() == 9) {
            setSlotVisible(slot08, t08);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
            t06.setText(array.get(6));
            t07.setText(array.get(7));
            t08.setText(array.get(8));
        } else if (array.size() == 10) {
            setSlotVisible(slot09, t09);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
            t06.setText(array.get(6));
            t07.setText(array.get(7));
            t08.setText(array.get(8));
            t09.setText(array.get(9));
        } else if (array.size() == 11) {
            setSlotVisible(slot10, t10);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
            t06.setText(array.get(6));
            t07.setText(array.get(7));
            t08.setText(array.get(8));
            t09.setText(array.get(9));
            t10.setText(array.get(10));
        } else if (array.size() == 12) {
            setSlotVisible(slot11, t11);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
            t06.setText(array.get(6));
            t07.setText(array.get(7));
            t08.setText(array.get(8));
            t09.setText(array.get(9));
            t10.setText(array.get(10));
            t11.setText(array.get(11));
        } else if (array.size() == 13) {
            setSlotVisible(slot12, t12);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
            t06.setText(array.get(6));
            t07.setText(array.get(7));
            t08.setText(array.get(8));
            t09.setText(array.get(9));
            t10.setText(array.get(10));
            t11.setText(array.get(11));
            t12.setText(array.get(12));
        } else if (array.size() == 14) {
            setSlotVisible(slot13, t13);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
            t06.setText(array.get(6));
            t07.setText(array.get(7));
            t08.setText(array.get(8));
            t09.setText(array.get(9));
            t10.setText(array.get(10));
            t11.setText(array.get(11));
            t12.setText(array.get(12));
            t13.setText(array.get(13));
        } else if (array.size() == 15) {
            setSlotVisible(slot14, t14);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
            t06.setText(array.get(6));
            t07.setText(array.get(7));
            t08.setText(array.get(8));
            t09.setText(array.get(9));
            t10.setText(array.get(10));
            t11.setText(array.get(11));
            t12.setText(array.get(12));
            t13.setText(array.get(13));
            t14.setText(array.get(14));
        }

    }

    void setAllPossibleVisibleRemove() {
        if (array.size() == 0) {
            setSlotVisible(slot00, t00);
        } else if (array.size() == 1) {
            setSlotVisible(slot01, t01);
            t00.setText(array.get(0));
        } else if (array.size() == 2) {

            setSlotVisible(slot02, t02);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
        } else if (array.size() == 3) {

            setSlotVisible(slot03, t03);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
        } else if (array.size() == 4) {

            setSlotVisible(slot04, t04);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
        } else if (array.size() == 5) {

            setSlotVisible(slot05, t05);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
        } else if (array.size() == 6) {
            setSlotVisible(slot06, t06);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
        } else if (array.size() == 7) {
            setSlotVisible(slot07, t07);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
            t06.setText(array.get(6));
        } else if (array.size() == 8) {

            setSlotVisible(slot08, t08);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
            t06.setText(array.get(6));
            t07.setText(array.get(7));
        } else if (array.size() == 9) {

            setSlotVisible(slot09, t09);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
            t06.setText(array.get(6));
            t07.setText(array.get(7));
            t08.setText(array.get(8));
        } else if (array.size() == 10) {

            setSlotVisible(slot10, t10);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
            t06.setText(array.get(6));
            t07.setText(array.get(7));
            t08.setText(array.get(8));
            t09.setText(array.get(9));
        } else if (array.size() == 11) {

            setSlotVisible(slot11, t11);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
            t06.setText(array.get(6));
            t07.setText(array.get(7));
            t08.setText(array.get(8));
            t09.setText(array.get(9));
            t10.setText(array.get(10));
        } else if (array.size() == 12) {

            setSlotVisible(slot12, t12);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
            t06.setText(array.get(6));
            t07.setText(array.get(7));
            t08.setText(array.get(8));
            t09.setText(array.get(9));
            t10.setText(array.get(10));
            t11.setText(array.get(11));
        } else if (array.size() == 13) {

            setSlotVisible(slot13, t13);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
            t06.setText(array.get(6));
            t07.setText(array.get(7));
            t08.setText(array.get(8));
            t09.setText(array.get(9));
            t10.setText(array.get(10));
            t11.setText(array.get(11));
            t12.setText(array.get(12));
        } else if (array.size() == 14) {
            setSlotVisible(slot14, t14);
            t00.setText(array.get(0));
            t01.setText(array.get(1));
            t02.setText(array.get(2));
            t03.setText(array.get(3));
            t04.setText(array.get(4));
            t05.setText(array.get(5));
            t06.setText(array.get(6));
            t07.setText(array.get(7));
            t08.setText(array.get(8));
            t09.setText(array.get(9));
            t10.setText(array.get(10));
            t11.setText(array.get(11));
            t12.setText(array.get(12));
            t13.setText(array.get(13));
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
}