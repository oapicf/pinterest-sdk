package org.openapitools.model;



/**
 * The type of invite. MEMBER_INVITE invites a member to access your business assets. PARTNER_INVITE invites a partner to access your business assets. PARTNER_REQUEST requests access to a partner&#39;s business assets.
 */
public enum InviteType {
  
  MEMBER_INVITE("MEMBER_INVITE"),
  
  PARTNER_INVITE("PARTNER_INVITE"),
  
  PARTNER_REQUEST("PARTNER_REQUEST");

  private String value;

  InviteType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InviteType fromValue(String value) {
    for (InviteType b : InviteType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

