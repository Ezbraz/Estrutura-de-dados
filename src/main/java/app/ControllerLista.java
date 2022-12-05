package app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

import app.listas.ListaSeq;

public class ControllerLista {
    // lista
    ListaSeq listaSeq = new ListaSeq(15);

    // mudanças de tela
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
    // "controller propriamente dito"

    // inputs de texto
    @FXML
    private TextField inputElement;
    @FXML
    private TextField inputPosition;
    @FXML
    private TextField inputSearch;
    @FXML
    private TextField posSearchResult;

    // botões
    @FXML
    private Button btnInsert;
    @FXML
    private Button btnRemove;

    // slots de texto com conteúdo
    @FXML
    private Text t00;
    @FXML
    private Rectangle slot00;

    @FXML
    private Text t01;
    @FXML
    private Rectangle slot01;

    @FXML
    private Text t02;
    @FXML
    private Rectangle slot02;

    @FXML
    private Text t03;
    @FXML
    private Rectangle slot03;

    @FXML
    private Text t04;
    @FXML
    private Rectangle slot04;

    @FXML
    private Text t05;
    @FXML
    private Rectangle slot05;

    @FXML
    private Text t06;
    @FXML
    private Rectangle slot06;

    @FXML
    private Text t07;
    @FXML
    private Rectangle slot07;

    @FXML
    private Text t08;
    @FXML
    private Rectangle slot08;

    @FXML
    private Text t09;
    @FXML
    private Rectangle slot09;

    @FXML
    private Text t10;
    @FXML
    private Rectangle slot10;

    @FXML
    private Text t11;
    @FXML
    private Rectangle slot11;

    @FXML
    private Text t12;
    @FXML
    private Rectangle slot12;

    @FXML
    private Text t13;
    @FXML
    private Rectangle slot13;

    @FXML
    private Text t14;
    @FXML
    private Rectangle slot14;

    @FXML
    private void insert() {
        System.out.println("Inserindo");

        t00.setVisible(true);
        slot00.setVisible(true);
        t00.setText("teste");

        t01.setVisible(true);
        slot01.setVisible(true);
        t01.setText("teste");

        t02.setVisible(true);
        slot02.setVisible(true);
        t02.setText("teste");

        t03.setVisible(true);
        slot03.setVisible(true);
        t03.setText("teste");

        t04.setVisible(true);
        slot04.setVisible(true);
        t04.setText("teste");

        t05.setVisible(true);
        slot05.setVisible(true);
        t05.setText("teste");

        t06.setVisible(true);
        slot06.setVisible(true);
        t06.setText("teste");

        t07.setVisible(true);
        slot07.setVisible(true);
        t07.setText("teste");

        t08.setVisible(true);
        slot08.setVisible(true);
        t08.setText("teste");

        t09.setVisible(true);
        slot09.setVisible(true);
        t09.setText("teste");

        t10.setVisible(true);
        slot10.setVisible(true);
        t10.setText("teste");

        t11.setVisible(true);
        slot11.setVisible(true);
        t11.setText("teste");

        t12.setVisible(true);
        slot12.setVisible(true);
        t12.setText("teste");

        t13.setVisible(true);
        slot13.setVisible(true);
        t13.setText("teste");

        t14.setVisible(true);
        slot14.setVisible(true);
        t14.setText("teste");
    }

    @FXML
    private void remove() {
        System.out.println("Removendo");
    }
}