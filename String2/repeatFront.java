public String repeatFront(String str, int n) {
  //created a temp String , substring is used to trim the string 
  String temp = str.substring(0,n);
  String res="";
  
  for(int i =0 ; i<n ;i++){
    res = res + temp;
    temp = temp.substring(0,n-i-1);
    
  }
  return res;
}
