package org.openapitools.model;



/**
 * Gets or Sets BoardPrivacyFilter
 */
public enum BoardPrivacyFilter {
  
  ALL("ALL"),
  
  PUBLIC("PUBLIC"),
  
  PROTECTED("PROTECTED"),
  
  SECRET("SECRET"),
  
  PUBLIC_AND_SECRET("PUBLIC_AND_SECRET");

  private String value;

  BoardPrivacyFilter(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BoardPrivacyFilter fromValue(String value) {
    for (BoardPrivacyFilter b : BoardPrivacyFilter.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

