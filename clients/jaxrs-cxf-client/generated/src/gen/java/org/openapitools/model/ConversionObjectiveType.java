package org.openapitools.model;



/**
 * Intended result of the campaign. You can only update objectives for draft campaigns. &#x60;WEB_SESSIONS&#x60; and &#x60;VIDEO_VIEW&#x60; objectives are deprecated. We recommend using &#x60;VIDEO_COMPLETION&#x60; as an alternative for the latter.
 */
public enum ConversionObjectiveType {
  
  AWARENESS("AWARENESS"),
  
  CONSIDERATION("CONSIDERATION"),
  
  WEB_CONVERSION("WEB_CONVERSION"),
  
  CATALOG_SALES("CATALOG_SALES"),
  
  VIDEO_COMPLETION("VIDEO_COMPLETION"),
  
  APP_INSTALL("APP_INSTALL"),
  
  SALES("SALES"),
  
  LEADS("LEADS"),
  
  CTV_CONSIDERATION("CTV_CONSIDERATION");

  private String value;

  ConversionObjectiveType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConversionObjectiveType fromValue(String value) {
    for (ConversionObjectiveType b : ConversionObjectiveType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

