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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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

    //---------------------------------------------

    @FXML
    private TextField input;

    @FXML
    private Rectangle slot00;

    @FXML
    private Rectangle slot001223;

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


    //--------------------------------------------


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
    void submit(){
        int elementoProArray = Integer.parseInt(input.getText());
        arrayLista.add(elementoProArray);
        sortMeu();
        balancearArvore();
    }

    void sortMeu(){

        Collections.sort(arrayLista);
        //Arrays.sort(array);
    }
    void balancearArvore(){

        if(arrayLista.size()==1){
            t07.setText(String.valueOf(arrayLista.get(0)));
        } else if (arrayLista.size()==2){
            t07.setText(String.valueOf(arrayLista.get(1)));
            t03.setText(String.valueOf(arrayLista.get(0)));
        } else if (arrayLista.size()==3){
            t07.setText(String.valueOf(arrayLista.get(1)));
            t03.setText(String.valueOf(arrayLista.get(0)));
            t11.setText(String.valueOf(arrayLista.get(2)));
        } else if (arrayLista.size()==4){
            t07.setText(String.valueOf(arrayLista.get(2)));
            t03.setText(String.valueOf(arrayLista.get(1)));
            t11.setText(String.valueOf(arrayLista.get(3)));
            t01.setText(String.valueOf(arrayLista.get(0)));
        } else if (arrayLista.size()==5){
            t07.setText(String.valueOf(arrayLista.get(2)));
            t03.setText(String.valueOf(arrayLista.get(1)));
            t11.setText(String.valueOf(arrayLista.get(3)));
            t01.setText(String.valueOf(arrayLista.get(0)));
            t13.setText(String.valueOf(arrayLista.get(4)));
        } else if (arrayLista.size()==6){
            t07.setText(String.valueOf(arrayLista.get(3)));
            t03.setText(String.valueOf(arrayLista.get(1)));
            t11.setText(String.valueOf(arrayLista.get(4)));
            t01.setText(String.valueOf(arrayLista.get(0)));
            t13.setText(String.valueOf(arrayLista.get(5)));
            t05.setText(String.valueOf(arrayLista.get(0)));
        } else if (arrayLista.size()==7){
            t07.setText(String.valueOf(arrayLista.get(3)));
            t03.setText(String.valueOf(arrayLista.get(1)));
            t11.setText(String.valueOf(arrayLista.get(5)));
            t01.setText(String.valueOf(arrayLista.get(0)));
            t13.setText(String.valueOf(arrayLista.get(6)));
            t05.setText(String.valueOf(arrayLista.get(2)));
            t09.setText(String.valueOf(arrayLista.get(4)));
        }

    }

}