package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class OptimizationGoalMetadataFrequencyGoalMetadata   {
  
  private Integer frequency;


public enum TimerangeEnum {

    @JsonProperty("THIRTY_DAY") THIRTY_DAY(String.valueOf("THIRTY_DAY")), @JsonProperty("DAY") DAY(String.valueOf("DAY")), @JsonProperty("SEVEN_DAY") SEVEN_DAY(String.valueOf("SEVEN_DAY")), @JsonProperty("TWENTY_MINUTE") TWENTY_MINUTE(String.valueOf("TWENTY_MINUTE")), @JsonProperty("TEN_MINUTE") TEN_MINUTE(String.valueOf("TEN_MINUTE")), @JsonProperty("TWENTY_FOUR_HOUR") TWENTY_FOUR_HOUR(String.valueOf("TWENTY_FOUR_HOUR"));


    private String value;

    TimerangeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TimerangeEnum fromValue(String value) {
        for (TimerangeEnum b : TimerangeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private TimerangeEnum timerange;

  /**
   **/
  public OptimizationGoalMetadataFrequencyGoalMetadata frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("frequency")
  public Integer getFrequency() {
    return frequency;
  }
  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }


  /**
   * User entity counts time range
   **/
  public OptimizationGoalMetadataFrequencyGoalMetadata timerange(TimerangeEnum timerange) {
    this.timerange = timerange;
    return this;
  }

  
  @ApiModelProperty(example = "DAY", value = "User entity counts time range")
  @JsonProperty("timerange")
  public TimerangeEnum getTimerange() {
    return timerange;
  }
  public void setTimerange(TimerangeEnum timerange) {
    this.timerange = timerange;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

