public class Lin_Lucy_OOQuiz1 {
   public static void main(String[] args){
      //3 cookies one guy. And a vegetable
      Human weirdGuy = new Human("Ryan Luo", 65, 70);
      Vegetable lettuce = new Vegetable("Lettuce", 100, 100);
      Cookie chocoChip = new Cookie();
      Cookie peanutButter = new Cookie ("Peanut butter cookie", 50, 300);
      Cookie snickerdoodle = new Cookie("Snickerdoodle", 50, 250, true);
      
      //Trying to eat a packaged cookie then eating a cookie and gaining energy
      weirdGuy.eat(snickerdoodle, 69);
      snickerdoodle.open();
      weirdGuy.eat(snickerdoodle, 25);
      System.out.println(weirdGuy);
      System.out.println(snickerdoodle);
      
      //Trying to eat too much of a vegetable
      weirdGuy.eat(lettuce, 200);
      System.out.println(lettuce.eaten(200));
   }
}