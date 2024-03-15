package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Language code, which is among the offical ISO 639-1 language list.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum Language {

    @JsonProperty("AM") AM(String.valueOf("AM")), @JsonProperty("AR") AR(String.valueOf("AR")), @JsonProperty("AZ") AZ(String.valueOf("AZ")), @JsonProperty("BG") BG(String.valueOf("BG")), @JsonProperty("BN") BN(String.valueOf("BN")), @JsonProperty("BS") BS(String.valueOf("BS")), @JsonProperty("CA") CA(String.valueOf("CA")), @JsonProperty("CS") CS(String.valueOf("CS")), @JsonProperty("DA") DA(String.valueOf("DA")), @JsonProperty("DV") DV(String.valueOf("DV")), @JsonProperty("DZ") DZ(String.valueOf("DZ")), @JsonProperty("DE") DE(String.valueOf("DE")), @JsonProperty("EL") EL(String.valueOf("EL")), @JsonProperty("EN") EN(String.valueOf("EN")), @JsonProperty("ES") ES(String.valueOf("ES")), @JsonProperty("ET") ET(String.valueOf("ET")), @JsonProperty("FA") FA(String.valueOf("FA")), @JsonProperty("FI") FI(String.valueOf("FI")), @JsonProperty("FR") FR(String.valueOf("FR")), @JsonProperty("HE") HE(String.valueOf("HE")), @JsonProperty("HI") HI(String.valueOf("HI")), @JsonProperty("HR") HR(String.valueOf("HR")), @JsonProperty("HU") HU(String.valueOf("HU")), @JsonProperty("HY") HY(String.valueOf("HY")), @JsonProperty("ID") ID(String.valueOf("ID")), @JsonProperty("IN") IN(String.valueOf("IN")), @JsonProperty("IS") IS(String.valueOf("IS")), @JsonProperty("IT") IT(String.valueOf("IT")), @JsonProperty("IW") IW(String.valueOf("IW")), @JsonProperty("JA") JA(String.valueOf("JA")), @JsonProperty("KA") KA(String.valueOf("KA")), @JsonProperty("KM") KM(String.valueOf("KM")), @JsonProperty("KO") KO(String.valueOf("KO")), @JsonProperty("LO") LO(String.valueOf("LO")), @JsonProperty("LT") LT(String.valueOf("LT")), @JsonProperty("LV") LV(String.valueOf("LV")), @JsonProperty("MK") MK(String.valueOf("MK")), @JsonProperty("MN") MN(String.valueOf("MN")), @JsonProperty("MS") MS(String.valueOf("MS")), @JsonProperty("MY") MY(String.valueOf("MY")), @JsonProperty("NB") NB(String.valueOf("NB")), @JsonProperty("NE") NE(String.valueOf("NE")), @JsonProperty("NL") NL(String.valueOf("NL")), @JsonProperty("NO") NO(String.valueOf("NO")), @JsonProperty("PL") PL(String.valueOf("PL")), @JsonProperty("PT") PT(String.valueOf("PT")), @JsonProperty("RO") RO(String.valueOf("RO")), @JsonProperty("RU") RU(String.valueOf("RU")), @JsonProperty("SK") SK(String.valueOf("SK")), @JsonProperty("SL") SL(String.valueOf("SL")), @JsonProperty("SQ") SQ(String.valueOf("SQ")), @JsonProperty("SR") SR(String.valueOf("SR")), @JsonProperty("SV") SV(String.valueOf("SV")), @JsonProperty("TL") TL(String.valueOf("TL")), @JsonProperty("UK") UK(String.valueOf("UK")), @JsonProperty("VI") VI(String.valueOf("VI")), @JsonProperty("TE") TE(String.valueOf("TE")), @JsonProperty("TH") TH(String.valueOf("TH")), @JsonProperty("TR") TR(String.valueOf("TR")), @JsonProperty("XX") XX(String.valueOf("XX")), @JsonProperty("ZH") ZH(String.valueOf("ZH"));


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



