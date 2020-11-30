package com.swetha;
/* Anonymous class would not have name, it an inner class while defining the object
 * It would be used only once for the object it was created.
 * 
*/
class L{
	public void show() {
		System.out.println("In Class L");
	}
}
public class AnonymousEg {

	public static void main(String[] args) {
		
		L l = new L();
		L ll = new L(){
						public void show() {
							System.out.println("In Anonymous class with out a name");
						}
						};
		l.show();
		ll.show();
	}

}
