public class Impressora{
  public void exibir (float f){
    System.out.println(f);
  }

  //byte: 1 byte
  //short: 2 bytes
  //int: 4 bytes
  //long: 8 bytes
  public void exibir(byte b1, byte b2){
    System.out.println (b1 + ", " + b2);
  }

  public void exibir (short s, long l){
    System.out.println(s + ", " + l);
    return;
  }

  public void testeForEach(){
    int [] v = new int[]{1, 2, 3, 3};

    for (int i = 0; i < v.length; i++){
      System.out.println(v[i]);
    }

    for (int valor : v){
      System.out.println(valor);
    }
  }
}