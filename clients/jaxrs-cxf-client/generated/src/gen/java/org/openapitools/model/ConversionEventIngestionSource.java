package org.openapitools.model;



/**
 * The source of conversion events ingestion
 */
public enum ConversionEventIngestionSource {
  
  TAG("TAG"),
  
  MMP("MMP"),
  
  FILE_UPLOAD("FILE_UPLOAD"),
  
  CONVERSIONS_API("CONVERSIONS_API"),
  
  NATIVE("NATIVE");

  private String value;

  ConversionEventIngestionSource(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConversionEventIngestionSource fromValue(String value) {
    for (ConversionEventIngestionSource b : ConversionEventIngestionSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

