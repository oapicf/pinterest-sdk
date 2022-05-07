package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Currency Codes from ISO 4217.
 **/

public enum NullableCurrency {

    AED(String.valueOf("AED")), AFN(String.valueOf("AFN")), ALL(String.valueOf("ALL")), AMD(String.valueOf("AMD")), ANG(String.valueOf("ANG")), AOA(String.valueOf("AOA")), ARS(String.valueOf("ARS")), AUD(String.valueOf("AUD")), AWG(String.valueOf("AWG")), AZN(String.valueOf("AZN")), BAM(String.valueOf("BAM")), BBD(String.valueOf("BBD")), BDT(String.valueOf("BDT")), BGN(String.valueOf("BGN")), BHD(String.valueOf("BHD")), BIF(String.valueOf("BIF")), BMD(String.valueOf("BMD")), BND(String.valueOf("BND")), BOB(String.valueOf("BOB")), BRL(String.valueOf("BRL")), BSD(String.valueOf("BSD")), BTN(String.valueOf("BTN")), BWP(String.valueOf("BWP")), BYN(String.valueOf("BYN")), BYR(String.valueOf("BYR")), BZD(String.valueOf("BZD")), CAD(String.valueOf("CAD")), CDF(String.valueOf("CDF")), CHF(String.valueOf("CHF")), CLP(String.valueOf("CLP")), CNY(String.valueOf("CNY")), COP(String.valueOf("COP")), CRC(String.valueOf("CRC")), CUC(String.valueOf("CUC")), CUP(String.valueOf("CUP")), CVE(String.valueOf("CVE")), CZK(String.valueOf("CZK")), DJF(String.valueOf("DJF")), DKK(String.valueOf("DKK")), DOP(String.valueOf("DOP")), DZD(String.valueOf("DZD")), EGP(String.valueOf("EGP")), ERN(String.valueOf("ERN")), ETB(String.valueOf("ETB")), EUR(String.valueOf("EUR")), FJD(String.valueOf("FJD")), FKP(String.valueOf("FKP")), GBP(String.valueOf("GBP")), GEL(String.valueOf("GEL")), GGP(String.valueOf("GGP")), GHS(String.valueOf("GHS")), GIP(String.valueOf("GIP")), GMD(String.valueOf("GMD")), GNF(String.valueOf("GNF")), GTQ(String.valueOf("GTQ")), GYD(String.valueOf("GYD")), HKD(String.valueOf("HKD")), HNL(String.valueOf("HNL")), HRK(String.valueOf("HRK")), HTG(String.valueOf("HTG")), HUF(String.valueOf("HUF")), IDR(String.valueOf("IDR")), ILS(String.valueOf("ILS")), IMP(String.valueOf("IMP")), INR(String.valueOf("INR")), IQD(String.valueOf("IQD")), IRR(String.valueOf("IRR")), ISK(String.valueOf("ISK")), JEP(String.valueOf("JEP")), JMD(String.valueOf("JMD")), JOD(String.valueOf("JOD")), JPY(String.valueOf("JPY")), KES(String.valueOf("KES")), KGS(String.valueOf("KGS")), KHR(String.valueOf("KHR")), KMF(String.valueOf("KMF")), KPW(String.valueOf("KPW")), KRW(String.valueOf("KRW")), KWD(String.valueOf("KWD")), KYD(String.valueOf("KYD")), KZT(String.valueOf("KZT")), LAK(String.valueOf("LAK")), LBP(String.valueOf("LBP")), LKR(String.valueOf("LKR")), LRD(String.valueOf("LRD")), LSL(String.valueOf("LSL")), LYD(String.valueOf("LYD")), MAD(String.valueOf("MAD")), MDL(String.valueOf("MDL")), MGA(String.valueOf("MGA")), MKD(String.valueOf("MKD")), MMK(String.valueOf("MMK")), MNT(String.valueOf("MNT")), MOP(String.valueOf("MOP")), MRO(String.valueOf("MRO")), MUR(String.valueOf("MUR")), MVR(String.valueOf("MVR")), MWK(String.valueOf("MWK")), MXN(String.valueOf("MXN")), MYR(String.valueOf("MYR")), MZN(String.valueOf("MZN")), NAD(String.valueOf("NAD")), NGN(String.valueOf("NGN")), NIO(String.valueOf("NIO")), NOK(String.valueOf("NOK")), NPR(String.valueOf("NPR")), NZD(String.valueOf("NZD")), OMR(String.valueOf("OMR")), PAB(String.valueOf("PAB")), PEN(String.valueOf("PEN")), PGK(String.valueOf("PGK")), PHP(String.valueOf("PHP")), PKR(String.valueOf("PKR")), PLN(String.valueOf("PLN")), PYG(String.valueOf("PYG")), QAR(String.valueOf("QAR")), RON(String.valueOf("RON")), RSD(String.valueOf("RSD")), RUB(String.valueOf("RUB")), RWF(String.valueOf("RWF")), SAR(String.valueOf("SAR")), SBD(String.valueOf("SBD")), SCR(String.valueOf("SCR")), SDG(String.valueOf("SDG")), SEK(String.valueOf("SEK")), SGD(String.valueOf("SGD")), SHP(String.valueOf("SHP")), SLL(String.valueOf("SLL")), SOS(String.valueOf("SOS")), SPL(String.valueOf("SPL")), SRD(String.valueOf("SRD")), STD(String.valueOf("STD")), SVC(String.valueOf("SVC")), SYP(String.valueOf("SYP")), SZL(String.valueOf("SZL")), THB(String.valueOf("THB")), TJS(String.valueOf("TJS")), TMT(String.valueOf("TMT")), TND(String.valueOf("TND")), TOP(String.valueOf("TOP")), TRY(String.valueOf("TRY")), TTD(String.valueOf("TTD")), TVD(String.valueOf("TVD")), TWD(String.valueOf("TWD")), TZS(String.valueOf("TZS")), UAH(String.valueOf("UAH")), UGX(String.valueOf("UGX")), USD(String.valueOf("USD")), UYU(String.valueOf("UYU")), UZS(String.valueOf("UZS")), VEF(String.valueOf("VEF")), VND(String.valueOf("VND")), VUV(String.valueOf("VUV")), WST(String.valueOf("WST")), XAF(String.valueOf("XAF")), XCD(String.valueOf("XCD")), XDR(String.valueOf("XDR")), XOF(String.valueOf("XOF")), XPF(String.valueOf("XPF")), YER(String.valueOf("YER")), ZAR(String.valueOf("ZAR")), ZMW(String.valueOf("ZMW")), ZWD(String.valueOf("ZWD")), NULL(String.valueOf("null"));


    private String value;

    NullableCurrency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NullableCurrency fromValue(String value) {
        for (NullableCurrency b : NullableCurrency.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



