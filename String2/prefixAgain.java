public boolean prefixAgain(String str, int n) {
  String res = str.substring(n,str.length());
 
  return (res.contains(str.substring(0,n)));
}
