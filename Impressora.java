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
}