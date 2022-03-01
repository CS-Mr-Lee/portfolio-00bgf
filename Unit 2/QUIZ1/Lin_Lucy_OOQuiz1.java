public class Lin_Lucy_OOQuiz1 {
   public static void main(String[] args){
      Human weirdGuy = new Human("Ryan Luo", 65, 70);
      Vegetable lettuce = new Vegetable("Lettuce", 100, 100);
      Cookie chocoChip = new Cookie();
      Cookie peanutButter = new Cookie ("Peanut butter cookie", 50, 300);
      Cookie snickerdoodle = new Cookie("Snickerdoodle", 50, 250, true);
      
      weirdGuy.eat(snickerdoodle, 69);
      weirdGuy.eat(peanutButter, 10000);
      snickerdoodle.open();
      weirdGuy.eat(snickerdoodle, 25);
      System.out.println(weirdGuy);
      System.out.println(snickerdoodle.eaten(25));
      
      //I think you deleted the quiz requirements so i'm just gonna start freestyling here and pray i hit all the points
      weirdGuy.eat(lettuce, 15);
      lettuce.eaten(15);
      System.out.println(lettuce);
   }
}