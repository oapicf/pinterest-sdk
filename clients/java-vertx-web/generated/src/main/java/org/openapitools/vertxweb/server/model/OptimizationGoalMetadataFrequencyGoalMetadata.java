package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public OptimizationGoalMetadataFrequencyGoalMetadata () {

  }

  public OptimizationGoalMetadataFrequencyGoalMetadata (Integer frequency, TimerangeEnum timerange) {
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
