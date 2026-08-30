package org.openapitools.model;



/**
 * The field to sort member assets by
 */
public enum AssetSortBy {
  
  NAME("NAME"),
  
  ID("ID"),
  
  PERMISSIONS("PERMISSIONS");

  private String value;

  AssetSortBy(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AssetSortBy fromValue(String value) {
    for (AssetSortBy b : AssetSortBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

