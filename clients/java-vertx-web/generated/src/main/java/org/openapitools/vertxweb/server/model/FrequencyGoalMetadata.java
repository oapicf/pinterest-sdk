package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.FrequencyGoalMetadataTimerange;

/**
 * Frequency target can only be between 2 and 20
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FrequencyGoalMetadata   {
  
  private Integer frequency;
  private FrequencyGoalMetadataTimerange timerange;

  public FrequencyGoalMetadata () {

  }

  public FrequencyGoalMetadata (Integer frequency, FrequencyGoalMetadataTimerange timerange) {
    this.frequency = frequency;
    this.timerange = timerange;
  }

    
  @JsonProperty("frequency")
  public Integer getFrequency() {
    return frequency;
  }
  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

    
  @JsonProperty("timerange")
  public FrequencyGoalMetadataTimerange getTimerange() {
    return timerange;
  }
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
    return Objects.equals(frequency, frequencyGoalMetadata.frequency) &&
        Objects.equals(timerange, frequencyGoalMetadata.timerange);
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
