class declare{
   private String name;
    int age;

    private void display(){
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
    }

    public void setvalue(String a,int b){
        name = a ;
        age = b;
        display();

    }

    public String getname(){
        return name;

    }
    
  
    
}

class objectandclass{
      public static void main(String[] args){
        
        declare obj = new declare();
        obj.setvalue("sanjay", 20);
        String name = obj.getname();
        System.out.println("Name is: " + name);
    

    }
}
