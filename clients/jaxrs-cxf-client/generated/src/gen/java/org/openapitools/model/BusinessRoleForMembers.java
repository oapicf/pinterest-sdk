package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * The access level a member has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
 */
public enum BusinessRoleForMembers {
  
  EMPLOYEE("EMPLOYEE"),
  
  BIZ_ADMIN("BIZ_ADMIN");

  private String value;

  BusinessRoleForMembers(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BusinessRoleForMembers fromValue(String value) {
    for (BusinessRoleForMembers b : BusinessRoleForMembers.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

