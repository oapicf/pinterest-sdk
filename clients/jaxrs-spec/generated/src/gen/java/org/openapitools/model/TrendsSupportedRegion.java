package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TrendsSupportedRegion fromString(String s) {
      for (TrendsSupportedRegion b : TrendsSupportedRegion.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TrendsSupportedRegion fromValue(String value) {
    for (TrendsSupportedRegion b : TrendsSupportedRegion.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


