package lesson_1;

public abstract class Device {
	String name;
	public Device(String name) {
		this.name = name;
	}
	
	public void on() {
		System.out.println(String.format("%s turning on...", this.name));
	};
	public void off() {
		System.out.println(String.format("%s turning off...", this.name));
	};
	
	public String toString() {
		return "Device: " + this.name;
	}
}
