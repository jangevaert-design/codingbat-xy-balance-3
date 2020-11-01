public class XyBalance3 {
  public boolean xyBalance(String str) {

    return (str.indexOf('x') == - 1 || str.lastIndexOf('x') < str.lastIndexOf('y'));
  }
}
