package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        class TextBox {
            String texto;
            int ancho, alto;

            @Override
            public String toString() {
                return ancho + "x" + alto + "\n" +
                        "┏" + "━".repeat(ancho) + "┓\n" +
                        ("┃" + " ".repeat(ancho) + "┃\n").repeat((alto - 1) / 2) +
                        (alto > 0 ? "┃" + " ".repeat((ancho - texto.length() + 1) / 2) + texto + " ".repeat((ancho - texto.length()) / 2) + "┃\n" : "") +
                        ("┃" + " ".repeat(ancho) + "┃\n").repeat(alto / 2) +
                        "┗" + "━".repeat(ancho) + "┛\n";
            }
        }
        }<w
    }
0