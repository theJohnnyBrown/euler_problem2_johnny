class Fib{
  public static void main(String args[]){
    long sum = 0;
    long current = 0;
    int i = -2;
    while (current<4000000){
      sum = sum + current;
      i = i+3;
      current = fibIndex(i); 
      if (current < 1000) System.out.println(current+"");
      if (current > 3000000) System.out.println(current+"");
    }
    System.out.println("the sum is " + sum);
  }

  static int fibIndex(int index){
    if (index == 0) return 1;
    if (index == 1) return 2;
    return fibIndex(index-1) + fibIndex(index-2);
  }
  
  static long fibIndex(long index){
    if (index == 0) return 1;
    if (index == 1) return 2;
    return fibIndex(index-1) + fibIndex(index-2);
  }
}
