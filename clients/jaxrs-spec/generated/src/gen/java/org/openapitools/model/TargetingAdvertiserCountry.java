package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Advertiser&#39;s ISO two character country code.
 */
public enum TargetingAdvertiserCountry {
  
  US("US"),
  
  GB("GB"),
  
  CA("CA"),
  
  IE("IE"),
  
  AU("AU"),
  
  NZ("NZ"),
  
  FR("FR"),
  
  SE("SE"),
  
  IL("IL"),
  
  DE("DE"),
  
  AT("AT"),
  
  IT("IT"),
  
  ES("ES"),
  
  NL("NL"),
  
  BE("BE"),
  
  PT("PT"),
  
  CH("CH"),
  
  HK("HK"),
  
  JP("JP"),
  
  KR("KR"),
  
  SG("SG"),
  
  NO("NO"),
  
  DK("DK"),
  
  FI("FI"),
  
  CY("CY"),
  
  LU("LU"),
  
  MT("MT"),
  
  PL("PL"),
  
  RO("RO"),
  
  HU("HU"),
  
  CZ("CZ"),
  
  GR("GR"),
  
  SK("SK"),
  
  BR("BR"),
  
  MX("MX"),
  
  AR("AR"),
  
  CL("CL"),
  
  CO("CO");

  private String value;

  TargetingAdvertiserCountry(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TargetingAdvertiserCountry fromString(String s) {
      for (TargetingAdvertiserCountry b : TargetingAdvertiserCountry.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      return null;
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TargetingAdvertiserCountry fromValue(String value) {
    for (TargetingAdvertiserCountry b : TargetingAdvertiserCountry.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}


