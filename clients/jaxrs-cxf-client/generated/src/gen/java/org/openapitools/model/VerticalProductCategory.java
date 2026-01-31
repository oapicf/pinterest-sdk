package org.openapitools.model;



/**
 * List of verticals for product categories.
 */
public enum VerticalProductCategory {
  
  FASHION("FASHION"),
  
  HOME_DECOR("HOME_DECOR"),
  
  BEAUTY("BEAUTY");

  private String value;

  VerticalProductCategory(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VerticalProductCategory fromValue(String value) {
    for (VerticalProductCategory b : VerticalProductCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

