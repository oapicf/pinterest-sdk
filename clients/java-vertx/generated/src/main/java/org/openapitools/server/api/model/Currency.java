package org.openapitools.server.api.model;

import java.util.Objects;

/**
 * Currency Codes from ISO 4217
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Currency Codes from ISO 4217
 */
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

  public static Currency fromValue(String value) {
    for (Currency b : Currency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}