package taller3.televisores;
public class Control {
	 public TV tv;
	 public void turnOn() {
		 this.tv.turnOn();
	 }
	 public void turnOff() {
		 this.tv.turnOff();
	 }
	 public void canalUp() {
		 this.tv.canalUp();
	 }
	 public void canalDown() {
		 this.tv.canalDown();
	 }
	 public void volumenUp() {
		 this.tv.volumenUp();
	 }
	 public void volumenDown() {
		 this.tv.volumenDown();
	 }
	 public void setCanal(int i) {
		 this.tv.setCanal(i);
	 }
	 public void enlazar(TV a) {
		 this.tv=a;
		 a.setControl(this);
	 }
	 public TV getTv() {
		 return tv;
	 }
}
