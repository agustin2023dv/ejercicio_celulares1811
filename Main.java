public class Main {

    public static void main(String[]args){
        Motorola m9 = new Motorola("motorola");
        Iphone x10 = new Iphone("apple");

        Persona pedro = new Persona("pedro", m9);
        Persona pablo = new Persona("pablo",x10);

        pedro.llamar(pablo,10);
    }
}
