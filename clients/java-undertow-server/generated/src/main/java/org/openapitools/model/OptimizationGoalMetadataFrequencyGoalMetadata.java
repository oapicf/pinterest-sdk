/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OptimizationGoalMetadataFrequencyGoalMetadata   {
  
  private Integer frequency;


  public enum TimerangeEnum {
    THIRTY_DAY("THIRTY_DAY"),
    DAY("DAY"),
    SEVEN_DAY("SEVEN_DAY"),
    TWENTY_MINUTE("TWENTY_MINUTE"),
    TEN_MINUTE("TEN_MINUTE"),
    TWENTY_FOUR_HOUR("TWENTY_FOUR_HOUR");

    private String value;

    TimerangeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TimerangeEnum timerange;

  /**
   */
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
   */
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
    return Objects.equals(frequency, optimizationGoalMetadataFrequencyGoalMetadata.frequency) &&
        Objects.equals(timerange, optimizationGoalMetadataFrequencyGoalMetadata.timerange);
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

