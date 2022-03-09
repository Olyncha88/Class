package com.company;

public class Main {

    public static void main(String[] args) {

        // создано 3 новых объектов
        CreditCard card1 = new CreditCard(231020304, 1200);
        CreditCard card2 = new CreditCard(231020105, 1250);
        CreditCard card3 = new CreditCard(231020106, 1350);

        double card1Repl = card1.replCard(200); // пополнили на 200 card1
        System.out.println(card1.accountNumber + " card1: пополнено успешно." + " Текущее состояние счета: " + card1Repl);

        double card2Repl = card2.replCard(250); // пополнили на 250 card2
        System.out.println(card2.accountNumber + " card2: пополнено успешно." + " Текущее состояние счета: " + card2Repl);

        double card3with = card3.withdrawFromCard(350); // сняли 350 с card3
        System.out.println(card3.accountNumber + " card3: списано успешно." + " Текущее состояние счета: " + card3with);
            }
}
