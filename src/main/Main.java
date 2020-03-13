package main;

import java.util.ArrayList;

import comm.ComunicacionTCP;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main("main.Main");

	}

	ComunicacionTCP comm;
	private String[] arregloRecor;
	private ArrayList<Recordatorio> list;

	public void settings() {
		size(1200, 800);
	}

	public void setup() {
		list = new ArrayList<Recordatorio>();
		comm = new ComunicacionTCP(this);
		comm.esperarConexion();

	}

	public void draw() {
		background(255);

		for (int i = 0; i < list.size(); i++) {
			fill(255);
			rectMode(CENTER);
			rect(list.get(i).getX(), list.get(i).getY(), 300, 100);

			fill(0);
			textAlign(CENTER, CENTER);
			textSize(20);
			text(list.get(i).getRecordatorio(), list.get(i).getX(), list.get(i).getY());

			if (list.get(i).getImportancia().equals("leve")) {
				fill(0, 255, 0);

			} else if (list.get(i).getImportancia().equals("media")) {
				fill(255, 255, 0);

			} else if (list.get(i).getImportancia().equals("alta")) {
				fill(255, 0, 0);
				
			} else {
				fill(155);

			}

			ellipse(list.get(i).getX(), list.get(i).getY() - 50, 50, 50);
		}

		fill(0);
		textAlign(CENTER, CENTER);
		textSize(20);
		text("Recordatorios creados: " + list.size(), 150, 30);

	}

	public String[] getArregloRecor() {
		return arregloRecor;
	}

	public void setArregloRecor(String[] arregloRecor) {
		this.arregloRecor = arregloRecor;
	}

	public ArrayList<Recordatorio> getList() {
		return list;
	}

	public void setList(ArrayList<Recordatorio> list) {
		this.list = list;
	}

}
