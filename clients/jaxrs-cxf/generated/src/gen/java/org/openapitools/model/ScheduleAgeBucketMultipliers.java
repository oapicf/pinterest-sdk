package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
@ApiModel(description="This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.")

public class ScheduleAgeBucketMultipliers extends HashMap<String, Double> {
  
public enum AGEBUCKETEnum {

_18_24(String.valueOf("18-24")), _25_34(String.valueOf("25-34")), _35_44(String.valueOf("35-44")), _45_49(String.valueOf("45-49")), _50_54(String.valueOf("50-54")), _55_64(String.valueOf("55-64")), _65_(String.valueOf("65+"));


    private String value;

    AGEBUCKETEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static AGEBUCKETEnum fromValue(String value) {
        for (AGEBUCKETEnum b : AGEBUCKETEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private AGEBUCKETEnum AGE_BUCKET;
 /**
   * Get AGE_BUCKET
   * @return AGE_BUCKET
  **/
  @JsonProperty("AGE_BUCKET")
  public String getAGEBUCKET() {
    if (AGE_BUCKET == null) {
      return null;
    }
    return AGE_BUCKET.value();
  }

  public void setAGEBUCKET(AGEBUCKETEnum AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
  }

  public ScheduleAgeBucketMultipliers AGE_BUCKET(AGEBUCKETEnum AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
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
    ScheduleAgeBucketMultipliers scheduleAgeBucketMultipliers = (ScheduleAgeBucketMultipliers) o;
    return Objects.equals(this.AGE_BUCKET, scheduleAgeBucketMultipliers.AGE_BUCKET) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AGE_BUCKET, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleAgeBucketMultipliers {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    AGE_BUCKET: ").append(toIndentedString(AGE_BUCKET)).append("\n");
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

