package main;

public class Recordatorio {
	
	private float x;
	private float y;
	private String recordatorio;
	
	public Recordatorio(float x, float y, String recordatorio) {
		this.x = x;
		this.y = y;
		this.recordatorio = recordatorio;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public String getRecordatorio() {
		return recordatorio;
	}

	public void setRecordatorio(String recordatorio) {
		this.recordatorio = recordatorio;
	}
	
	
}
