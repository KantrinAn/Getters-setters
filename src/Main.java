public class Main {
    public static void main(String[] args) {
        User user1 = new User("Ірина","Вітовська", 14, "05", 1998,"test@gmail.com","3807778866",66,"120/80", 7000);
      user1.setSecondName("Романченко");
      User user2 = new User("Максим", "Коцюбинський", 14, "07", 1986, "user2@gmail.com", "380667755000", 89, "120/60", 12000 );
      user2.setSteps(20000);
      User user3 = new User("Олена","Пчілка", 30, "11", 1991,"user3@gmail.com", "380675588822", 60,"110/50", 25000);
      user3.setWeight(55);
      User user4 = new User("Іван", "Шевченко", 25, "03", 1970, "user4@gmail.com", "380504499922", 90, "130/70", 6000);

        User[] users = {user1, user2, user3,user4};
        for (User u : users){
            u.printAccountInfo();
        }


    }
}