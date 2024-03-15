package org.openapitools.server.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TrendsSupportedRegion fromValue(String value) {
    for (TrendsSupportedRegion b : TrendsSupportedRegion.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}