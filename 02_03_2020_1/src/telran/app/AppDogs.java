package telran.app;

import telran.data.Dog;

public class AppDogs {

    //это по сути Main

    //будет запускать нашу программу

    public static void main(String[] args) {
        //Dog dog1 = new Dog();
        //dog1.age = 2;
        //dog1.breed = "husky";
        //dog1.nickName = "Gavrik";
        //dog1.weight = 48.5;


        Dog dog2 = new Dog("Sharik",  3, "Pudel", 8);
        Dog dog1 = new Dog("Gavrik", 10, "Husky", 48);

        dog2.dogSleep();
        dog1.dogRun();

        dog1.display();
        System.out.println();
        dog2.display();
        System.out.println();
        System.out.println(dog1.getNickName());

        dog1.setNickName("Bublik");
        System.out.println(dog1.getNickName());

        System.out.println(dog1.toString());
        }
    }

