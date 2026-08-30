package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.FrequencyGoalMetadataTimerange;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Frequency target can only be between 2 and 20
 */
@ApiModel(description="Frequency target can only be between 2 and 20")

public class FrequencyGoalMetadata  {
  
  @ApiModelProperty(value = "")
  private Integer frequency;

  @ApiModelProperty(value = "")
  @Valid
  private FrequencyGoalMetadataTimerange timerange;
 /**
  * Get frequency
  * minimum: 2
  * maximum: 20
  * @return frequency
  */
  @JsonProperty("frequency")
 @Min(2) @Max(20)  public Integer getFrequency() {
    return frequency;
  }

  /**
   * Sets the <code>frequency</code> property.
   */
 public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  /**
   * Sets the <code>frequency</code> property.
   */
  public FrequencyGoalMetadata frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

 /**
  * Get timerange
  * @return timerange
  */
  @JsonProperty("timerange")
  public FrequencyGoalMetadataTimerange getTimerange() {
    return timerange;
  }

  /**
   * Sets the <code>timerange</code> property.
   */
 public void setTimerange(FrequencyGoalMetadataTimerange timerange) {
    this.timerange = timerange;
  }

  /**
   * Sets the <code>timerange</code> property.
   */
  public FrequencyGoalMetadata timerange(FrequencyGoalMetadataTimerange timerange) {
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
    FrequencyGoalMetadata frequencyGoalMetadata = (FrequencyGoalMetadata) o;
    return Objects.equals(this.frequency, frequencyGoalMetadata.frequency) &&
        Objects.equals(this.timerange, frequencyGoalMetadata.timerange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, timerange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequencyGoalMetadata {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

