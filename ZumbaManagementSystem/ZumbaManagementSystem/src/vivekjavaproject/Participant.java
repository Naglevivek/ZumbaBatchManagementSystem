package vivekjavaproject;

public class Participant {
   private String name;
   private int  age;
   private String batchName;
   public Participant(String name,int age,String batchName){
	   this.name=name;
	   this.age=age;
	   this.batchName=batchName;
   }
   // getter and setter method 
   public String getName(){
	   return name;
   }
   public void setName(String name){
	   this.name=name;
   }
   public int  getAge(){
	   return age;
   }
   public void setAge(){
	   this.age=age;
   }
   public String getBatchName(){
	   return batchName;
   }
   public void setBatchName(){
	   this.batchName=batchName;
   }
   public void onBatchStartMessage(String message) {
       System.out.println("Hi " + name + ", " + message);
   }
}
