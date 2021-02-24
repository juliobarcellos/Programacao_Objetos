package edu.curso;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BolinhaDVD extends Application {
	class Ponto { 
		double x;
		double y;
		double velX = 2;
		double velY = 2;
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Group grp = new Group();
		Scene scn = new Scene(grp);
		primaryStage.setScene(scn);
		Canvas canvas = new Canvas(640, 480);
		GraphicsContext ctx = canvas.getGraphicsContext2D();
		grp.getChildren().add(canvas);
		final Ponto p = new Ponto();
		new AnimationTimer() {
			@Override
			public void handle(long now) {
				ctx.clearRect(0,  0, canvas.getWidth(),  canvas.getHeight());
				ctx.setStroke(Color.DARKBLUE);
				ctx.setFill(Color.BLUE);
				ctx.beginPath();
				ctx.fillOval(p.x, p.y, 50, 50);
				p.x += p.velX;
				p.y += p.velY;
				if (p.x > canvas.getWidth()) { 
					p.velX = -2;
				}
				if (p.y > canvas.getHeight()) { 
					p.velY = -2;
				}
				if (p.y < 0) { 
					p.velY = 2;
				}
				ctx.stroke();
			} 
		}.start();
		primaryStage.setTitle("Animação com bolinha imitando logo de DVD");
		primaryStage.show();		
	}

	public static void main(String[] args) {
		Application.launch(BolinhaDVD.class, args);
	}
}
