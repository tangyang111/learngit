class HWE2 {
   public static int max(int[] m) {
       int len = m.length;
	   int max = 0;
	   for (int i = 0;i < len;i++ )
	   {
		   if (m[i] > max)
		   {
			   max = m[i];
		   }

	   }
	   return max;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; 
	  System.out.print(max(numbers));
   }
}