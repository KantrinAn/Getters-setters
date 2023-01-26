public class User {
    private String firstName;

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    private int yearOfBirth;
    private String monthOfBirth;
    private int dayOfBirth;
      private String email;
    private String phoneNumber;

    public int getAge() {
        int age = 2020 -yearOfBirth;
        return age;
    }

    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int weight;
    public String pressure;
    public int steps;
    public String secondName;

    public User(String firstName,String secondName, int dayOfBirth, String monthOfBirth, int yearOfBirth, String email, String phoneNumber, int weight, String pressure, int steps) {
        this.firstName = firstName;
        this.dayOfBirth= dayOfBirth;
        this.monthOfBirth= monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.secondName = secondName;
    }
        public void printAccountInfo(){
        System.out.println("Персональні дані " + firstName +" "+ secondName + ", дата народження: "+ dayOfBirth+"."+monthOfBirth+"."+ yearOfBirth+", вік:"+ getAge() +", вага: "+ weight+", тиск: "+ pressure+", зроблено кроків: "+steps+", електрона пошта: "+ email+", номер телефону: "+phoneNumber);
    }


    }
