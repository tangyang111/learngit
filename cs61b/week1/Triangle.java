class Triangle
{
	public static void main(String[] args){
		int N = 10;
		DrawTriangle(N);
	}
	public static void DrawTriangle(int N) {
		for (int i = 0;i < N;i++ )
		{
			for (int j=0;j<=i ;j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}