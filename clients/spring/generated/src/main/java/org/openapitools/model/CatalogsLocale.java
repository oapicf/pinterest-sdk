package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets CatalogsLocale
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
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

