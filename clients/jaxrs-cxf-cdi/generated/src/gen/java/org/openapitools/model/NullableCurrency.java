package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Currency Codes from ISO 4217.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum NullableCurrency {

    @JsonProperty("AED") AED(String.valueOf("AED")), @JsonProperty("AFN") AFN(String.valueOf("AFN")), @JsonProperty("ALL") ALL(String.valueOf("ALL")), @JsonProperty("AMD") AMD(String.valueOf("AMD")), @JsonProperty("ANG") ANG(String.valueOf("ANG")), @JsonProperty("AOA") AOA(String.valueOf("AOA")), @JsonProperty("ARS") ARS(String.valueOf("ARS")), @JsonProperty("AUD") AUD(String.valueOf("AUD")), @JsonProperty("AWG") AWG(String.valueOf("AWG")), @JsonProperty("AZN") AZN(String.valueOf("AZN")), @JsonProperty("BAM") BAM(String.valueOf("BAM")), @JsonProperty("BBD") BBD(String.valueOf("BBD")), @JsonProperty("BDT") BDT(String.valueOf("BDT")), @JsonProperty("BGN") BGN(String.valueOf("BGN")), @JsonProperty("BHD") BHD(String.valueOf("BHD")), @JsonProperty("BIF") BIF(String.valueOf("BIF")), @JsonProperty("BMD") BMD(String.valueOf("BMD")), @JsonProperty("BND") BND(String.valueOf("BND")), @JsonProperty("BOB") BOB(String.valueOf("BOB")), @JsonProperty("BRL") BRL(String.valueOf("BRL")), @JsonProperty("BSD") BSD(String.valueOf("BSD")), @JsonProperty("BTN") BTN(String.valueOf("BTN")), @JsonProperty("BWP") BWP(String.valueOf("BWP")), @JsonProperty("BYN") BYN(String.valueOf("BYN")), @JsonProperty("BYR") BYR(String.valueOf("BYR")), @JsonProperty("BZD") BZD(String.valueOf("BZD")), @JsonProperty("CAD") CAD(String.valueOf("CAD")), @JsonProperty("CDF") CDF(String.valueOf("CDF")), @JsonProperty("CHF") CHF(String.valueOf("CHF")), @JsonProperty("CLP") CLP(String.valueOf("CLP")), @JsonProperty("CNY") CNY(String.valueOf("CNY")), @JsonProperty("COP") COP(String.valueOf("COP")), @JsonProperty("CRC") CRC(String.valueOf("CRC")), @JsonProperty("CUC") CUC(String.valueOf("CUC")), @JsonProperty("CUP") CUP(String.valueOf("CUP")), @JsonProperty("CVE") CVE(String.valueOf("CVE")), @JsonProperty("CZK") CZK(String.valueOf("CZK")), @JsonProperty("DJF") DJF(String.valueOf("DJF")), @JsonProperty("DKK") DKK(String.valueOf("DKK")), @JsonProperty("DOP") DOP(String.valueOf("DOP")), @JsonProperty("DZD") DZD(String.valueOf("DZD")), @JsonProperty("EGP") EGP(String.valueOf("EGP")), @JsonProperty("ERN") ERN(String.valueOf("ERN")), @JsonProperty("ETB") ETB(String.valueOf("ETB")), @JsonProperty("EUR") EUR(String.valueOf("EUR")), @JsonProperty("FJD") FJD(String.valueOf("FJD")), @JsonProperty("FKP") FKP(String.valueOf("FKP")), @JsonProperty("GBP") GBP(String.valueOf("GBP")), @JsonProperty("GEL") GEL(String.valueOf("GEL")), @JsonProperty("GGP") GGP(String.valueOf("GGP")), @JsonProperty("GHS") GHS(String.valueOf("GHS")), @JsonProperty("GIP") GIP(String.valueOf("GIP")), @JsonProperty("GMD") GMD(String.valueOf("GMD")), @JsonProperty("GNF") GNF(String.valueOf("GNF")), @JsonProperty("GTQ") GTQ(String.valueOf("GTQ")), @JsonProperty("GYD") GYD(String.valueOf("GYD")), @JsonProperty("HKD") HKD(String.valueOf("HKD")), @JsonProperty("HNL") HNL(String.valueOf("HNL")), @JsonProperty("HRK") HRK(String.valueOf("HRK")), @JsonProperty("HTG") HTG(String.valueOf("HTG")), @JsonProperty("HUF") HUF(String.valueOf("HUF")), @JsonProperty("IDR") IDR(String.valueOf("IDR")), @JsonProperty("ILS") ILS(String.valueOf("ILS")), @JsonProperty("IMP") IMP(String.valueOf("IMP")), @JsonProperty("INR") INR(String.valueOf("INR")), @JsonProperty("IQD") IQD(String.valueOf("IQD")), @JsonProperty("IRR") IRR(String.valueOf("IRR")), @JsonProperty("ISK") ISK(String.valueOf("ISK")), @JsonProperty("JEP") JEP(String.valueOf("JEP")), @JsonProperty("JMD") JMD(String.valueOf("JMD")), @JsonProperty("JOD") JOD(String.valueOf("JOD")), @JsonProperty("JPY") JPY(String.valueOf("JPY")), @JsonProperty("KES") KES(String.valueOf("KES")), @JsonProperty("KGS") KGS(String.valueOf("KGS")), @JsonProperty("KHR") KHR(String.valueOf("KHR")), @JsonProperty("KMF") KMF(String.valueOf("KMF")), @JsonProperty("KPW") KPW(String.valueOf("KPW")), @JsonProperty("KRW") KRW(String.valueOf("KRW")), @JsonProperty("KWD") KWD(String.valueOf("KWD")), @JsonProperty("KYD") KYD(String.valueOf("KYD")), @JsonProperty("KZT") KZT(String.valueOf("KZT")), @JsonProperty("LAK") LAK(String.valueOf("LAK")), @JsonProperty("LBP") LBP(String.valueOf("LBP")), @JsonProperty("LKR") LKR(String.valueOf("LKR")), @JsonProperty("LRD") LRD(String.valueOf("LRD")), @JsonProperty("LSL") LSL(String.valueOf("LSL")), @JsonProperty("LYD") LYD(String.valueOf("LYD")), @JsonProperty("MAD") MAD(String.valueOf("MAD")), @JsonProperty("MDL") MDL(String.valueOf("MDL")), @JsonProperty("MGA") MGA(String.valueOf("MGA")), @JsonProperty("MKD") MKD(String.valueOf("MKD")), @JsonProperty("MMK") MMK(String.valueOf("MMK")), @JsonProperty("MNT") MNT(String.valueOf("MNT")), @JsonProperty("MOP") MOP(String.valueOf("MOP")), @JsonProperty("MRO") MRO(String.valueOf("MRO")), @JsonProperty("MUR") MUR(String.valueOf("MUR")), @JsonProperty("MVR") MVR(String.valueOf("MVR")), @JsonProperty("MWK") MWK(String.valueOf("MWK")), @JsonProperty("MXN") MXN(String.valueOf("MXN")), @JsonProperty("MYR") MYR(String.valueOf("MYR")), @JsonProperty("MZN") MZN(String.valueOf("MZN")), @JsonProperty("NAD") NAD(String.valueOf("NAD")), @JsonProperty("NGN") NGN(String.valueOf("NGN")), @JsonProperty("NIO") NIO(String.valueOf("NIO")), @JsonProperty("NOK") NOK(String.valueOf("NOK")), @JsonProperty("NPR") NPR(String.valueOf("NPR")), @JsonProperty("NZD") NZD(String.valueOf("NZD")), @JsonProperty("OMR") OMR(String.valueOf("OMR")), @JsonProperty("PAB") PAB(String.valueOf("PAB")), @JsonProperty("PEN") PEN(String.valueOf("PEN")), @JsonProperty("PGK") PGK(String.valueOf("PGK")), @JsonProperty("PHP") PHP(String.valueOf("PHP")), @JsonProperty("PKR") PKR(String.valueOf("PKR")), @JsonProperty("PLN") PLN(String.valueOf("PLN")), @JsonProperty("PYG") PYG(String.valueOf("PYG")), @JsonProperty("QAR") QAR(String.valueOf("QAR")), @JsonProperty("RON") RON(String.valueOf("RON")), @JsonProperty("RSD") RSD(String.valueOf("RSD")), @JsonProperty("RUB") RUB(String.valueOf("RUB")), @JsonProperty("RWF") RWF(String.valueOf("RWF")), @JsonProperty("SAR") SAR(String.valueOf("SAR")), @JsonProperty("SBD") SBD(String.valueOf("SBD")), @JsonProperty("SCR") SCR(String.valueOf("SCR")), @JsonProperty("SDG") SDG(String.valueOf("SDG")), @JsonProperty("SEK") SEK(String.valueOf("SEK")), @JsonProperty("SGD") SGD(String.valueOf("SGD")), @JsonProperty("SHP") SHP(String.valueOf("SHP")), @JsonProperty("SLL") SLL(String.valueOf("SLL")), @JsonProperty("SOS") SOS(String.valueOf("SOS")), @JsonProperty("SPL") SPL(String.valueOf("SPL")), @JsonProperty("SRD") SRD(String.valueOf("SRD")), @JsonProperty("STD") STD(String.valueOf("STD")), @JsonProperty("SVC") SVC(String.valueOf("SVC")), @JsonProperty("SYP") SYP(String.valueOf("SYP")), @JsonProperty("SZL") SZL(String.valueOf("SZL")), @JsonProperty("THB") THB(String.valueOf("THB")), @JsonProperty("TJS") TJS(String.valueOf("TJS")), @JsonProperty("TMT") TMT(String.valueOf("TMT")), @JsonProperty("TND") TND(String.valueOf("TND")), @JsonProperty("TOP") TOP(String.valueOf("TOP")), @JsonProperty("TRY") TRY(String.valueOf("TRY")), @JsonProperty("TTD") TTD(String.valueOf("TTD")), @JsonProperty("TVD") TVD(String.valueOf("TVD")), @JsonProperty("TWD") TWD(String.valueOf("TWD")), @JsonProperty("TZS") TZS(String.valueOf("TZS")), @JsonProperty("UAH") UAH(String.valueOf("UAH")), @JsonProperty("UGX") UGX(String.valueOf("UGX")), @JsonProperty("USD") USD(String.valueOf("USD")), @JsonProperty("UYU") UYU(String.valueOf("UYU")), @JsonProperty("UZS") UZS(String.valueOf("UZS")), @JsonProperty("VEF") VEF(String.valueOf("VEF")), @JsonProperty("VND") VND(String.valueOf("VND")), @JsonProperty("VUV") VUV(String.valueOf("VUV")), @JsonProperty("WST") WST(String.valueOf("WST")), @JsonProperty("XAF") XAF(String.valueOf("XAF")), @JsonProperty("XCD") XCD(String.valueOf("XCD")), @JsonProperty("XDR") XDR(String.valueOf("XDR")), @JsonProperty("XOF") XOF(String.valueOf("XOF")), @JsonProperty("XPF") XPF(String.valueOf("XPF")), @JsonProperty("YER") YER(String.valueOf("YER")), @JsonProperty("ZAR") ZAR(String.valueOf("ZAR")), @JsonProperty("ZMW") ZMW(String.valueOf("ZMW")), @JsonProperty("ZWD") ZWD(String.valueOf("ZWD")), @JsonProperty("null") NULL(String.valueOf("null"));


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



