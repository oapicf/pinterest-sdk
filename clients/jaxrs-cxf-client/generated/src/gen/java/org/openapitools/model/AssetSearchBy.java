package org.openapitools.model;



/**
 * The field to search member assets by
 */
public enum AssetSearchBy {
  
  NAME("NAME"),
  
  ID("ID"),
  
  NAME_OR_ID("NAME_OR_ID"),
  
  OWNER_NAME("OWNER_NAME"),
  
  NAME_OR_OWNER("NAME_OR_OWNER");

  private String value;

  AssetSearchBy(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AssetSearchBy fromValue(String value) {
    for (AssetSearchBy b : AssetSearchBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

