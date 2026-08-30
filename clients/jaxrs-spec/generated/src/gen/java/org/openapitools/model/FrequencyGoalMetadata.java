package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FrequencyGoalMetadataTimerange;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Frequency target can only be between 2 and 20
 **/
@ApiModel(description = "Frequency target can only be between 2 and 20")
@JsonTypeName("FrequencyGoalMetadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class FrequencyGoalMetadata   {
  private Integer frequency;
  private FrequencyGoalMetadataTimerange timerange;

  public FrequencyGoalMetadata() {
  }

  /**
   * minimum: 2
   * maximum: 20
   **/
  public FrequencyGoalMetadata frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("frequency")
   @Min(2) @Max(20)public Integer getFrequency() {
    return frequency;
  }

  @JsonProperty("frequency")
  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  /**
   **/
  public FrequencyGoalMetadata timerange(FrequencyGoalMetadataTimerange timerange) {
    this.timerange = timerange;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("timerange")
  public FrequencyGoalMetadataTimerange getTimerange() {
    return timerange;
  }

  @JsonProperty("timerange")
  public void setTimerange(FrequencyGoalMetadataTimerange timerange) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
