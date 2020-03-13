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
			rect(list.get(i).getX(), list.get(i).getY(), 200, 50);
			
			fill(0);
			textAlign(CENTER, CENTER);
			textSize(20);
			text(list.get(i).getRecordatorio(), list.get(i).getX(), list.get(i).getY());
		}

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
