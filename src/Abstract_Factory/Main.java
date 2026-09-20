package Abstract_Factory;

public class Main {

    public static void main(String[] args) {

        GUIFactory windowsFactory = new WindowsFactory();
        Application windowsApp = new Application(windowsFactory);

        System.out.println("Windows UI:");
        windowsApp.renderUI();


        GUIFactory macFactory = new MacFactory();
        Application macApp = new Application(macFactory);

        System.out.println("\nMac UI:");
        macApp.renderUI();
    }
}