package org.openapitools.model;

import io.swagger.annotations.ApiModel;


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

