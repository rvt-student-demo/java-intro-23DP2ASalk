package lv.rvt;

public class HealthStation {
    private int totalWeighings;

    public int weigh(Person person) {
        totalWeighings++;
        return person.getWeight();
    }
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    public int weighings() {
        return totalWeighings;
    }
}
