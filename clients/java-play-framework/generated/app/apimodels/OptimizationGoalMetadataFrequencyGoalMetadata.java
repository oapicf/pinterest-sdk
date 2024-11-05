package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OptimizationGoalMetadataFrequencyGoalMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OptimizationGoalMetadataFrequencyGoalMetadata   {
  @JsonProperty("frequency")
  
  private Integer frequency;

  /**
   * User entity counts time range
   */
  public enum TimerangeEnum {
    THIRTY_DAY("THIRTY_DAY"),
    
    DAY("DAY"),
    
    SEVEN_DAY("SEVEN_DAY"),
    
    TWENTY_MINUTE("TWENTY_MINUTE"),
    
    TEN_MINUTE("TEN_MINUTE"),
    
    TWENTY_FOUR_HOUR("TWENTY_FOUR_HOUR");

    private final String value;

    TimerangeEnum(String value) {
      this.value = value;
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

  @JsonProperty("timerange")
  
  private TimerangeEnum timerange;

  public OptimizationGoalMetadataFrequencyGoalMetadata frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public OptimizationGoalMetadataFrequencyGoalMetadata timerange(TimerangeEnum timerange) {
    this.timerange = timerange;
    return this;
  }

   /**
   * User entity counts time range
   * @return timerange
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

