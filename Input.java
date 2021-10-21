package OutputInput;

import java.io.IOException;

public class Input {
	
	public static void main(String[] args) throws IOException {
		
		//[Input]
		/*
		 ÄÜ¼Ö Ãâ·Â
		 1. print()
		 2. println()
		 3. printf()
		 
		 ÄÜ¼Ö ÀÔ·Â
		 1. System.in.read()
		 	- »ç¿ëÀÚ°¡ ÀÔ·ÂÇÑ ¹®ÀÚ¸¦ ÀĞ¾î¿À´Â ±â´É
		 	- ÀĞ¾î¿Â ¹®ÀÚ¸¦ ¼ıÀÚ(¹®ÀÚ ÄÚµå°ª)·Î µ¹·ÁÁØ´Ù.
		 	- ¿µ¾î¿Í ¼ıÀÚ, Æ¯¼ö¹®ÀÚ(ASCII)¸¸ ÀÔ·Â°¡´É. 1¹ÙÀÌÆ® ÀÔ·Â¸¸ °¡´É
		
		 2. BufferedReader Å¬·¡½º
		 3. Scanner Å¬·¡½º
		 
		 */
		
		//¿ä±¸»çÇ×] »ç¿ëÀÚ¿¡°Ô ¹®ÀÚ 1°³¸¦ Å°º¸µå·Î ÀÔ·Â¹Ş¾Æ ±×´ë·Î È­¸é¿¡ Ãâ·ÂÇÏ½Ã¿À.
		//ÀÔ·Â : A
		//Ãâ·Â : ÀÔ·ÂÇÏ½Å ¹®ÀÚ´Â AÀÔ´Ï´Ù.
		
		//»ç¿ëÀÚ·ÎºÎÅÍ Å°º¸µå ÀÔ·ÂÀ» ¹Ş´Â´Ù.
		//System.out.print("ÀÔ·Â : ");
		
		//´ë±â »óÅÂ. ºí·°(Block) °É·È´Ù.
		//int data = System.in.read();
		
		//System.out.println(data);
		
		//Char -> °Ñ(¹®ÀÚ), ¼Ó(¼ıÀÚ)
		//System.out.printf("ÀÔ·ÂÇÏ½Å ¹®ÀÚ´Â %cÀÔ´Ï´Ù.\n", data); //printf
		//System.out.println((char)data); //Çüº¯È¯(int -> char º¯È¯)*****
		
		//----------------------
		// ´ë¹®ÀÚ(26°³)
		// A -> 65 *******¾Ï±â
		// B -> 66
		// C -> 67
		// D -> 68
		// E -> 69
		// ...
		// Z -> 90
		// a -> 97 *******
		// z -> 122 ***
		// 0 -> 48 ******
		// 9 -> 57 **
		// ¤¡,¤¤,¤§
		// °¡,³ª,´Ù,¶ó..
		// °¡ ~ ÆR
		//----------------------
		
		// System.in.read() x 1È¸ -> ¹®ÀÚ 1°³ ÀÔ·Â

		System.out.print("ÀÔ·Â: "); //A

		int data = System.in.read(); // ¹öÆÛ¾ÈÀÇ 1¹®ÀÚ¸¦ °¡Á®¿Í¶ó
		System.out.println(data); //65

		data = System.in.read(); // ¹öÆÛ
		System.out.println(data); //13

		data = System.in.read(); // ¹öÆÛ
		System.out.println(data); //10

		data = System.in.read(); // ¹öÆÛ
		System.out.println(data);

		data = System.in.read();
		System.out.println(data);

		data = System.in.read();
		System.out.println("Á¾·á");
		
		
	}//main

}
