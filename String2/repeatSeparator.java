public String repeatSeparator(String word, String sep, int count) {
  String[] arr = new String[count];
  for(int i=0; i<count; i++) {
    arr[i] = word;
  }
  return String.join(sep, arr);
}
