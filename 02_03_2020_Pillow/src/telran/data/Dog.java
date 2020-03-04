package telran.data;

public class Dog {

    //сначала прописываем "поля" - св-ва, хар-ки

    //public String nickName;
    //public  int age;
    //public String breed;
    //public double weight;
    //public boolean dogStatus;

    //меняем на приват

    private String nickName;
    private int age;
    private String breed;
    private double weight;
    public boolean dogStatus;

    // конструктор как только заведем свой, тот, что по умолчанию, перестанет работать
    // фиолетовым выделены поля, а беленьким уже конкретика
    // конструктор создали в отдельном классе
    // cmd + n создать конструктор автоматом


    public Dog(){}; //если это заккомментить будет ругать во втором нашем классе, будет просит три наши параметры
    public Dog(String nickName, int age, String breed, double weight){   //в скобках параметры
        this.nickName = nickName;
        this.age = age;
        this.breed = breed;
        this.weight = weight;

    }

    //делаем метод для дог статуса

    public void dogSleep(){
        this.dogStatus = true;

    }

    public void dogRun(){
        this.dogStatus = false;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    public String getNickName() {  //getter можем обратиться в любой момент и открыть
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void display(){
        System.out.println("Nickname: " + nickName);
        System.out.println("Breed: " + breed);
        System.out.println("Weight of " + nickName + " is:" + weight);
        System.out.println("Age: " + age);
        System.out.println(nickName + " " + (dogStatus? "sleep":"run"));
    }

    @Override
    public String toString() {
        return "Dog: " +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                ", dogStatus=" + (dogStatus? "sleep":"run");

    }
}
