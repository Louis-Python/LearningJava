package main;

public class Hedgehog {
    private String name;
    private int age;
  
    public Hedgehog() {
      this("Pikseli", 5); 
    }
  
    public Hedgehog(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    public void speak(String message) {
      if (message == null || message.isEmpty()) {
        System.out.println("I am " + this.name + " and my age is " + this.age + ", but could you still give me input values?");
      } else {
        System.out.println(this.name + ": " + message);
      }
    }
  
    public void run(int laps) {
      if (laps <= 0) {
        System.out.println("Wrong input value");
        return;
      }
      for (int i = 0; i < laps; i++) {
        System.out.println(this.name + " runs really fast!");
      }
    }
  
    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    public int getAge() {
      return age;
    }
  
    public void setAge(int age) {
      this.age = age;
    }
  }