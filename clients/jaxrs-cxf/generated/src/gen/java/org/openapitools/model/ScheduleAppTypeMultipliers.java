package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.TargetingSpecAppType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This represents a mapping from app type targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
@ApiModel(description="This represents a mapping from app type targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.")

public class ScheduleAppTypeMultipliers extends HashMap<String, Double> {
  
  @ApiModelProperty(value = "")

  @Valid

  private TargetingSpecAppType APP_TYPE;
 /**
   * Get APP_TYPE
   * @return APP_TYPE
  **/
  @JsonProperty("APP_TYPE")
  public TargetingSpecAppType getAPPTYPE() {
    return APP_TYPE;
  }

  public void setAPPTYPE(TargetingSpecAppType APP_TYPE) {
    this.APP_TYPE = APP_TYPE;
  }

  public ScheduleAppTypeMultipliers APP_TYPE(TargetingSpecAppType APP_TYPE) {
    this.APP_TYPE = APP_TYPE;
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
    ScheduleAppTypeMultipliers scheduleAppTypeMultipliers = (ScheduleAppTypeMultipliers) o;
    return Objects.equals(this.APP_TYPE, scheduleAppTypeMultipliers.APP_TYPE) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(APP_TYPE, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleAppTypeMultipliers {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    APP_TYPE: ").append(toIndentedString(APP_TYPE)).append("\n");
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

