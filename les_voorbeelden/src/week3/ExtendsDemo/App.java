public class App {
    public static void main(String[] args) {
        Yugo yugo = new Yugo();
        BMW bmw = new BMW();
        Audi audi = new Audi();
        Skoda skoda = new Skoda();
        
        yugo.printVoertuigType();
        bmw.printVoertuigType();
        audi.printVoertuigType();
        skoda.printVoertuigType();
    }
}
