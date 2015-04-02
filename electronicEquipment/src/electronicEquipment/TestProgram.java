package electronicEquipment;

public class TestProgram {
public static void main (String[]args){
	electronics a1, a2,a3,a4;
	a1=new cellphones("cellphone", 5, 200, 60, "Samsung");
	a2=new computer("Computer", 100, 300, 60, "Dell");
	a3=new pagers("Pager",2, 20, 10, "nokia");
	a4=new camera("Camera", 30, 600, 40, "Sony");
	a1.displaymessage();
	a2.displaymessage();
	a3.displaymessage();
	a4.displaymessage();
}
}
