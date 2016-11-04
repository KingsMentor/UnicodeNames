package com.github.kingsmentor.UnicodeNames.OtherSymbols;

/**
 * Created by zone2 on 10/26/16.
 */
public enum Currency {

    Cent('\u00A2', "Cent"),
    Dollar('\u0024', "US Dollar"),
    Pound('\u00A3', "Pound"),
    Current('\u00A4', "Currency"),
    Yen('\u00A5', "Yen"),
    Latin_F('\u0192', "Latin f"),
    Dram('\u058F', "Armenian Dram"),
    Afghani('\u060B', "Afghani"),
    BengaliMark('\u09F2', "Bengali Rupee Mark"),
    BengaliSign('\u09F3', "Bengali Rupee Sign"),
    GujaratiRupee('\u0AF1', "Gujarati Rupee Sign"),
    TamilRupee('\u00BF', "Tamil Rupee Sign"),
    Baht('\u0E3F', "Thai Baht"),
    KhmerRiel('\u17DB', "Khmer Riel"),
    ScriptM('\u2133', "Script Capital M"),
    CJK5143('\u5143', "CJK Ideograph 5143"),
    CJK5186('\u5186', "CJK Ideograph 5186"),
    CJK5706('\u5706', "CJK Ideograph 5706"),
    CJK5713('\u5713', "CJK Ideograph 5713"),
    Rial('\uFDFC', "Rial Sign"),
    EuroCurrency('\u20A0', "Euro Currency Sign"),
    Colon('\u20A2', "Colon"),
    Cruzeiro('\u20A1', "Cruzeiro"),
    Franc('\u20A3', "France Franc"),
    Lira('\u20A4', "Lira"),
    Mill('\u20A5', "Mill"),
    Naira('\u20A6', "Nigeria Naira"),
    Peseta('\u20A7', "Spain Peseta"),
    RupeeSign('\u20A8', "Rupee Sign"),
    Won('\u20A9', "Korea Won"),
    Sheqel('\u20AA', "Isreal Sheqel"),
    Dong('\u20AB', "Dong"),
    Euro('\u20AC', "Euro Sign"),
    Kip('\u20AD', "Kip Sign"),
    Tugrik('\u20AE', "Tugrik Sign"),
    Drachman('\u20AF', "Greece Drachman"),
    Penny('\u20B0', "German Penny"),
    Peso('\u20B1', "Peso"),
    Guarani('\u20B2', "GUARANI"),
    Austral('\u20B3', "Austral"),
    Hryvnia('\u20B4', "Hryvnia"),
    Cedi('\u20B5', "Cdei"),
    LivreTournois('\u20B6', "Livre Tournois"),
    Spesmilo('\u20B7', "SPESMILO"),
    IndianRupee('\u20B9', "Indian Rupee"),
    TurkishLira('\u20BA', "Turkish Lira"),
    NordicMark('\u20BB', "Nordic Mark Sign"),
    Manat('\u20BC', "Manat Sign"),
    Ruble('\u20BD', "Russia Ruble Sign"),
    Lari('\u20BE', "Lari Sign"),
    Bitcoin('\u20BF', "Bitcoin"),
    ;


    Currency(char unicodeSymbol, String name) {
        this.unicodeSymbol = unicodeSymbol;
        this.unicodeFriendlyName = name;
        this.unicodeValue = "\\u" + Integer.toHexString(unicodeSymbol | 0x10000).substring(1);
    }


    private char unicodeSymbol;
    private String unicodeFriendlyName, unicodeValue;


    public String getUnicodeValue() {
        return this.unicodeValue;
    }

    public char getUnicodeSymbol() {
        return this.unicodeSymbol;
    }


    public String getUnicodeFriendlyName() {
        return this.unicodeFriendlyName;
    }
}