package daytwo;
public class DayTwo {
  public static void main(String[] args) {
      
      Person obj1 = new Person("sonia","Kaboor","Bollywood",1980,"indian","Mombai",50,165,false);
      Person obj2 = new Person("sonia","Kaboor","Bollywood",1980,"indian","Mombai",50,165,false);
      //obj1.counter;
      Person[] arr = new Person[4];
      for( int i=0; i<4; i++ )
      { arr[i] = new Person();}
      
     System.out.println(obj1.counter) ;
    }
    
}
