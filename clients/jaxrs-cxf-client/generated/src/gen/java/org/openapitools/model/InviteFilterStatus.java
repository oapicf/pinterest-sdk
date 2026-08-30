package org.openapitools.model;



/**
 * Invite statuses used for filters.
 */
public enum InviteFilterStatus {
  
  PENDING("PENDING"),
  
  EXPIRED("EXPIRED");

  private String value;

  InviteFilterStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InviteFilterStatus fromValue(String value) {
    for (InviteFilterStatus b : InviteFilterStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

