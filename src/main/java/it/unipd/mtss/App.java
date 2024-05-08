package it.unipd.mtss;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		boolean a = true;
		boolean b = false;

		boolean c = (a & b) | (b ^ a); // OK, 1(&) + 1(|) + 1(^) = 3 (max allowed 3)

		boolean d = (a & b) | (b ^ a) | (a ^ b);
		// violation above, 'Boolean expression complexity is 5 (max allowed is 3)'
		// 1(&) + 1(|) + 1(^) + 1(|) + 1(^) = 5

		boolean e = a ^ (a || b) ^ (b || a) & (a | b);
		// violation above, 'Boolean expression complexity is 6 (max allowed is 3)'
		// 1(^) + 1(||) + 1(^) + 1(||) + 1(&) + 1(|) = 6
	}
}
