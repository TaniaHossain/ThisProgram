public class ThisProgram {
   int num = 10;
	
   ThisProgram() {
      System.out.println("This is an example program on keyword \"this\"");	
   }
   ThisProgram(int num) {
      this();
      this.num = num;	   
   }
   public void greet() {
      System.out.println("Hi Welcome to Tutorialspoint");
   }
   public void print() {
      int num = 20;
      System.out.println("value of local variable num is : "+num);
      System.out.println("value of instance variable num is : "+this.num);
      this.greet();     
   }
   public static void main(String[] args) {
	  ThisProgram obj1 = new ThisProgram();
      obj1.print();
      ThisProgram obj2 = new ThisProgram(30);
      obj2.print(); 
   }
}