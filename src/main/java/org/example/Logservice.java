package org.example;

import java.io.IOException;

import static spark.Spark.*;

public class Logservice {

    public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/public");

        get("log", (req, res) -> {
            String msg = "";
            return logMessage(msg);
        });
    }

    private static String logMessage(String msg) throws IOException {
        return HttpConnectionExample.logMessage(msg);
    }


    private static int getPort() {
        if(System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}