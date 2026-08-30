package org.openapitools.model;



/**
 * Type of user conversion event.
 */
public enum MsotEventName {
  
  ADD_TO_CART("add_to_cart"),
  
  CHECKOUT("checkout"),
  
  LEAD("lead"),
  
  SIGNUP("signup");

  private String value;

  MsotEventName(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MsotEventName fromValue(String value) {
    for (MsotEventName b : MsotEventName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

