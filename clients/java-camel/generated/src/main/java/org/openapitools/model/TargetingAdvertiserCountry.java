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
 * Advertiser's ISO two character country code.
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
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

