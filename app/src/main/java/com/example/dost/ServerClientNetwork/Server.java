package com.example.dost.ServerClientNetwork;

import java.io.IOException;
import java.net.ServerSocket;

public class Server implements Runnable{
    private static ServerSocket server;
    private int NumberOfUsers;

    public Server(int port){
        try {
            this.server=new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //TODO: Implement all the functionality to handle all the protocols to and from the client
    @Override
    public void run() {

    }
}