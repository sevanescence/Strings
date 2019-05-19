package org.strings.spigot;

public class Ampersand {

    public static String replaceAmpersands(String string) {

        if (string.contains("&")) {

            string = string.replaceAll("&", "§");

        }

        return string;

    }

}
