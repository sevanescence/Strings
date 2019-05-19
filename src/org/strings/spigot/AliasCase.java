package org.strings.spigot;

public class AliasCase {

    public static String fixAlias(String string) {

        if (string.trim().contains(" ")) {

            string = string.trim().replaceAll(" ", "_").toUpperCase();

        }

        return string;

    }

}
