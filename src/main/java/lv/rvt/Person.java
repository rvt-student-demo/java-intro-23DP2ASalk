package lv.rvt;

public class Person {
    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;
    private int age;
	private String address;


    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
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
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedPerson = (Person) compared;

        if (this.name == comparedPerson.name
                && this.height == comparedPerson.height
                && this.weight == comparedPerson.weight
                && this.birthday.getYear() == comparedPerson.birthday.getYear()
                && this.birthday.getMonth() == comparedPerson.birthday.getMonth()
                && this.birthday.getDay() == comparedPerson.birthday.getDay()) {
            return true;
        }

        return false;
    }
    public Person (String name, String address) {
		this.name=name;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String toString() {
		return name + '\n' + "  " + address;
	}
    public String toCsvRow() {
        return String.format("%s, %d, %d, %d", name, age, weight, height);
    }
}
