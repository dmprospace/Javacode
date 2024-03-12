class Area {
  int i,j;
  
 private Area() {
    i=1;
    j=0;
    System.out.println("Area Created=" + i*j);
  }
 
 public void Area () {
      System.out.println("Area again =" + i*j);
    
  }
  
  public void getArea() {
    System.out.println("Area=" + i*j);
  }
  
  public void setArea(int l, int b) {
    i=l;
    j=b;
  }

  public static void main (String args[]) { 
   Area a = new Area();
   a.Area();
   a.getArea();
   a.setArea(3,4);
   a.getArea(); 
  }

}