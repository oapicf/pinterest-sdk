package org.openapitools.model;



/**
 * Ad review status
 */
public enum AdReviewStatus {
  
  OTHER("OTHER"),
  
  PENDING("PENDING"),
  
  REJECTED("REJECTED"),
  
  APPROVED("APPROVED");

  private String value;

  AdReviewStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdReviewStatus fromValue(String value) {
    for (AdReviewStatus b : AdReviewStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

