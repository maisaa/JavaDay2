package daytwo;
public class Person {
    public static int counter =0;
    public  String fname; 
    public  String lname;
    private String adress;
    private int DoB;
    public String nationality;
    private String city;
    private int weight;
    private int heigth;
    public boolean isMale;
    ////////////////////////////
    //-------constructors------
    public Person(){
    this.counter ++ ;
    }
    
    public Person( String fname,String lname
               , String adress,int DoB, String nationality, String city, 
                 int weight,int heigth, boolean isMale ){
    this.counter ++ ;
    this.fname = fname;
    this.lname = lname;
    this.adress = adress;
    this.DoB =DoB;
    this.nationality = nationality;
    this.city = city;
    this.weight = weight;
    this.heigth = heigth;
    this.isMale = isMale;
    }
    
    //////////////////////////////////////////
    //---------methods-----------------------
    public String getFullName(String fname, String lname ){
        String fullname = fname+lname;
        return fullname;
    }
    //...........................................
    public double getHeightInFeet(int heigth){
      double feet = (heigth/2.54)*12 ;
      return feet;
    }
    //...........................................
    public int getAge(int carentDate){
      return carentDate-this.getDoB();
    }
    //...........................................
    public void eating(){
        this.setWeight(this.getWeight() + 1);
      System.out.println("I’m eating! and mu weight now is = "+this.getWeight());
    }
    //...........................................
    public  void getInfo(){
      System.out.println("Person info :"+this.fname+" "+this.lname+" "+
              this.getAdress()+" "+this.nationality);
    }
    //...........................................
    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the DoB
     */
    public int getDoB() {
        return DoB;
    }

    /**
     * @param DoB the DoB to set
     */
    public void setDoB(int DoB) {
        this.DoB = DoB;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the heigth
     */
    public int getHeigth() {
        return heigth;
    }

    /**
     * @param heigth the heigth to set
     */
    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

} 

