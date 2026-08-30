package org.openapitools.model;



/**
 * Campaign placement group type
 */
public enum AdgroupPlacementGroupType {
  
  ALL("ALL"),
  
  SEARCH("SEARCH"),
  
  BROWSE("BROWSE"),
  
  OTHER("OTHER");

  private String value;

  AdgroupPlacementGroupType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdgroupPlacementGroupType fromValue(String value) {
    for (AdgroupPlacementGroupType b : AdgroupPlacementGroupType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

