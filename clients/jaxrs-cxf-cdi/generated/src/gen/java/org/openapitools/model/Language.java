package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Language code, which is among the offical ISO 639-1 language list.
 **/

public enum Language {

    AM(String.valueOf("AM")), AR(String.valueOf("AR")), AZ(String.valueOf("AZ")), BG(String.valueOf("BG")), BN(String.valueOf("BN")), BS(String.valueOf("BS")), CA(String.valueOf("CA")), CS(String.valueOf("CS")), DA(String.valueOf("DA")), DV(String.valueOf("DV")), DZ(String.valueOf("DZ")), DE(String.valueOf("DE")), EL(String.valueOf("EL")), EN(String.valueOf("EN")), ES(String.valueOf("ES")), ET(String.valueOf("ET")), FA(String.valueOf("FA")), FI(String.valueOf("FI")), FR(String.valueOf("FR")), HE(String.valueOf("HE")), HI(String.valueOf("HI")), HR(String.valueOf("HR")), HU(String.valueOf("HU")), HY(String.valueOf("HY")), ID(String.valueOf("ID")), IN(String.valueOf("IN")), IS(String.valueOf("IS")), IT(String.valueOf("IT")), IW(String.valueOf("IW")), JA(String.valueOf("JA")), KA(String.valueOf("KA")), KM(String.valueOf("KM")), KO(String.valueOf("KO")), LO(String.valueOf("LO")), LT(String.valueOf("LT")), LV(String.valueOf("LV")), MK(String.valueOf("MK")), MN(String.valueOf("MN")), MS(String.valueOf("MS")), MY(String.valueOf("MY")), NB(String.valueOf("NB")), NE(String.valueOf("NE")), NL(String.valueOf("NL")), NO(String.valueOf("NO")), PL(String.valueOf("PL")), PT(String.valueOf("PT")), RO(String.valueOf("RO")), RU(String.valueOf("RU")), SK(String.valueOf("SK")), SL(String.valueOf("SL")), SQ(String.valueOf("SQ")), SR(String.valueOf("SR")), SV(String.valueOf("SV")), TL(String.valueOf("TL")), UK(String.valueOf("UK")), VI(String.valueOf("VI")), TE(String.valueOf("TE")), TH(String.valueOf("TH")), TR(String.valueOf("TR")), XX(String.valueOf("XX")), ZH(String.valueOf("ZH"));


    private String value;

    Language(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static Language fromValue(String value) {
        for (Language b : Language.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



