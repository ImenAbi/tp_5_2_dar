package rmiServer;

import rmiService.BanqueImpl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class BanqueServer {
    public static void main(String[] args) {
        try {
            // Créer un registre RMI
            Registry registry = LocateRegistry.createRegistry(1099);

            // Créer une instance de BanqueImpl
            BanqueImpl banqueImpl = new BanqueImpl();

            // Lier l'objet distant dans le registre
            registry.rebind("BanqueService", banqueImpl);

            System.out.println("Serveur prêt !");
        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
