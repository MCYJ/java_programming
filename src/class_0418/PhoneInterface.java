package class_0418;

interface PhoneInterface {
	int TIMEOUT = 10000; // public static final »ý·«
	void sendCall();
	void receiveCall();
	default void printLog() {
		System.out.println("** Phone **");
	}
}
