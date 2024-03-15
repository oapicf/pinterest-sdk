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
 * Currency Codes from ISO 4217
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public enum Currency {
  
  UNK("UNK"),
  
  USD("USD"),
  
  GBP("GBP"),
  
  CAD("CAD"),
  
  EUR("EUR"),
  
  AUD("AUD"),
  
  NZD("NZD"),
  
  SEK("SEK"),
  
  ILS("ILS"),
  
  CHF("CHF"),
  
  HKD("HKD"),
  
  JPY("JPY"),
  
  SGD("SGD"),
  
  KRW("KRW"),
  
  NOK("NOK"),
  
  DKK("DKK"),
  
  PLN("PLN"),
  
  RON("RON"),
  
  HUF("HUF"),
  
  CZK("CZK"),
  
  BRL("BRL"),
  
  MXN("MXN"),
  
  ARS("ARS"),
  
  CLP("CLP"),
  
  COP("COP");

  private String value;

  Currency(String value) {
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
  public static Currency fromValue(String value) {
    for (Currency b : Currency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

