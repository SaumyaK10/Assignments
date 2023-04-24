class A
{
 public void display()
 {
  System.out.println("This msg is being displayed from class A");  
 }
}

class B
{
 public static void main(String args[])
 {
  System.out.println("This is class B executing");  
  A obj = new A();
  obj.display();
 }
}

