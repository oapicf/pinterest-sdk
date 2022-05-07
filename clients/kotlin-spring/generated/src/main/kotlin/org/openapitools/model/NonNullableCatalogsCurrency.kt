package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
* Currency Codes from ISO 4217.
* Values: aED,aFN,aLL,aMD,aNG,aOA,aRS,aUD,aWG,aZN,bAM,bBD,bDT,bGN,bHD,bIF,bMD,bND,bOB,bRL,bSD,bTN,bWP,bYN,bYR,bZD,cAD,cDF,cHF,cLP,cNY,cOP,cRC,cUC,cUP,cVE,cZK,dJF,dKK,dOP,dZD,eGP,eRN,eTB,eUR,fJD,fKP,gBP,gEL,gGP,gHS,gIP,gMD,gNF,gTQ,gYD,hKD,hNL,hRK,hTG,hUF,iDR,iLS,iMP,iNR,iQD,iRR,iSK,jEP,jMD,jOD,jPY,kES,kGS,kHR,kMF,kPW,kRW,kWD,kYD,kZT,lAK,lBP,lKR,lRD,lSL,lYD,mAD,mDL,mGA,mKD,mMK,mNT,mOP,mRO,mUR,mVR,mWK,mXN,mYR,mZN,nAD,nGN,nIO,nOK,nPR,nZD,oMR,pAB,pEN,pGK,pHP,pKR,pLN,pYG,qAR,rON,rSD,rUB,rWF,sAR,sBD,sCR,sDG,sEK,sGD,sHP,sLL,sOS,sPL,sRD,sTD,sVC,sYP,sZL,tHB,tJS,tMT,tND,tOP,tRY,tTD,tVD,tWD,tZS,uAH,uGX,uSD,uYU,uZS,vEF,vND,vUV,wST,xAF,xCD,xDR,xOF,xPF,yER,zAR,zMW,zWD
*/
enum class NonNullableCatalogsCurrency(val value: kotlin.String) {

    @JsonProperty("AED") aED("AED"),

    @JsonProperty("AFN") aFN("AFN"),

    @JsonProperty("ALL") aLL("ALL"),

    @JsonProperty("AMD") aMD("AMD"),

    @JsonProperty("ANG") aNG("ANG"),

    @JsonProperty("AOA") aOA("AOA"),

    @JsonProperty("ARS") aRS("ARS"),

    @JsonProperty("AUD") aUD("AUD"),

    @JsonProperty("AWG") aWG("AWG"),

    @JsonProperty("AZN") aZN("AZN"),

    @JsonProperty("BAM") bAM("BAM"),

    @JsonProperty("BBD") bBD("BBD"),

    @JsonProperty("BDT") bDT("BDT"),

    @JsonProperty("BGN") bGN("BGN"),

    @JsonProperty("BHD") bHD("BHD"),

    @JsonProperty("BIF") bIF("BIF"),

    @JsonProperty("BMD") bMD("BMD"),

    @JsonProperty("BND") bND("BND"),

    @JsonProperty("BOB") bOB("BOB"),

    @JsonProperty("BRL") bRL("BRL"),

    @JsonProperty("BSD") bSD("BSD"),

    @JsonProperty("BTN") bTN("BTN"),

    @JsonProperty("BWP") bWP("BWP"),

    @JsonProperty("BYN") bYN("BYN"),

    @JsonProperty("BYR") bYR("BYR"),

    @JsonProperty("BZD") bZD("BZD"),

    @JsonProperty("CAD") cAD("CAD"),

    @JsonProperty("CDF") cDF("CDF"),

    @JsonProperty("CHF") cHF("CHF"),

    @JsonProperty("CLP") cLP("CLP"),

    @JsonProperty("CNY") cNY("CNY"),

    @JsonProperty("COP") cOP("COP"),

    @JsonProperty("CRC") cRC("CRC"),

    @JsonProperty("CUC") cUC("CUC"),

    @JsonProperty("CUP") cUP("CUP"),

    @JsonProperty("CVE") cVE("CVE"),

    @JsonProperty("CZK") cZK("CZK"),

    @JsonProperty("DJF") dJF("DJF"),

    @JsonProperty("DKK") dKK("DKK"),

    @JsonProperty("DOP") dOP("DOP"),

    @JsonProperty("DZD") dZD("DZD"),

    @JsonProperty("EGP") eGP("EGP"),

    @JsonProperty("ERN") eRN("ERN"),

    @JsonProperty("ETB") eTB("ETB"),

    @JsonProperty("EUR") eUR("EUR"),

    @JsonProperty("FJD") fJD("FJD"),

    @JsonProperty("FKP") fKP("FKP"),

    @JsonProperty("GBP") gBP("GBP"),

    @JsonProperty("GEL") gEL("GEL"),

    @JsonProperty("GGP") gGP("GGP"),

    @JsonProperty("GHS") gHS("GHS"),

    @JsonProperty("GIP") gIP("GIP"),

    @JsonProperty("GMD") gMD("GMD"),

    @JsonProperty("GNF") gNF("GNF"),

    @JsonProperty("GTQ") gTQ("GTQ"),

    @JsonProperty("GYD") gYD("GYD"),

    @JsonProperty("HKD") hKD("HKD"),

    @JsonProperty("HNL") hNL("HNL"),

    @JsonProperty("HRK") hRK("HRK"),

    @JsonProperty("HTG") hTG("HTG"),

    @JsonProperty("HUF") hUF("HUF"),

    @JsonProperty("IDR") iDR("IDR"),

    @JsonProperty("ILS") iLS("ILS"),

    @JsonProperty("IMP") iMP("IMP"),

