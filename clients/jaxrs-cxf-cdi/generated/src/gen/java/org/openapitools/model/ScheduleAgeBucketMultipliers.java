package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.")
public class ScheduleAgeBucketMultipliers extends HashMap<String, Double>  {
  

public enum AGEBUCKETEnum {

    @JsonProperty("18-24") _18_24(String.valueOf("18-24")), @JsonProperty("25-34") _25_34(String.valueOf("25-34")), @JsonProperty("35-44") _35_44(String.valueOf("35-44")), @JsonProperty("45-49") _45_49(String.valueOf("45-49")), @JsonProperty("50-54") _50_54(String.valueOf("50-54")), @JsonProperty("55-64") _55_64(String.valueOf("55-64")), @JsonProperty("65+") _65_(String.valueOf("65+"));


    private String value;

    AGEBUCKETEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AGEBUCKETEnum fromValue(String value) {
        for (AGEBUCKETEnum b : AGEBUCKETEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private AGEBUCKETEnum AGE_BUCKET;

  /**
   **/
  public ScheduleAgeBucketMultipliers AGE_BUCKET(AGEBUCKETEnum AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("AGE_BUCKET")
  public AGEBUCKETEnum getAGEBUCKET() {
    return AGE_BUCKET;
  }
  public void setAGEBUCKET(AGEBUCKETEnum AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
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
    return super.equals(o) && Objects.equals(this.AGE_BUCKET, scheduleAgeBucketMultipliers.AGE_BUCKET);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), AGE_BUCKET);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

