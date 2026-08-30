package org.openapitools.model;



/**
 * Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users.
 */
public enum CustomerListStatus {
  
  PROCESSING("PROCESSING"),
  
  READY("READY"),
  
  TOO_SMALL("TOO_SMALL"),
  
  UPLOADING("UPLOADING");

  private String value;

  CustomerListStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CustomerListStatus fromValue(String value) {
    for (CustomerListStatus b : CustomerListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

