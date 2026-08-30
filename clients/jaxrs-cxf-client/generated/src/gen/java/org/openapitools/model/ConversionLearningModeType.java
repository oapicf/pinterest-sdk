package org.openapitools.model;



/**
 * oCPM learn mode.
 */
public enum ConversionLearningModeType {
  
  NOT_ACTIVE("NOT_ACTIVE"),
  
  ACTIVE("ACTIVE");

  private String value;

  ConversionLearningModeType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConversionLearningModeType fromValue(String value) {
    for (ConversionLearningModeType b : ConversionLearningModeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

