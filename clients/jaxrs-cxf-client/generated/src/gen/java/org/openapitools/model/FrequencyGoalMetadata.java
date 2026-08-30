package org.openapitools.model;

import org.openapitools.model.FrequencyGoalMetadataTimerange;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Frequency target can only be between 2 and 20
 */
@ApiModel(description="Frequency target can only be between 2 and 20")

public class FrequencyGoalMetadata  {
  
  @ApiModelProperty(value = "")

  private Integer frequency;

  @ApiModelProperty(value = "")

  private FrequencyGoalMetadataTimerange timerange;
 /**
   * Get frequency
   * minimum: 2
   * maximum: 20
   * @return frequency
  **/
  @JsonProperty("frequency")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public FrequencyGoalMetadata frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

 /**
   * Get timerange
   * @return timerange
  **/
  @JsonProperty("timerange")
  public FrequencyGoalMetadataTimerange getTimerange() {
    return timerange;
  }

  public void setTimerange(FrequencyGoalMetadataTimerange timerange) {
    this.timerange = timerange;
  }

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

