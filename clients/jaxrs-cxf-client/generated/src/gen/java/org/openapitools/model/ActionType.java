package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Ad group billable event type. For update, only draft ad groups may update billable event.
 */
public enum ActionType {
  
  CLICKTHROUGH("CLICKTHROUGH"),
  
  IMPRESSION("IMPRESSION"),
  
  VIDEO_V_50_MRC("VIDEO_V_50_MRC");

  private String value;

  ActionType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ActionType fromValue(String value) {
    for (ActionType b : ActionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

