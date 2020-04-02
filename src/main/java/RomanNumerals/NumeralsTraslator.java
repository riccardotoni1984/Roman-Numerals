package RomanNumerals;

public class NumeralsTraslator {

    public String translateToNumerals(int number) {
        String numeralsToreturn = "";
        for(NumberToNumerals numberToNumerals: NumberToNumerals.values()){
            while(number >= numberToNumerals.number){
                numeralsToreturn += numberToNumerals.numeral;
                number -= numberToNumerals.number;
            }
        }
        return numeralsToreturn;
    }

    enum NumberToNumerals {
        THOUSAND(1000, "M"),
        NINE_HUNDRED(900, "CM"),
        FIVE_HUNDRED(500, "D"),
        FOUR_HUNDRED(400, "CD"),
        HUNDRED(100, "C"),
        NINETY(90, "XC"),
        FIFTY(50, "L"),
        FORTY(40, "XL"),
        TEN(10, "X"),
        NINE(9, "IX"),
        FIVE(5, "V"),
        FOUR(4, "IV"),
        ONE(1, "I");

        private int number;
        private String numeral;

        NumberToNumerals(int number, String numeral) {
            this.number = number;
            this.numeral = numeral;
        }


    }

}