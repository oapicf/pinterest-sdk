package org.openapitools.model;



/**
 * The name of field that businesses are sorted by
 */
public enum BusinessMemberSortBy {
  
  FULL_NAME("FULL_NAME"),
  
  BUSINESS_ROLES("BUSINESS_ROLES"),
  
  CREATED_TIME("CREATED_TIME");

  private String value;

  BusinessMemberSortBy(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BusinessMemberSortBy fromValue(String value) {
    for (BusinessMemberSortBy b : BusinessMemberSortBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

