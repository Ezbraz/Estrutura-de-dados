package app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;
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
    private TextField resultSeach;
    @FXML
    private TextField removed;

    @FXML
    private TextField inputRemove;

    // fim inputs

    // botões
    @FXML
    private Button btnInsert;
    @FXML
    private Button btnRemove;
    // fim botões

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
    private Line link1_2;
    @FXML
    private Line link2_3;
    @FXML
    private Line link3_4;
    @FXML
    private Line link4_5;
    @FXML
    private Line link5_6;
    @FXML
    private Line link6_7;
    @FXML
    private Line link7_8;
    @FXML
    private Line link8_9;
    @FXML
    private Line link9_10;
    @FXML
    private Line link10_11;
    @FXML
    private Line link11_12;
    @FXML
    private Line link12_13;
    @FXML
    private Line link13_14;
    @FXML
    private Line link14_15;
    // fim conteudo

    @FXML
    private void insert() {
        try {
            int position = Integer.parseInt(inputPosition.getText().trim());
            String element = inputElement.getText().trim();
            if (element.length() == 0) {
                throw new IllegalArgumentException();
            } else if (position < 1 || listaSeq.tamanho() > 0 && position > (listaSeq.tamanho() + 1)) {
                throw new NullPointerException();
            }

            if (listaSeq.tamanho() < 15) {
                if (!listaSeq.insere(position, element)) {
                    throw new NullPointerException();
                }
            } else {
                throw new IndexOutOfBoundsException();
            }

            render();
            // limpando os inputs
            inputElement.setText("");
            inputPosition.setText("");
        } catch (NullPointerException e) {
            msgErrorAlert("Posição inserida foi inválida.", "Por favor insira uma posição válida.");
        } catch (IndexOutOfBoundsException e) {
            msgErrorAlert("Lista \"Cheia\"!", "Para inserir algo novo na lista algum item deve ser removido.");
        } catch (Exception e) {
            inputErrorAlert();
        }
    }

    @FXML
    private void remove() {
        try {
            if (listaSeq.tamanho() == 0) {
                throw new NullPointerException();
            }
            int position = Integer.parseInt(inputRemove.getText().trim());
            String removido = listaSeq.remove(position).trim();

            if ("".equals(removido)) {
                msgErrorAlert("Posição invalida.", "Insira uma posição válida.");
            } else {
                removed.setText(removido);
            }

            render();

            // limpando os inputs
            inputRemove.setText("");
            inputPosition.setText("");
        } catch (NullPointerException e) {
            msgErrorAlert("Lista Vazia.", "Lista vazia, um elemento deve ser inserido para poder ser removido.");
        } catch (Exception e) {
            inputErrorAlert();
        }
    }

    @FXML
    private void find() {
        try {
            String procurado = inputSearch.getText().trim();

            if (procurado.length() == 0) {
                throw new IllegalArgumentException();
            }
            if (listaSeq.tamanho() == 0) {
                throw new NullPointerException();
            }

            int result = listaSeq.posicao(procurado);
            if (result > 0) {
                resultSeach.setText(Integer.toString(result));
            } else {
                resultSeach.setText("Null");
            }

        } catch (NullPointerException e) {
            msgErrorAlert("Lista Vazia.", "Lista vazia, um elemento deve ser inserido para poder ser pesquisado.");
            // limpando input
            inputSearch.setText("");
            resultSeach.setText("");
        } catch (Exception e) {
            inputErrorAlert();
        }
    }

    // render
    public void render() {
        if (!("").equals(listaSeq.elemento(1))) {
            t00.setVisible(true);
            slot00.setVisible(true);
            t00.setText(listaSeq.elemento(1));
        } else {
            t00.setVisible(false);
            slot00.setVisible(false);
            t00.setText("");
        }

        if (!("").equals(listaSeq.elemento(2))) {
            t01.setVisible(true);
            slot01.setVisible(true);
            link1_2.setVisible(true);

            t01.setText(listaSeq.elemento(2));
        } else {
            t01.setVisible(false);
            slot01.setVisible(false);
            link1_2.setVisible(false);

            t01.setText("");
        }

        if (!("").equals(listaSeq.elemento(3))) {
            t02.setVisible(true);
            slot02.setVisible(true);
            link2_3.setVisible(true);

            t02.setText(listaSeq.elemento(3));
        } else {
            t02.setVisible(false);
            slot02.setVisible(false);
            link2_3.setVisible(false);

            t02.setText("");
        }

        if (!("").equals(listaSeq.elemento(4))) {
            t03.setVisible(true);
            slot03.setVisible(true);
            link3_4.setVisible(true);

            t03.setText(listaSeq.elemento(4));
        } else {
            t03.setVisible(false);
            slot03.setVisible(false);
            link3_4.setVisible(false);

            t03.setText("");
        }

        if (!("").equals(listaSeq.elemento(5))) {
            t04.setVisible(true);
            slot04.setVisible(true);
            link4_5.setVisible(true);

            t04.setText(listaSeq.elemento(5));
        } else {
            t04.setVisible(false);
            slot04.setVisible(false);
            link4_5.setVisible(false);

            t04.setText("");
        }

        if (!("").equals(listaSeq.elemento(6))) {
            t05.setVisible(true);
            slot05.setVisible(true);
            link5_6.setVisible(true);

            t05.setText(listaSeq.elemento(6));
        } else {
            t05.setVisible(false);
            slot05.setVisible(false);
            link5_6.setVisible(false);

            t05.setText("");
        }

        if (!("").equals(listaSeq.elemento(7))) {
            t06.setVisible(true);
            slot06.setVisible(true);
            link6_7.setVisible(true);

            t06.setText(listaSeq.elemento(7));
        } else {
            t06.setVisible(false);
            slot06.setVisible(false);
            t06.setText("");
        }

        if (!("").equals(listaSeq.elemento(8))) {
            t07.setVisible(true);
            slot07.setVisible(true);
            link7_8.setVisible(true);
            link6_7.setVisible(false);

            t07.setText(listaSeq.elemento(8));
        } else {
            t07.setVisible(false);
            slot07.setVisible(false);
            link7_8.setVisible(false);

            t07.setText("");
        }

        if (!("").equals(listaSeq.elemento(9))) {
            t08.setVisible(true);
            slot08.setVisible(true);
            link8_9.setVisible(true);

            t08.setText(listaSeq.elemento(9));
        } else {
            t08.setVisible(false);
            slot08.setVisible(false);
            link8_9.setVisible(false);

            t08.setText("");
        }

        if (!("").equals(listaSeq.elemento(10))) {
            t09.setVisible(true);
            slot09.setVisible(true);
            link9_10.setVisible(true);

            t09.setText(listaSeq.elemento(10));
        } else {
            t09.setVisible(false);
            slot09.setVisible(false);
            link9_10.setVisible(false);

            t09.setText("");
        }

        if (!("").equals(listaSeq.elemento(11))) {
            t10.setVisible(true);
            slot10.setVisible(true);
            link10_11.setVisible(true);

            t10.setText(listaSeq.elemento(11));
        } else {
            t10.setVisible(false);
            slot10.setVisible(false);
            link10_11.setVisible(false);

            t10.setText("");
        }

        if (!("").equals(listaSeq.elemento(12))) {
            t11.setVisible(true);
            slot11.setVisible(true);
            link11_12.setVisible(true);

            t11.setText(listaSeq.elemento(12));
        } else {
            t11.setVisible(false);
            slot11.setVisible(false);
            link11_12.setVisible(false);

            t11.setText("");
        }

        if (!("").equals(listaSeq.elemento(13))) {
            t12.setVisible(true);
            slot12.setVisible(true);
            link12_13.setVisible(true);

            t12.setText(listaSeq.elemento(13));
        } else {
            t12.setVisible(false);
            slot12.setVisible(false);
            link12_13.setVisible(false);

            t12.setText("");
        }

        if (!("").equals(listaSeq.elemento(14))) {
            t13.setVisible(true);
            slot13.setVisible(true);
            link13_14.setVisible(true);

            t13.setText(listaSeq.elemento(14));
        } else {
            t13.setVisible(false);
            slot13.setVisible(false);
            link13_14.setVisible(false);

            t13.setText("");
        }

        if (!("").equals(listaSeq.elemento(15))) {
            t14.setVisible(true);
            slot14.setVisible(true);
            link14_15.setVisible(true);

            t14.setText(listaSeq.elemento(15));
        } else {
            t14.setVisible(false);
            slot14.setVisible(false);
            link14_15.setVisible(false);

            t14.setText("");
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
        alert.setHeaderText("Campo vazio ou caractere invalido.");
        alert.setContentText("Verifique os campos inseridos.");
        alert.showAndWait();
    }
}