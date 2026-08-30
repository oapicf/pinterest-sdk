package org.openapitools.model;

import org.openapitools.model.TargetingSpecGender;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
public class ScheduleGenderMultipliers extends HashMap<String, Double> {
  private static final long serialVersionUID = 1L;

  @JsonProperty("GENDER")
  private TargetingSpecGender GENDER;

  /**
   * 
   * @return GENDER
   */
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
    ScheduleGenderMultipliers scheduleGenderMultipliers = (ScheduleGenderMultipliers) o;
    return Objects.equals(this.GENDER, scheduleGenderMultipliers.GENDER) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GENDER, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleGenderMultipliers {\n");
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
