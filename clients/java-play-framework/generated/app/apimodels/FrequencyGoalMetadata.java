package apimodels;

import apimodels.FrequencyGoalMetadataTimerange;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Frequency target can only be between 2 and 20
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FrequencyGoalMetadata   {
  @JsonProperty("frequency")
  @Min(2)
@Max(20)

  private Integer frequency;

  @JsonProperty("timerange")
  @Valid

  private FrequencyGoalMetadataTimerange timerange;

  public FrequencyGoalMetadata frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * minimum: 2
   * maximum: 20
   * @return frequency
  **/
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public FrequencyGoalMetadata timerange(FrequencyGoalMetadataTimerange timerange) {
    this.timerange = timerange;
    return this;
  }

   /**
   * Get timerange
   * @return timerange
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

