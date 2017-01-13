package p1;

class M {
      public void method(Object o){
            System.out.println("Object Verion");
      }
      
      public void method(String s){
            System.out.println("String Version");
      }
      
      public void method(Integer s){
          System.out.println("String Version");
      }
      
      public void method2(boolean... i){
          System.out.println("byte");
      }
      
      public void method2(int... i){
          System.out.println("int");
      }
      
     /* public void method2(Object... i){
          System.out.println("Object");
      }*/
      
      public static void main(String args[]){
            M q = new M();
            //q.method(null);
            q.method2();
      }
}
