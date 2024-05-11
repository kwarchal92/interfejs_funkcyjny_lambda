package interfejs_funkcyjny_wyrazenie_lambda;


interface Liczba //Interfejs funkcyjny o nazwie liczba
{
    double pobierzWartosc(); //metoda abstrakcyjna
}
public class Main {
    public static void main(String[] args)
    {
        Liczba zmienna;

        zmienna = () -> Math.PI; //wyrazenie lambda

        System.out.println("Pi = " + zmienna.pobierzWartosc() + ".");
    }
}
