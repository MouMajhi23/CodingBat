public String getSandwich(String str) {

  int index = str.indexOf("bread")+"bread".length();
  int lastIndex = str.lastIndexOf("bread");
  String temp = "";
  for(int i=index ; i< lastIndex ; i++){
    temp = temp +str.charAt(i);
  }
return temp;

}
