package org.openapitools.model;

import org.openapitools.model.FrequencyGoalMetadataTimerange;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Frequency target can only be between 2 and 20
 */
public class FrequencyGoalMetadata implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("frequency")
  private Integer frequency;

  @JsonProperty("timerange")
  private FrequencyGoalMetadataTimerange timerange;

  /**
   * 
   * @return frequency
   */
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  /**
   * 
   * @return timerange
   */
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
