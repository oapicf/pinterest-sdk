package org.openapitools.model;



/**
 * The schedule type
 */
public enum ScheduleType {
  
  CAMPAIGN_BUDGET_CHANGE("CAMPAIGN_BUDGET_CHANGE"),
  
  CAMPAIGN_BID_MULTIPLIERS("CAMPAIGN_BID_MULTIPLIERS");

  private String value;

  ScheduleType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ScheduleType fromValue(String value) {
    for (ScheduleType b : ScheduleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