    @JsonProperty("INR") iNR("INR"),

    @JsonProperty("IQD") iQD("IQD"),

    @JsonProperty("IRR") iRR("IRR"),

    @JsonProperty("ISK") iSK("ISK"),

    @JsonProperty("JEP") jEP("JEP"),

    @JsonProperty("JMD") jMD("JMD"),

    @JsonProperty("JOD") jOD("JOD"),

    @JsonProperty("JPY") jPY("JPY"),

    @JsonProperty("KES") kES("KES"),

    @JsonProperty("KGS") kGS("KGS"),

    @JsonProperty("KHR") kHR("KHR"),

    @JsonProperty("KMF") kMF("KMF"),

    @JsonProperty("KPW") kPW("KPW"),

    @JsonProperty("KRW") kRW("KRW"),

    @JsonProperty("KWD") kWD("KWD"),

    @JsonProperty("KYD") kYD("KYD"),

    @JsonProperty("KZT") kZT("KZT"),

    @JsonProperty("LAK") lAK("LAK"),

    @JsonProperty("LBP") lBP("LBP"),

    @JsonProperty("LKR") lKR("LKR"),

    @JsonProperty("LRD") lRD("LRD"),

    @JsonProperty("LSL") lSL("LSL"),

    @JsonProperty("LYD") lYD("LYD"),

    @JsonProperty("MAD") mAD("MAD"),

    @JsonProperty("MDL") mDL("MDL"),

    @JsonProperty("MGA") mGA("MGA"),

    @JsonProperty("MKD") mKD("MKD"),

    @JsonProperty("MMK") mMK("MMK"),

    @JsonProperty("MNT") mNT("MNT"),

    @JsonProperty("MOP") mOP("MOP"),

    @JsonProperty("MRO") mRO("MRO"),

    @JsonProperty("MUR") mUR("MUR"),

    @JsonProperty("MVR") mVR("MVR"),

    @JsonProperty("MWK") mWK("MWK"),

    @JsonProperty("MXN") mXN("MXN"),

    @JsonProperty("MYR") mYR("MYR"),

    @JsonProperty("MZN") mZN("MZN"),

    @JsonProperty("NAD") nAD("NAD"),

    @JsonProperty("NGN") nGN("NGN"),

    @JsonProperty("NIO") nIO("NIO"),

    @JsonProperty("NOK") nOK("NOK"),

    @JsonProperty("NPR") nPR("NPR"),

    @JsonProperty("NZD") nZD("NZD"),

    @JsonProperty("OMR") oMR("OMR"),

    @JsonProperty("PAB") pAB("PAB"),

    @JsonProperty("PEN") pEN("PEN"),

    @JsonProperty("PGK") pGK("PGK"),

    @JsonProperty("PHP") pHP("PHP"),

    @JsonProperty("PKR") pKR("PKR"),

    @JsonProperty("PLN") pLN("PLN"),

    @JsonProperty("PYG") pYG("PYG"),

    @JsonProperty("QAR") qAR("QAR"),

    @JsonProperty("RON") rON("RON"),

    @JsonProperty("RSD") rSD("RSD"),

    @JsonProperty("RUB") rUB("RUB"),

    @JsonProperty("RWF") rWF("RWF"),

    @JsonProperty("SAR") sAR("SAR"),

    @JsonProperty("SBD") sBD("SBD"),

    @JsonProperty("SCR") sCR("SCR"),

    @JsonProperty("SDG") sDG("SDG"),

    @JsonProperty("SEK") sEK("SEK"),

    @JsonProperty("SGD") sGD("SGD"),

    @JsonProperty("SHP") sHP("SHP"),

    @JsonProperty("SLL") sLL("SLL"),

    @JsonProperty("SOS") sOS("SOS"),

    @JsonProperty("SPL") sPL("SPL"),

    @JsonProperty("SRD") sRD("SRD"),

    @JsonProperty("STD") sTD("STD"),

    @JsonProperty("SVC") sVC("SVC"),

    @JsonProperty("SYP") sYP("SYP"),

    @JsonProperty("SZL") sZL("SZL"),

    @JsonProperty("THB") tHB("THB"),

    @JsonProperty("TJS") tJS("TJS"),

    @JsonProperty("TMT") tMT("TMT"),

    @JsonProperty("TND") tND("TND"),

    @JsonProperty("TOP") tOP("TOP"),

    @JsonProperty("TRY") tRY("TRY"),

    @JsonProperty("TTD") tTD("TTD"),

    @JsonProperty("TVD") tVD("TVD"),

    @JsonProperty("TWD") tWD("TWD"),

    @JsonProperty("TZS") tZS("TZS"),

    @JsonProperty("UAH") uAH("UAH"),

    @JsonProperty("UGX") uGX("UGX"),

    @JsonProperty("USD") uSD("USD"),

    @JsonProperty("UYU") uYU("UYU"),

    @JsonProperty("UZS") uZS("UZS"),

    @JsonProperty("VEF") vEF("VEF"),

    @JsonProperty("VND") vND("VND"),

    @JsonProperty("VUV") vUV("VUV"),

    @JsonProperty("WST") wST("WST"),

    @JsonProperty("XAF") xAF("XAF"),

    @JsonProperty("XCD") xCD("XCD"),

    @JsonProperty("XDR") xDR("XDR"),

    @JsonProperty("XOF") xOF("XOF"),

    @JsonProperty("XPF") xPF("XPF"),

    @JsonProperty("YER") yER("YER"),

    @JsonProperty("ZAR") zAR("ZAR"),

    @JsonProperty("ZMW") zMW("ZMW"),

    @JsonProperty("ZWD") zWD("ZWD");

}

