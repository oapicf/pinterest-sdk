package org.openapitools.model;



/**
 * Schedule status
 */
public enum ScheduleStatus {
  
  DRAFT("DRAFT"),
  
  CREATED("CREATED"),
  
  SCHEDULED("SCHEDULED"),
  
  ACTIVE("ACTIVE"),
  
  COMPLETED("COMPLETED"),
  
  FAILED("FAILED"),
  
  CANCELED("CANCELED");

  private String value;

  ScheduleStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ScheduleStatus fromValue(String value) {
    for (ScheduleStatus b : ScheduleStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

