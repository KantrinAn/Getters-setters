public class User {
     int age;
     private String firstName;
    public String getFirstName() {
        return firstName;
    }
    private int yearOfBirth;
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    private String monthOfBirth;
    public String getMonthOfBirth() {
        return monthOfBirth;
    }
    private int dayOfBirth;
    public int getDayOfBirth() {
        return dayOfBirth;
    }
    private String email;
    public String getEmail() {
        return email;
    }
    private String phoneNumber;
    public String getPhoneNumber() {
        return phoneNumber;
    }
    private int weight;
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    private String pressure;
    public String getPressure() {
        return pressure;
    }
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
    private int steps;
    public int getSteps() {
        return steps;
    }
    public void setSteps(int steps) {
        this.steps = steps;
    }
    private String secondName;
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public  User(String firstName, String secondName, int dayOfBirth, String monthOfBirth, int yearOfBirth, String email, String phoneNumber, int weight, String pressure, int steps) {
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
    public int getAge() {
        int age = 2020 -yearOfBirth;
         return age;
    }
        public void printAccountInfo(){
        System.out.println("Персональні дані " + firstName +" "+ secondName + ", дата народження: "+ dayOfBirth+"."+monthOfBirth+"."+ yearOfBirth+", вік:"+ getAge() +", вага: "+ weight+", тиск: "+ pressure+", зроблено кроків: "+steps+", електрона пошта: "+ email+", номер телефону: "+phoneNumber);
    }
    }
