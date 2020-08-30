package taller3.televisores;
public class TV {
	private Marca marca;
	int canal=1;
	int precio=500;
	boolean estado;
	int volumen=1;
	public Control control;
	public static int numTv;
	TV(Marca mar,boolean est){
		marca=mar;
		estado=est;
		numTv++;
	}
	public void setMarca(String str) {
		marca.setMarca(str);
	}
	public void setControl(Control c) {
		control=c;
	}
	public void setPrecio(int i) {
		precio=i;
	}
	public void setVolumen(int i) {
		if(i>=0 && i<=7 && estado==true) {
			volumen=i;
		}
	}
	public void setCanal(int i) {
		if(i>=1 && i<=120 && estado==true) {
			canal=i;
		}
	}
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	public Marca getMarca() {
		return marca;
	}
	public Control getControl() {
		return control;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public int getCanal() {
		return canal;
	}
	public boolean getEstado() {
		return estado;
	}
	public int getNumTv() {
		return numTv;
	}
	public void canalUp() {
		if(canal<120 && estado==true) {
			canal++;
		}
	}
	public void canalDown() {
		if(canal>1 && estado==true) {
			canal--;
		}
	}
	public void volumenUp() {
		if(volumen<7 && estado==true) {
			volumen++;
		}
	}
	public void volumenDown() {
		if(volumen>0 && estado==true) {
			volumen--;
		}
	}
}
