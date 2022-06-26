public class Animal {
    private int age;
    private double weight;

    public Animal(int age, double weight){
        this.age = age;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("会吃饭");
    }

    public void run(){
        System.out.println("会走路");
    }
}
