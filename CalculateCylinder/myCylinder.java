class Cylinder {

	double radius, hieght;

	Cylinder (double r, double h) {
		this.radius = r;
		this.hieght = h;
	}

	void setRadius (double r) {
		radius = r;
	}

	double getRadius () {
		return (radius);
	}

	void setHieght (double h) {
		hieght = h;
	}

	double getHieght () {
		return (hieght);
	}

	public String toString() {
		String str;

		str = "Radius is: " + radius + "\n" +
			  "Hieght is: " + hieght;

		return (str);
	}
}

public class myCylinder {
	public static void main(String[] args) {

		Cylinder[] myCylinder = new Cylinder[4];

		myCylinder[0] = new Cylinder(500f, 100f);
		myCylinder[1] = new Cylinder(100f, 500f);
		myCylinder[2] = myCylinder[1];
		myCylinder[3] = myCylinder[0];

		System.out.println("CylinderA = " + myCylinder[0] + "\n\n" + "CylinderB = " + myCylinder[1] + "\n\n");
		System.out.println("CylinderA = " + myCylinder[2] + "\n\n" + "CylinderB = " + myCylinder[1] + "\n\n");
		System.out.println("CylinderA = " + myCylinder[3] + "\n\n" + "CylinderB = " + myCylinder[1]);
	}
}