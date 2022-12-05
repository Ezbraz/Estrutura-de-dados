package app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

import app.listas.encadeada.LSE;

public class ControllerListaEncadeada {
    // lista
    LSE listaEncadeada = new LSE();

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
    // fim inputs

    // botões
    @FXML
    private Button btnInsert;
    @FXML
    private Button btnRemove;
    // fim botões

    // conteúdo
    @FXML
    private Circle label01;
    @FXML
    private Text content01;
    @FXML
    private Line link1_2;

    @FXML
    private Circle label02;
    @FXML
    private Text content02;
    @FXML
    private Line link2_3;

    @FXML
    private Circle label03;
    @FXML
    private Text content03;
    @FXML
    private Line link3_4;

    @FXML
    private Circle label04;
    @FXML
    private Text content04;
    @FXML
    private Line link4_5;

    @FXML
    private Circle label05;
    @FXML
    private Text content05;
    @FXML
    private Line link5_6;

    @FXML
    private Circle label06;
    @FXML
    private Text content06;
    @FXML
    private Line link6_7;

    @FXML
    private Circle label07;
    @FXML
    private Text content07;
    @FXML
    private Line link7_8;

    @FXML
    private Circle label08;
    @FXML
    private Text content08;
    @FXML
    private Line link8_9;

    @FXML
    private Circle label09;
    @FXML
    private Text content09;
    @FXML
    private Line link9_10;

    @FXML
    private Circle label10;
    @FXML
    private Text content10;
    @FXML
    private Line link10_11;

    @FXML
    private Circle label11;
    @FXML
    private Text content11;
    @FXML
    private Line link11_12;

    @FXML
    private Circle label12;
    @FXML
    private Text content12;
    @FXML
    private Line link12_13;

    @FXML
    private Circle label13;
    @FXML
    private Text content13;
    @FXML
    private Line link13_14;

    @FXML
    private Circle label14;
    @FXML
    private Text content14;
    @FXML
    private Line link14_15;

    @FXML
    private Circle label15;
    @FXML
    private Text content15;
    // fim conteudo

    // func
    @FXML
    private void insert() {
        System.out.println("Inserindo");

        int position = Integer.parseInt(inputPosition.getText());
        String element = inputElement.getText();
        if (listaEncadeada.tamanho() < 15) {
            if (!listaEncadeada.insere(position, element)) {
                System.out.println("Error");
            }
        } else {
            System.out.println("Lista \"cheia\"");
        }

        System.out.println("Tamanho:" + listaEncadeada.tamanho());
        render();

    }

    @FXML
    private void remove() {
        System.out.println("Removendo");

        int position = Integer.parseInt(inputPosition.getText());

        String removido = listaEncadeada.remove(position);

        if ("-1".equals(removido)) {
            System.out.println("Error");
        } else {
            removed.setText(removido);

            System.out.println("Elemento removido: " + removido);
        }

        System.out.println("Tamanho:" + listaEncadeada.tamanho());
        render();
    }

    @FXML
    private void find() {
        System.out.println("Pesquisando");

        String procurado = inputSearch.getText();

        int result = listaEncadeada.posicao(procurado);
        if (result > 0) {
            resultSeach.setText(Integer.toString(result));
        } else {
            resultSeach.setText("Null");
        }
    }

