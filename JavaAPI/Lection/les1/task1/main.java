package JavaAPI.Lection.les1.task1;

class Person {
    String name;
    int age;

    void printInfo() {
        System.out.println("name is" + name + " " + age);
    }
}

class HelloWorld{
    public static void main(String[]args){
        Person OBJ = new Person();
        OBJ.age = 12;
        OBJ.name = "Dadaya";
        OBJ.printInfo();
        Person OBJ1 = new Person();
        OBJ1.printInfo();
    }
}



