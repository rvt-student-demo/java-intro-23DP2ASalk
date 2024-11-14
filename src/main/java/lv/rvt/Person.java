package lv.rvt;

public class Person {
            private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }    
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    public int getHeight() {
        return this.height;
    }
    
        
}
