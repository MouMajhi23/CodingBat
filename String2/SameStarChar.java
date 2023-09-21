public boolean sameStarChar(String str) {
  boolean flag = true;
  if(str.equals("")|| str.length()<3)
    return true;
  for(int i = 1 ; i<str.length()-1 ; i++){
    if(str.charAt(i)=='*'){
      if(str.charAt(i-1)!=str.charAt(i+1)){
        flag=false;
      }
       else
         flag=true;
      
    }
   
  }
 return flag;
}
