



//-------------------------------(   Serialization   )------------------------ //


// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.ObjectOutputStream;
// import java.io.ObjectStreamClass;
// import java.io.Serializable;

// class User implements Serializable
// {
//     String name;
//     String password;

//     public void sayHello()
//     {
//         System.out.println("Hello " + name);
//     }
// }
// public class Assignment_24 {
//     public static void main(String[] args) throws IOException {
//         User user = new User();
//         user.name = "YRP";
//         user.password = "123456";

//         user.sayHello();

//         FileOutputStream filout  = new FileOutputStream("UserInfo.ser");
//         ObjectOutputStream out = new ObjectOutputStream(filout);
//         out.writeObject(user);
//         out.close();

//         System.out.println("Object info saved !");
//         filout.close();

//         long serialVersionID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
//         System.out.println(serialVersionID);
//     }
// }











//====================== -----------  { DisSerialization } -----------------------------// 

// import java.io.FileInputStream;
// import java.io.ObjectInputStream;
// import java.io.IOException;
// import java.io.Serializable;
// import java.io.ObjectStreamClass;

// class User implements Serializable
// {
//     String name;
//     String password;

//     public void sayHello()
//     {
//         System.out.println("Hello " + name);
//     }
// }
// public class Assignment_24 {
//     public static void main(String[] args) throws IOException, ClassNotFoundException{
//         User user = null;

//         FileInputStream fileIn = new FileInputStream("D:\\Coooood\\Java cource\\Java P-5 -(GUI)\\UserInfo.ser");
//         ObjectInputStream in = new ObjectInputStream(fileIn);

//         user = (User) in.readObject();
//         in.close();
//         fileIn.close();

//         // System.out.println(user.name);
//         // System.err.println(user.password);
//         // user.sayHello();

//         // long serialVersionID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
//         // System.out.println(serialVersionID);

//     }
// }









