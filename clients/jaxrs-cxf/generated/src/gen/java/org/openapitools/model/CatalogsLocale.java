package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets CatalogsLocale
 */
public enum CatalogsLocale {
  
  AF_ZA("af-ZA"),
  
  AR_SA("ar-SA"),
  
  BG_BG("bg-BG"),
  
  BN_IN("bn-IN"),
  
  CS_CZ("cs-CZ"),
  
  DA_DK("da-DK"),
  
  DE("de"),
  
  EL_GR("el-GR"),
  
  EN_AU("en-AU"),
  
  EN_CA("en-CA"),
  
  EN_GB("en-GB"),
  
  EN_IN("en-IN"),
  
  EN_US("en-US"),
  
  ES_419("es-419"),
  
  ES_AR("es-AR"),
  
  ES_ES("es-ES"),
  
  ES_MX("es-MX"),
  
  FI_FI("fi-FI"),
  
  FR("fr"),
  
  FR_CA("fr-CA"),
  
  HE_IL("he-IL"),
  
  HI_IN("hi-IN"),
  
  HR_HR("hr-HR"),
  
  HU_HU("hu-HU"),
  
  ID_ID("id-ID"),
  
  IT("it"),
  
  JA("ja"),
  
  KO_KR("ko-KR"),
  
  MS_MY("ms-MY"),
  
  NB_NO("nb-NO"),
  
  NL("nl"),
  
  PL_PL("pl-PL"),
  
  PT_BR("pt-BR"),
  
  PT_PT("pt-PT"),
  
  RO_RO("ro-RO"),
  
  RU_RU("ru-RU"),
  
  SK_SK("sk-SK"),
  
  SV_SE("sv-SE"),
  
  TE_IN("te-IN"),
  
  TH_TH("th-TH"),
  
  TL_PH("tl-PH"),
  
  TR("tr"),
  
  UK_UA("uk-UA"),
  
  VI_VN("vi-VN"),
  
  ZH_CN("zh-CN"),
  
  ZH_TW("zh-TW");

  private String value;

  CatalogsLocale(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CatalogsLocale fromValue(String value) {
    for (CatalogsLocale b : CatalogsLocale.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

