package org.openapitools.model;



/**
 * Gets or Sets BoardPrivacy
 */
public enum BoardPrivacy {
  
  PUBLIC("PUBLIC"),
  
  PROTECTED("PROTECTED"),
  
  SECRET("SECRET");

  private String value;

  BoardPrivacy(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BoardPrivacy fromValue(String value) {
    for (BoardPrivacy b : BoardPrivacy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

