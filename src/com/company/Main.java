package com.company;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        /**
         *         Dag Danny, Chris en Marijke,
         *         hieronder vind je de antwoorden die rollen uit de methoden die ik schreef
         */
        // OPDRACHT 1. vul bij de 'y' het gewenste jaartal in.
        Easter e = new Easter();
        // input
        int y = 2020;
        // output
        System.out.println(
                "Op. 1:\nDe datum van pasen voor het jaar " +
                y +
                "is " +
                e.berekenPaasDatum(y)
        );
        //OPDRACHT 2. reverse the values in an array.
        Omkeer o = new Omkeer();
        // input: vul hier de gewenste waarde voor het array in. Bijvoorbeeld:
        o.arrayA = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        o.arrayB = new int [ o.arrayA.length ];
        // output
        o.draaiMaarOm( o.arrayA );
        System.out.println(
                "Op. 2:\n" +
                Arrays.toString( o.arrayB )
        );
        // OPDRACHT 3. woordfrequentie.
        /**
         * ik begon met het idee gewoon een String[] te gebruiken,
         * maar het netjes optellen van occurrences bleek lastig in te puzzelen met de genestte for-loopjes.
         * een HashMap werkte beter, omdat je daarmee de waarden los-maar-toch-gekoppeld kan opslaan,
         * per stuk kan wijzigen en weergeven. Daarom is dat denk ik de beste data structure hier voor.
         */
        Frequentie f = new Frequentie();
        // input: werkt alleen als de string geen leestekens bevat
        // (oplossing: betere regex schrijven die leestekens filtert) (op Frequentie r.11)
        String t  =
                "Condition in for loop is evaluated on each iteration  " +
                "if the condition is true then the statements inside for loop body gets executed. " +
                "Once the condition returns false the statements in for loop does not execute " +
                "and the control gets transferred to the next statement in the program after for loop";
        // output
        f.checkDeTekst(t);

        // OPDRACHT 4
        /**
         * OBJECTS:
         * ========
         * Book
         *  - enum Status: : AWAY/HOME
         *  - date lended
         *  - date returnExpected
         *  - borrowAllowed: borrowerType
         * Borrower
         *  - enum Type: CHILD / ADULT
         *  - enum: fineStatus;
         *
         * LENDING METHODS:
         * ================
         * 1.
         *  boolean checkOutOK(book, borrower) {
         *      if(book.borrowAllowed.equals(borrower.Type)) {
         *      return true;
         *      }
         *      return false;
         * 2.
         *  Book uitgeleend(Book b, Borrower x)
         *  {
         *      if(checkOutOK(b, x)
         *      {
         *          b.setDateLended(LocalDate.now());
         *          if(x.type == CHILD)
         *          {
         *              b.setDateReturnExpected(DateLended.plusWeeks(8);
         *          }else{
         *          b.setDateReturnExpected(DateLended.plusWeeks(6);
         *          }
         *      }
         *      n.setStatus(Status.AWAY);
         *      return b;
         *  }
         *
         *  RETURN METHODS:
         *  ===============
         *  Book returnedOK(Book b, Borrower x)
         *  {
         *      if(b.returnExpected.equals(LocalDate.now()) // TODO of later...
         *      {
         *          b.setStatus(Status.HOME);
         *      }else{
         *          x.setFineStatus(fineStatus.DIKKE_BOETE);
         *      }
         *  }
         *
         */
    }
}
