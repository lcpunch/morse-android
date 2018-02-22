package com.example.eleves.codemorse;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by eleves on 2018-02-22.
 */

public class Traducteur implements TraducteurMorse {

    Map<String, String> dictionnaire = new HashMap<String, String>();

    public Traducteur() {

        dictionnaire.put("A", ".-");
        dictionnaire.put("B", "-...");
        dictionnaire.put("C", "-.-.");
        dictionnaire.put("D", "-..");
        dictionnaire.put("E", ".");
        dictionnaire.put("F", "..-.");
        dictionnaire.put("G", "--.");
        dictionnaire.put("H", "....");
        dictionnaire.put("I", "..");
        dictionnaire.put("J", ".---");
        dictionnaire.put("K", "-.-");
        dictionnaire.put("L", ".-..");
        dictionnaire.put("M", "--");
        dictionnaire.put("N", "-.");
        dictionnaire.put("O", "---");
        dictionnaire.put("P", ".--.");
        dictionnaire.put("Q", "--.-");
        dictionnaire.put("R", ".-.");
        dictionnaire.put("S", "...");
        dictionnaire.put("T", "-");
        dictionnaire.put("U", "..-");
        dictionnaire.put("V", "...-");
        dictionnaire.put("W", ".--");
        dictionnaire.put("X", "-..-");
        dictionnaire.put("Y", "-.--");
        dictionnaire.put("Z", "--..");

        dictionnaire.put("0", "----");
        dictionnaire.put("1", ".----");
        dictionnaire.put("2", "..---");
        dictionnaire.put("3", "...--");
        dictionnaire.put("4", "....-");
        dictionnaire.put("5", ".....");
        dictionnaire.put("6", "-....");
        dictionnaire.put("7", "--...");
        dictionnaire.put("8", "---..");
        dictionnaire.put("9", "----.");

    }

    /**
     * Traduit du code Morse international en caracteres latins.
     * Les symboles permis sont ., -, / et l’espace. Si la chaine
     * fournie n’est pas du Morse, ...
     *
     * @param morse Une chaine de caracteres contenant un message en
     * code Morse
     * @return L’equivalent en caracteres latins.
     */
    @Override
    public String toAlpha(String morse) {

        

        return null;
    }

    @Override
    public String toMorse(String alpha) {
        return null;
    }

    @Override
    public String nettoyerAlpha(String alpha) {
        return null;
    }

    @Override
    public String getNomProgrammeurs() {
        return null;
    }
}