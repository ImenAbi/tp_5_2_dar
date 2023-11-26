package rmiService;

import metier.Compte;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BanqueImpl extends UnicastRemoteObject implements IBanque {
    public BanqueImpl() throws RemoteException {
        super();
    }

    @Override
    public String creerCompte(Compte c) throws RemoteException {
        // Logique pour créer un compte
        return "Compte créé avec succès";
    }

    @Override
    public String getInfoCompte(int code) throws RemoteException {
        // Logique pour obtenir des informations sur le compte
        return "Informations du compte " + code;
    }
}
