package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OptimizationGoalMetadataFrequencyGoalMetadata  {
  
  @ApiModelProperty(value = "")
  private Integer frequency;

public enum TimerangeEnum {

THIRTY_DAY(String.valueOf("THIRTY_DAY")), DAY(String.valueOf("DAY")), SEVEN_DAY(String.valueOf("SEVEN_DAY")), TWENTY_MINUTE(String.valueOf("TWENTY_MINUTE")), TEN_MINUTE(String.valueOf("TEN_MINUTE")), TWENTY_FOUR_HOUR(String.valueOf("TWENTY_FOUR_HOUR"));


    private String value;

    TimerangeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static TimerangeEnum fromValue(String value) {
        for (TimerangeEnum b : TimerangeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "DAY", value = "User entity counts time range")
 /**
   * User entity counts time range
  **/
  private TimerangeEnum timerange;
 /**
   * Get frequency
   * @return frequency
  **/
  @JsonProperty("frequency")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public OptimizationGoalMetadataFrequencyGoalMetadata frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

 /**
   * User entity counts time range
   * @return timerange
  **/
  @JsonProperty("timerange")
  public String getTimerange() {
    if (timerange == null) {
      return null;
    }
    return timerange.value();
  }

  public void setTimerange(TimerangeEnum timerange) {
    this.timerange = timerange;
  }

  public OptimizationGoalMetadataFrequencyGoalMetadata timerange(TimerangeEnum timerange) {
    this.timerange = timerange;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizationGoalMetadataFrequencyGoalMetadata optimizationGoalMetadataFrequencyGoalMetadata = (OptimizationGoalMetadataFrequencyGoalMetadata) o;
    return Objects.equals(this.frequency, optimizationGoalMetadataFrequencyGoalMetadata.frequency) &&
        Objects.equals(this.timerange, optimizationGoalMetadataFrequencyGoalMetadata.timerange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, timerange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizationGoalMetadataFrequencyGoalMetadata {\n");
    
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    timerange: ").append(toIndentedString(timerange)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

