
class MySingleton {
  // the static singleton object
  private static MySingleton theObject;

  private MySingleton() {
  }

  public static MySingleton createMySingleton() {

    if (theObject == null)
      theObject = new MySingleton();

    return theObject;
  }
}

public class MySingletonEx {
  public static void main(String[] args) {
    MySingleton ms1 = MySingleton.createMySingleton();

    MySingleton ms2 = MySingleton.createMySingleton();

    MySingleton ms3 = MySingleton.createMySingleton();



    System.out.println(ms1 == ms2);
    System.out.println(ms1);
    System.out.println(ms2);
    System.out.println(ms3);

  }
}
