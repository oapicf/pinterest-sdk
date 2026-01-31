package org.openapitools.model;



/**
 * Gets or Sets BoardUpdatePrivacy
 */
public enum BoardUpdatePrivacy {
  
  PUBLIC("PUBLIC"),
  
  SECRET("SECRET");

  private String value;

  BoardUpdatePrivacy(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BoardUpdatePrivacy fromValue(String value) {
    for (BoardUpdatePrivacy b : BoardUpdatePrivacy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

