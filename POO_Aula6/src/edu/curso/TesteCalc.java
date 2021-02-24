package edu.curso;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TesteCalc extends Application {

	private TextField visor = new TextField();
	private Button btnCE = new Button("CE");
	private Button btn0 = new Button("0");
	private Button btn1 = new Button("1");
	private Button btn2 = new Button("2");
	private Button btn3 = new Button("3");
	private Button btn4 = new Button("4");
	private Button btn5 = new Button("5");
	private Button btn6 = new Button("6");
	private Button btn7 = new Button("7");
	private Button btn8 = new Button("8");
	private Button btn9 = new Button("9");
	private Button btnVirg = new Button(",");
	private Button btnIgual = new Button("=");
	private Button btnSoma = new Button("+");
	private Button btnSubt = new Button("-");
	private Button btnMult = new Button("*");
	private Button btnDiv = new Button("/");

	@Override
	public void start(Stage stg) throws Exception {
		stg.setTitle("Calculator");
		stg.setResizable(false);
		BorderPane bp = new BorderPane();
		Scene scn = new Scene(bp, 275, 320);
		GridPane gp = new GridPane();
		FlowPane fp = new FlowPane();
		TilePane tp2 = new TilePane();
		TilePane tp3 = new TilePane();
		TilePane tp4 = new TilePane();
		TilePane tp5 = new TilePane();

		bp.setCenter(gp);
		BorderPane.setAlignment(gp, Pos.TOP_CENTER);
		BorderPane.setMargin(gp, new Insets(20));
		fp.setMaxWidth(300);
		gp.setMaxWidth(300);

		visor.setMaxWidth(170);
		visor.setPrefHeight(50);
		btnCE.setMinSize(50, 50);
		btn0.setMinSize(50, 50);
		btn1.setMinSize(50, 50);
		btn2.setMinSize(50, 50);
		btn3.setMinSize(50, 50);
		btn4.setMinSize(50, 50);
		btn5.setMinSize(50, 50);
		btn6.setMinSize(50, 50);
		btn7.setMinSize(50, 50);
		btn8.setMinSize(50, 50);
		btn9.setMinSize(50, 50);
		btnVirg.setMinSize(50, 50);
		btnIgual.setMinSize(50, 50);
		btnSoma.setMinSize(50, 50);
		btnSubt.setMinSize(50, 50);
		btnDiv.setMinSize(50, 50);
		btnMult.setMinSize(50, 50);

		fp.getChildren().addAll(visor, btnCE);
		tp2.getChildren().addAll(btn7, btn8, btn9, btnSoma);
		tp3.getChildren().addAll(btn4, btn5, btn6, btnSubt);
		tp4.getChildren().addAll(btn1, btn2, btn3, btnMult);
		tp5.getChildren().addAll(btnVirg, btn0, btnIgual, btnDiv);
		gp.add(fp, 0, 0);
		gp.add(tp2, 0, 1);
		gp.add(tp3, 0, 2);
		gp.add(tp4, 0, 3);
		gp.add(tp5, 0, 4);

		gp.setVgap(10);
		fp.setHgap(10);
		tp2.setHgap(10);
		tp3.setHgap(10);
		tp4.setHgap(10);
		tp5.setHgap(10);

		stg.setScene(scn);
		stg.show();

	}

	public static void main(String[] args) {
		Application.launch(TesteCalc.class, args);
	}
}