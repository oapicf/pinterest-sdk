package org.openapitools.model;



/**
 * Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled.
 */
public enum ConversionDeletionRequestStatus {
  
  PENDING("PENDING"),
  
  SUBMITTED("SUBMITTED"),
  
  CANCELLED("CANCELLED");

  private String value;

  ConversionDeletionRequestStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConversionDeletionRequestStatus fromValue(String value) {
    for (ConversionDeletionRequestStatus b : ConversionDeletionRequestStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

