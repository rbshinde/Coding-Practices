public class CanWeOverrideStaticMethod {
  
    public static void main(String args[]) {
      
        Screen scrn = new ColorScreen();
       
        //if we can  override static , this should call method from Child class
        try {
        	 scrn.show(null, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //IDE will show warning, static method should be called from classname
      
    }  
  
}

class Screen{
  
    /*
     * public static method which can not be overridden in Java
     */
	protected  Exception show(Exception ex ,int a) throws Exception{
        System.out.printf("Static method from parent class");
    return new Exception();
    }
}

class ColorScreen extends Screen{
    /*
     * static method of same name and method signature as existed in super
     * class, this is not method overriding instead this is called
     * method hiding in Java
     */
     public RuntimeException show(Exception rx,int b) throws RuntimeException{
        System.err.println("Overridden static method in Child Class in Java");
        return new RuntimeException();
    }
}
