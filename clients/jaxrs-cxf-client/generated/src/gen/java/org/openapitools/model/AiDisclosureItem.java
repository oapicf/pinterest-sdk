package org.openapitools.model;



/**
 * AI disclosure declaration the creator has made about the Pin.
 */
public enum AiDisclosureItem {
  
  AI_MODIFIED("AI_MODIFIED"),
  
  SYNTHETIC_PERFORMER("SYNTHETIC_PERFORMER");

  private String value;

  AiDisclosureItem(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AiDisclosureItem fromValue(String value) {
    for (AiDisclosureItem b : AiDisclosureItem.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