    private void render() {
        if (!("-1").equals(listaEncadeada.elemento(1))) {
            label01.setVisible(true);
            content01.setVisible(true);
            link1_2.setVisible(true);

            content01.setText(listaEncadeada.elemento(1));
        } else {
            label01.setVisible(false);
            content01.setVisible(false);
            link1_2.setVisible(false);

            content01.setText(" ");
        }

        if (!("-1").equals(listaEncadeada.elemento(2))) {
            label02.setVisible(true);
            content02.setVisible(true);
            link2_3.setVisible(true);

            content02.setText(listaEncadeada.elemento(2));
        } else {
            label02.setVisible(false);
            content02.setVisible(false);
            link2_3.setVisible(false);

            content02.setText(" ");
        }

        if (!("-1").equals(listaEncadeada.elemento(3))) {
            label03.setVisible(true);
            content03.setVisible(true);
            link3_4.setVisible(true);

            content03.setText(listaEncadeada.elemento(3));
        } else {
            label03.setVisible(false);
            content03.setVisible(false);
            link3_4.setVisible(false);

            content03.setText(" ");
        }

        if (!("-1").equals(listaEncadeada.elemento(4))) {
            label04.setVisible(true);
            content04.setVisible(true);
            link4_5.setVisible(true);

            content04.setText(listaEncadeada.elemento(4));
        } else {
            label04.setVisible(false);
            content04.setVisible(false);
            link4_5.setVisible(false);

            content04.setText(" ");
        }

        if (!("-1").equals(listaEncadeada.elemento(5))) {
            label05.setVisible(true);
            content05.setVisible(true);
            link5_6.setVisible(true);

            content05.setText(listaEncadeada.elemento(5));
        } else {
            label05.setVisible(false);
            content05.setVisible(false);
            link5_6.setVisible(false);

            content05.setText(" ");
        }

        if (!("-1").equals(listaEncadeada.elemento(6))) {
            label06.setVisible(true);
            content06.setVisible(true);
            link6_7.setVisible(true);

            content06.setText(listaEncadeada.elemento(6));
        } else {
            label06.setVisible(false);
            content06.setVisible(false);
            link6_7.setVisible(false);

            content06.setText(" ");
        }

        if (!("-1").equals(listaEncadeada.elemento(7))) {
            label07.setVisible(true);
            content07.setVisible(true);
            link7_8.setVisible(true);

            content07.setText(listaEncadeada.elemento(7));
        } else {
            label07.setVisible(false);
            content07.setVisible(false);
            link7_8.setVisible(false);

            content07.setText(" ");
        }

        if (!("-1").equals(listaEncadeada.elemento(8))) {
            label08.setVisible(true);
            content08.setVisible(true);
            link8_9.setVisible(true);

            content08.setText(listaEncadeada.elemento(8));
        } else {
            label08.setVisible(false);
            content08.setVisible(false);
            link8_9.setVisible(false);

            content08.setText(" ");
        }

        if (!("-1").equals(listaEncadeada.elemento(9))) {
            label09.setVisible(true);
            content09.setVisible(true);
            link9_10.setVisible(true);

            content09.setText(listaEncadeada.elemento(9));
        } else {
            label09.setVisible(false);
            content09.setVisible(false);
            link9_10.setVisible(false);

            content09.setText(" ");
        }

        if (!("-1").equals(listaEncadeada.elemento(10))) {
            label10.setVisible(true);
            content10.setVisible(true);
            link10_11.setVisible(true);

            content10.setText(listaEncadeada.elemento(10));
        } else {
            label10.setVisible(false);
            content10.setVisible(false);
            link10_11.setVisible(false);

            content10.setText(" ");
        }

        if (!("-1").equals(listaEncadeada.elemento(11))) {
            label11.setVisible(true);
            content11.setVisible(true);
            link11_12.setVisible(true);

            content11.setText(listaEncadeada.elemento(11));
        } else {
            label11.setVisible(false);
            content11.setVisible(false);
            link11_12.setVisible(false);

            content11.setText(" ");
        }

        if (!("-1").equals(listaEncadeada.elemento(12))) {
            label12.setVisible(true);
            content12.setVisible(true);
            link12_13.setVisible(true);

            content12.setText(listaEncadeada.elemento(12));
        } else {
            label12.setVisible(false);
            content12.setVisible(false);
            link12_13.setVisible(false);

            content12.setText(" ");
        }

        if (!("-1").equals(listaEncadeada.elemento(13))) {
            label13.setVisible(true);
            content13.setVisible(true);
            link13_14.setVisible(true);

            content13.setText(listaEncadeada.elemento(13));
        } else {
            label13.setVisible(false);
            content13.setVisible(false);
            link13_14.setVisible(false);

            content13.setText(" ");
        }

        if (!("-1").equals(listaEncadeada.elemento(14))) {
            label14.setVisible(true);
            content14.setVisible(true);
            link14_15.setVisible(true);

            content14.setText(listaEncadeada.elemento(14));
        } else {
            label14.setVisible(false);
            content14.setVisible(false);
            link14_15.setVisible(false);

            content14.setText(" ");
        }

        if (!("-1").equals(listaEncadeada.elemento(15))) {
            label15.setVisible(true);
            content15.setVisible(true);
            // link9_10.setVisible(true);

            content15.setText(listaEncadeada.elemento(15));
        } else {
            label15.setVisible(false);
            content15.setVisible(false);
            // link9_10.setVisible(false);

            content15.setText(" ");
        }
    }
}