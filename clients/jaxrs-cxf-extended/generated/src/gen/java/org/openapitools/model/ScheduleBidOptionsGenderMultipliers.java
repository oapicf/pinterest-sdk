package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.TargetingSpecGender;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
@ApiModel(description="This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.")

public class ScheduleBidOptionsGenderMultipliers extends HashMap<String, Double> {
  
  @ApiModelProperty(value = "")
  @Valid
  private TargetingSpecGender GENDER;
 /**
  * Get GENDER
  * @return GENDER
  */
  @JsonProperty("GENDER")
  public TargetingSpecGender getGENDER() {
    return GENDER;
  }

  /**
   * Sets the <code>GENDER</code> property.
   */
 public void setGENDER(TargetingSpecGender GENDER) {
    this.GENDER = GENDER;
  }

  /**
   * Sets the <code>GENDER</code> property.
   */
  public ScheduleBidOptionsGenderMultipliers GENDER(TargetingSpecGender GENDER) {
    this.GENDER = GENDER;
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
    ScheduleBidOptionsGenderMultipliers scheduleBidOptionsGenderMultipliers = (ScheduleBidOptionsGenderMultipliers) o;
    return super.equals(o) && Objects.equals(this.GENDER, scheduleBidOptionsGenderMultipliers.GENDER);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

