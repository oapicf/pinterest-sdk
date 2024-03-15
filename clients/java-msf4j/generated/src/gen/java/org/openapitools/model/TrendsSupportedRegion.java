package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets TrendsSupportedRegion
 */
public enum TrendsSupportedRegion {
  
  US("US"),
  
  CA("CA"),
  
  DE("DE"),
  
  FR("FR"),
  
  ES("ES"),
  
  IT("IT"),
  
  DE_AT_CH("DE+AT+CH"),
  
  GB_IE("GB+IE"),
  
  IT_ES_PT_GR_MT("IT+ES+PT+GR+MT"),
  
  PL_RO_HU_SK_CZ("PL+RO+HU+SK+CZ"),
  
  SE_DK_FI_NO("SE+DK+FI+NO"),
  
  NL_BE_LU("NL+BE+LU"),
  
  AR("AR"),
  
  BR("BR"),
  
  CO("CO"),
  
  MX("MX"),
  
  MX_AR_CO_CL("MX+AR+CO+CL"),
  
  AU_NZ("AU+NZ");

  private String value;

  TrendsSupportedRegion(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TrendsSupportedRegion fromValue(String text) {
    for (TrendsSupportedRegion b : TrendsSupportedRegion.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

