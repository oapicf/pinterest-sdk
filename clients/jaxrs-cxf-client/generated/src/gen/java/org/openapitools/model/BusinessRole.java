package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * The access level a member/partner has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. &lt;br&gt; - PARTNER: Can only view and access assets you assign them to/or they assign to you.
 */
public enum BusinessRole {
  
  EMPLOYEE("EMPLOYEE"),
  
  BIZ_ADMIN("BIZ_ADMIN"),
  
  PARTNER("PARTNER");

  private String value;

  BusinessRole(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BusinessRole fromValue(String value) {
    for (BusinessRole b : BusinessRole.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

