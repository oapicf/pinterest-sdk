package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TargetingAdvertiserCountry fromValue(String value) {
    for (TargetingAdvertiserCountry b : TargetingAdvertiserCountry.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

