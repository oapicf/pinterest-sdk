package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-07T04:06:56.090374257Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public enum ConversionProductReportGranularity {
  
  TOTAL("TOTAL"),
  
  WEEK("WEEK"),
  
  MONTH("MONTH");

  private String value;

  ConversionProductReportGranularity(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ConversionProductReportGranularity fromString(String s) {
      for (ConversionProductReportGranularity b : ConversionProductReportGranularity.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConversionProductReportGranularity fromValue(String value) {
    for (ConversionProductReportGranularity b : ConversionProductReportGranularity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


