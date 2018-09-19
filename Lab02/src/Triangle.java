/** 
 * CMSC 256 Lab 02
 * Determines if three doubles can be sides of triangle. 
*/
public class Triangle  {

   /** Length of side 1. */
   private double sideA;

   /** Length of side 2. */
   private double sideB;

   /** Length of side 3. */
   private double sideC;

   /**
    * Creates a Triangle.
    *
    * @param aIn length of side 1.
    * @param bIn length of side 2.
    * @param cIn length of side 3.
    */
   public Triangle(double aIn, double bIn, double cIn) {
      sideA = aIn;
      sideB = bIn;
      sideC = cIn;

      if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
         throw new IllegalArgumentException("Sides: " + sideA + " " + sideB
            + " " + sideC
            + " -- each must be greater than zero.");
      }
      if ((sideA >= sideB + sideC) || (sideB >= sideA + sideC) || (sideC >= sideA + sideB)) {
         throw new IllegalArgumentException("Sides: "
            + sideA + " " + sideB + " " + sideC
            + " -- not a triangle.");
      }
   }

   /**
    * Classifies a triangle based on the lengths of the three sides.
    *
    * @return the triangle classification.
    */
   public String classify() {
      String result = "not a triangle";

      if ((sideA == sideB) && (sideB == sideC)) {
         result = "equilateral";
      }
      else if ((sideA != sideB) && (sideA != sideC) && (sideB != sideC)) {
         result = "scalene";
      }
      else {
         result = "isosceles";
      }
   
      return result;
   }
   
   public String toString() {
	   return " Sides: " + sideA + ", " + sideB + ", " + sideC;
   }
   
   public static void main(String[] args) {
	   try {
		   Triangle test1 = new Triangle(3.0, 4.0, 5.0);
		   System.out.println("Test #01:" + test1.toString() +  " Result: "  + test1.classify());
	   }
	   catch(IllegalArgumentException e) {
		   e.printStackTrace();
	   }
	   
	   try {
		   Triangle test1 = new Triangle(3.0, 3.0, 3.0);
		   System.out.println("Test #02:" + test1.toString() +  " Result: "  + test1.classify());
	   }
	   catch(IllegalArgumentException e) {
		   e.printStackTrace();
	   }
	   
	   try {
		   Triangle test1 = new Triangle(3.0, 3.0, 5.0);
		   System.out.println("Test #03:" + test1.toString() +  " Result: "  + test1.classify());
	   }
	   catch(IllegalArgumentException e) {
		   e.printStackTrace();
	   }
	   
	   try {
		   Triangle test1 = new Triangle(0.0, 3.0, 5.0);
		   System.out.println("Test #04:" + test1.toString() +  " Result: "  + test1.classify());
	   }
	   catch(IllegalArgumentException e) {
		   // System.out.println("Test #04: ");
		   e.printStackTrace();
	   }
	   
	   try {
		   Triangle test1 = new Triangle(3.0, 0.0, 5.0);
		   System.out.println("Test #05:" + test1.toString() +  " Result: "  + test1.classify());
	   }
	   catch(IllegalArgumentException e) {
		   // System.out.println("Test #05: ");
		   e.printStackTrace();
	   }
	   
	   try {
		   Triangle test1 = new Triangle(3.0, 1.0, 0.0);
		   System.out.println("Test #06:" + test1.toString() +  " Result: "  + test1.classify());
	   }
	   catch(IllegalArgumentException e) {
		   // System.out.println("Test #06: ");
		   e.printStackTrace();
	   }
	   
	   try {
		   Triangle test1 = new Triangle(3.0, 1.0, 1.0);
		   System.out.println("Test #07:" + test1.toString() +  " Result: "  + test1.classify());
	   }
	   catch(IllegalArgumentException e) {
		   // System.out.println("Test #06: ");
		   e.printStackTrace();
	   }
	   
	   try {
		   Triangle test1 = new Triangle(1.0, 3.0, 1.0);
		   System.out.println("Test #08:" + test1.toString() +  " Result: "  + test1.classify());
	   }
	   catch(IllegalArgumentException e) {
		   // System.out.println("Test #06: ");
		   e.printStackTrace();
	   }
	   
	   try {
		   Triangle test1 = new Triangle(1.0, 1.0, 3.0);
		   System.out.println("Test #09:" + test1.toString() +  " Result: "  + test1.classify());
	   }
	   catch(IllegalArgumentException e) {
		   // System.out.println("Test #06: ");
		   e.printStackTrace();
	   }
	   
	   try {
		   Triangle test1 = new Triangle('a', 1.0, 1.0);
		   System.out.println("Test #10:" + test1.toString() +  " Result: "  + test1.classify());
	   }
	   catch(IllegalArgumentException e) {
		   // System.out.println("Test #06: ");
		   e.printStackTrace();
	   }
	   try {
		   Triangle test1 = new Triangle(-1.0, 1.0, 1.0);
		   System.out.println("Test #11:" + test1.toString() +  " Result: "  + test1.classify());
	   }
	   catch(IllegalArgumentException e) {
		   // System.out.println("Test #06: ");
		   e.printStackTrace();
	   }
	   
//	   System.out.println("Test #01:" + test1.toString() +  " Result: "  + test1.classify());
//	   System.out.println("Test #02:" + test2.toString() +  " Result: "  + test2.classify());
//	   System.out.println("Test #03:" + test3.toString() +  " Result: "  + test3.classify()); 
//	   System.out.println("Test #04:" + test4.toString() +  " Result: "  + test4.classify());
//	   System.out.println("Test #05:" + test5.toString() +  " Result: "  + test5.classify());
	   
   }

}
