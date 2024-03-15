package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CatalogsLocale {

    @JsonProperty("af-ZA") AF_ZA(String.valueOf("af-ZA")), @JsonProperty("ar-SA") AR_SA(String.valueOf("ar-SA")), @JsonProperty("bg-BG") BG_BG(String.valueOf("bg-BG")), @JsonProperty("bn-IN") BN_IN(String.valueOf("bn-IN")), @JsonProperty("cs-CZ") CS_CZ(String.valueOf("cs-CZ")), @JsonProperty("da-DK") DA_DK(String.valueOf("da-DK")), @JsonProperty("de") DE(String.valueOf("de")), @JsonProperty("el-GR") EL_GR(String.valueOf("el-GR")), @JsonProperty("en-AU") EN_AU(String.valueOf("en-AU")), @JsonProperty("en-CA") EN_CA(String.valueOf("en-CA")), @JsonProperty("en-GB") EN_GB(String.valueOf("en-GB")), @JsonProperty("en-IN") EN_IN(String.valueOf("en-IN")), @JsonProperty("en-US") EN_US(String.valueOf("en-US")), @JsonProperty("es-419") ES_419(String.valueOf("es-419")), @JsonProperty("es-AR") ES_AR(String.valueOf("es-AR")), @JsonProperty("es-ES") ES_ES(String.valueOf("es-ES")), @JsonProperty("es-MX") ES_MX(String.valueOf("es-MX")), @JsonProperty("fi-FI") FI_FI(String.valueOf("fi-FI")), @JsonProperty("fr") FR(String.valueOf("fr")), @JsonProperty("fr-CA") FR_CA(String.valueOf("fr-CA")), @JsonProperty("he-IL") HE_IL(String.valueOf("he-IL")), @JsonProperty("hi-IN") HI_IN(String.valueOf("hi-IN")), @JsonProperty("hr-HR") HR_HR(String.valueOf("hr-HR")), @JsonProperty("hu-HU") HU_HU(String.valueOf("hu-HU")), @JsonProperty("id-ID") ID_ID(String.valueOf("id-ID")), @JsonProperty("it") IT(String.valueOf("it")), @JsonProperty("ja") JA(String.valueOf("ja")), @JsonProperty("ko-KR") KO_KR(String.valueOf("ko-KR")), @JsonProperty("ms-MY") MS_MY(String.valueOf("ms-MY")), @JsonProperty("nb-NO") NB_NO(String.valueOf("nb-NO")), @JsonProperty("nl") NL(String.valueOf("nl")), @JsonProperty("pl-PL") PL_PL(String.valueOf("pl-PL")), @JsonProperty("pt-BR") PT_BR(String.valueOf("pt-BR")), @JsonProperty("pt-PT") PT_PT(String.valueOf("pt-PT")), @JsonProperty("ro-RO") RO_RO(String.valueOf("ro-RO")), @JsonProperty("ru-RU") RU_RU(String.valueOf("ru-RU")), @JsonProperty("sk-SK") SK_SK(String.valueOf("sk-SK")), @JsonProperty("sv-SE") SV_SE(String.valueOf("sv-SE")), @JsonProperty("te-IN") TE_IN(String.valueOf("te-IN")), @JsonProperty("th-TH") TH_TH(String.valueOf("th-TH")), @JsonProperty("tl-PH") TL_PH(String.valueOf("tl-PH")), @JsonProperty("tr") TR(String.valueOf("tr")), @JsonProperty("uk-UA") UK_UA(String.valueOf("uk-UA")), @JsonProperty("vi-VN") VI_VN(String.valueOf("vi-VN")), @JsonProperty("zh-CN") ZH_CN(String.valueOf("zh-CN")), @JsonProperty("zh-TW") ZH_TW(String.valueOf("zh-TW"));


    private String value;

    CatalogsLocale(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogsLocale fromValue(String value) {
        for (CatalogsLocale b : CatalogsLocale.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



