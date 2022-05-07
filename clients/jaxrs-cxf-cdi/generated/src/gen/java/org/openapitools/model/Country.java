package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Country ID from ISO 3166-1 alpha-2.
 **/

public enum Country {

    AD(String.valueOf("AD")), AE(String.valueOf("AE")), AF(String.valueOf("AF")), AG(String.valueOf("AG")), AI(String.valueOf("AI")), AL(String.valueOf("AL")), AM(String.valueOf("AM")), AO(String.valueOf("AO")), AQ(String.valueOf("AQ")), AR(String.valueOf("AR")), AS(String.valueOf("AS")), AT(String.valueOf("AT")), AU(String.valueOf("AU")), AW(String.valueOf("AW")), AX(String.valueOf("AX")), AZ(String.valueOf("AZ")), BA(String.valueOf("BA")), BB(String.valueOf("BB")), BD(String.valueOf("BD")), BE(String.valueOf("BE")), BF(String.valueOf("BF")), BG(String.valueOf("BG")), BH(String.valueOf("BH")), BI(String.valueOf("BI")), BJ(String.valueOf("BJ")), BL(String.valueOf("BL")), BM(String.valueOf("BM")), BN(String.valueOf("BN")), BO(String.valueOf("BO")), BQ(String.valueOf("BQ")), BR(String.valueOf("BR")), BS(String.valueOf("BS")), BT(String.valueOf("BT")), BV(String.valueOf("BV")), BW(String.valueOf("BW")), BY(String.valueOf("BY")), BZ(String.valueOf("BZ")), CA(String.valueOf("CA")), CC(String.valueOf("CC")), CD(String.valueOf("CD")), CF(String.valueOf("CF")), CG(String.valueOf("CG")), CH(String.valueOf("CH")), CI(String.valueOf("CI")), CK(String.valueOf("CK")), CL(String.valueOf("CL")), CM(String.valueOf("CM")), CO(String.valueOf("CO")), CR(String.valueOf("CR")), CU(String.valueOf("CU")), CV(String.valueOf("CV")), CW(String.valueOf("CW")), CX(String.valueOf("CX")), CY(String.valueOf("CY")), CZ(String.valueOf("CZ")), DE(String.valueOf("DE")), DJ(String.valueOf("DJ")), DK(String.valueOf("DK")), DM(String.valueOf("DM")), DO(String.valueOf("DO")), DZ(String.valueOf("DZ")), EC(String.valueOf("EC")), EE(String.valueOf("EE")), EG(String.valueOf("EG")), EH(String.valueOf("EH")), ER(String.valueOf("ER")), ES(String.valueOf("ES")), ET(String.valueOf("ET")), FI(String.valueOf("FI")), FJ(String.valueOf("FJ")), FK(String.valueOf("FK")), FM(String.valueOf("FM")), FO(String.valueOf("FO")), FR(String.valueOf("FR")), GA(String.valueOf("GA")), GB(String.valueOf("GB")), GD(String.valueOf("GD")), GE(String.valueOf("GE")), GF(String.valueOf("GF")), GG(String.valueOf("GG")), GH(String.valueOf("GH")), GI(String.valueOf("GI")), GL(String.valueOf("GL")), GM(String.valueOf("GM")), GN(String.valueOf("GN")), GP(String.valueOf("GP")), GQ(String.valueOf("GQ")), GR(String.valueOf("GR")), GS(String.valueOf("GS")), GT(String.valueOf("GT")), GU(String.valueOf("GU")), GW(String.valueOf("GW")), GY(String.valueOf("GY")), HK(String.valueOf("HK")), HM(String.valueOf("HM")), HN(String.valueOf("HN")), HR(String.valueOf("HR")), HT(String.valueOf("HT")), HU(String.valueOf("HU")), ID(String.valueOf("ID")), IE(String.valueOf("IE")), IL(String.valueOf("IL")), IM(String.valueOf("IM")), IN(String.valueOf("IN")), IO(String.valueOf("IO")), IQ(String.valueOf("IQ")), IR(String.valueOf("IR")), IS(String.valueOf("IS")), IT(String.valueOf("IT")), JE(String.valueOf("JE")), JM(String.valueOf("JM")), JO(String.valueOf("JO")), JP(String.valueOf("JP")), KE(String.valueOf("KE")), KG(String.valueOf("KG")), KH(String.valueOf("KH")), KI(String.valueOf("KI")), KM(String.valueOf("KM")), KN(String.valueOf("KN")), KR(String.valueOf("KR")), KW(String.valueOf("KW")), KY(String.valueOf("KY")), KZ(String.valueOf("KZ")), LA(String.valueOf("LA")), LB(String.valueOf("LB")), LC(String.valueOf("LC")), LI(String.valueOf("LI")), LK(String.valueOf("LK")), LR(String.valueOf("LR")), LS(String.valueOf("LS")), LT(String.valueOf("LT")), LU(String.valueOf("LU")), LV(String.valueOf("LV")), LY(String.valueOf("LY")), MA(String.valueOf("MA")), MC(String.valueOf("MC")), MD(String.valueOf("MD")), ME(String.valueOf("ME")), MF(String.valueOf("MF")), MG(String.valueOf("MG")), MH(String.valueOf("MH")), MK(String.valueOf("MK")), ML(String.valueOf("ML")), MM(String.valueOf("MM")), MN(String.valueOf("MN")), MO(String.valueOf("MO")), MP(String.valueOf("MP")), MQ(String.valueOf("MQ")), MR(String.valueOf("MR")), MS(String.valueOf("MS")), MT(String.valueOf("MT")), MU(String.valueOf("MU")), MV(String.valueOf("MV")), MW(String.valueOf("MW")), MX(String.valueOf("MX")), MY(String.valueOf("MY")), MZ(String.valueOf("MZ")), NA(String.valueOf("NA")), NC(String.valueOf("NC")), NE(String.valueOf("NE")), NF(String.valueOf("NF")), NG(String.valueOf("NG")), NI(String.valueOf("NI")), NL(String.valueOf("NL")), NO(String.valueOf("NO")), NP(String.valueOf("NP")), NR(String.valueOf("NR")), NU(String.valueOf("NU")), NZ(String.valueOf("NZ")), OM(String.valueOf("OM")), PA(String.valueOf("PA")), PE(String.valueOf("PE")), PF(String.valueOf("PF")), PG(String.valueOf("PG")), PH(String.valueOf("PH")), PK(String.valueOf("PK")), PL(String.valueOf("PL")), PM(String.valueOf("PM")), PN(String.valueOf("PN")), PR(String.valueOf("PR")), PS(String.valueOf("PS")), PT(String.valueOf("PT")), PW(String.valueOf("PW")), PY(String.valueOf("PY")), QA(String.valueOf("QA")), RE(String.valueOf("RE")), RO(String.valueOf("RO")), RS(String.valueOf("RS")), RU(String.valueOf("RU")), RW(String.valueOf("RW")), SA(String.valueOf("SA")), SB(String.valueOf("SB")), SC(String.valueOf("SC")), SD(String.valueOf("SD")), SE(String.valueOf("SE")), SG(String.valueOf("SG")), SH(String.valueOf("SH")), SI(String.valueOf("SI")), SJ(String.valueOf("SJ")), SK(String.valueOf("SK")), SL(String.valueOf("SL")), SM(String.valueOf("SM")), SN(String.valueOf("SN")), SO(String.valueOf("SO")), SR(String.valueOf("SR")), SS(String.valueOf("SS")), ST(String.valueOf("ST")), SV(String.valueOf("SV")), SX(String.valueOf("SX")), SY(String.valueOf("SY")), SZ(String.valueOf("SZ")), TC(String.valueOf("TC")), TD(String.valueOf("TD")), TF(String.valueOf("TF")), TG(String.valueOf("TG")), TH(String.valueOf("TH")), TJ(String.valueOf("TJ")), TK(String.valueOf("TK")), TL(String.valueOf("TL")), TM(String.valueOf("TM")), TN(String.valueOf("TN")), TO(String.valueOf("TO")), TR(String.valueOf("TR")), TT(String.valueOf("TT")), TV(String.valueOf("TV")), TW(String.valueOf("TW")), TZ(String.valueOf("TZ")), UA(String.valueOf("UA")), UG(String.valueOf("UG")), UM(String.valueOf("UM")), US(String.valueOf("US")), UY(String.valueOf("UY")), UZ(String.valueOf("UZ")), VA(String.valueOf("VA")), VC(String.valueOf("VC")), VE(String.valueOf("VE")), VG(String.valueOf("VG")), VI(String.valueOf("VI")), VN(String.valueOf("VN")), VU(String.valueOf("VU")), WF(String.valueOf("WF")), WS(String.valueOf("WS")), YE(String.valueOf("YE")), YT(String.valueOf("YT")), ZA(String.valueOf("ZA")), ZM(String.valueOf("ZM")), ZW(String.valueOf("ZW"));


    private String value;

    Country(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static Country fromValue(String value) {
        for (Country b : Country.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



