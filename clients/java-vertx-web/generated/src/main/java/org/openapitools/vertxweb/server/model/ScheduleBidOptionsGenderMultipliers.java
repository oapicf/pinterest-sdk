package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.vertxweb.server.model.TargetingSpecGender;

/**
 * This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScheduleBidOptionsGenderMultipliers extends HashMap<String, Double>  {
  
  private TargetingSpecGender GENDER;

  public ScheduleBidOptionsGenderMultipliers () {

  }

  public ScheduleBidOptionsGenderMultipliers (TargetingSpecGender GENDER) {
    this.GENDER = GENDER;
  }

    
  @JsonProperty("GENDER")
  public TargetingSpecGender getGENDER() {
    return GENDER;
  }
  public void setGENDER(TargetingSpecGender GENDER) {
    this.GENDER = GENDER;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleBidOptionsGenderMultipliers scheduleBidOptionsGenderMultipliers = (ScheduleBidOptionsGenderMultipliers) o;
    return super.equals(o) && Objects.equals(GENDER, scheduleBidOptionsGenderMultipliers.GENDER);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), GENDER);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleBidOptionsGenderMultipliers {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    GENDER: ").append(toIndentedString(GENDER)).append("\n");
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
