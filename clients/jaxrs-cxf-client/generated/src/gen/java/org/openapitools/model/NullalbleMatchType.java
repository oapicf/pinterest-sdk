package org.openapitools.model;



/**
 * Keyword match type allowing null
 */
public enum NullalbleMatchType {
  
  BROAD("BROAD"),
  
  PHRASE("PHRASE"),
  
  EXACT("EXACT"),
  
  EXACT_NEGATIVE("EXACT_NEGATIVE"),
  
  PHRASE_NEGATIVE("PHRASE_NEGATIVE");

  private String value;

  NullalbleMatchType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NullalbleMatchType fromValue(String value) {
    for (NullalbleMatchType b : NullalbleMatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

