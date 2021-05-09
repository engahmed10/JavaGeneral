
public class A {
	

    //instance variable
    private long id;

    //default constructor
    public A(){
    	//this goes to alternate constructor
        this(2L);  //call alternate constructor
        //this(); //can't do recursive Constructor, only can do argument different constructor
        System.out.println("iam here");
    }
    


    //alternate constructor
    public A(long id){
        initialize(); // call initialize method 
        this.id = id;
    }

    //get method
    public long getId(){  return this.id; }

    //set method
    public void setId(long id) { this.id = id; }

    //initialize method
    private void initialize(){
        System.out.println("initializing the class…");
    }
    
    
    private void initialize1(){
        System.out.println("initializing1 the class…");
    }
	

}
