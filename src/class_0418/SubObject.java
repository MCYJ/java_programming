package class_0418;

class SubObject extends SuperObject {
	@Override
	public void paint() {
		super.draw();
		System.out.println("draw");
	}
	@Override
	public void draw() {
		System.out.println("Sub Object");
	}
}
