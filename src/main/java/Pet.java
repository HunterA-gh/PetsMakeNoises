public class Pet {
    public String name;

    public void speak(){
        System.out.println("Animals make noises!");
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return name;
    }

}

class Cat extends Pet {
    public Cat(String catName) {
    }

    public void speak() {
        System.out.println("Meow");
    }
}


class Dog extends Pet {

    public Dog(String dogName) {
    }

    public void speak() {
        System.out.println("Woof");
    }
}

class Horse extends Pet {

    public Horse(String horseName) {
    }

    public void speak() {
        System.out.println("Weesnaw");
    }
}

class Bird extends Pet {

    public Bird(String birdName) {
    }

    public void speak() {
        System.out.println("Chirp");
    }
}

class Snake extends Pet {

    public Snake(String snakeName) {
    }

    public void speak() {
        System.out.println("Hiss");
    }
}