public String repeatEnd(String str, int n) {
  //this will give the end string
  String temp = str.substring(str.length()-n);
  String res = "";
  for(int i = 0 ; i < n ; i++)
    res = res + temp;
  return res;
}
