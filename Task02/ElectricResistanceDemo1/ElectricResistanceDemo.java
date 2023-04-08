package Task02.ElectricResistanceDemo1;

import java.io.*;

import Task02.ElectricResistance1.*;

/**

The class Electric resistance demo
*/
public class ElectricResistanceDemo {

/**

Main

@param args the args
*/
public static void main(String[] args) {

ElectricResistance er = new ElectricResistance(10, 20, 30, 2.5);

// сериализация
try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("electric_resistance.ser"))) {
out.writeObject(er);
} catch (IOException e) {
e.printStackTrace();
}

// десериализация
try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("electric_resistance.ser"))) {
ElectricResistance er2 = (ElectricResistance) in.readObject();
System.out.println(er2);
} catch (IOException | ClassNotFoundException e) {
e.printStackTrace();
}
}
}