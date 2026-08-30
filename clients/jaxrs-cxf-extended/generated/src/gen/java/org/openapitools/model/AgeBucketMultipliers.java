package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.TargetingSpecAgeBucket;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This represents a mapping from age bucket to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified age bucket in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */
@ApiModel(description="This represents a mapping from age bucket to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified age bucket in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).")

public class AgeBucketMultipliers extends HashMap<String, Double> {
  
 /**
  * Age bucket identifier.
  */
  @ApiModelProperty(value = "Age bucket identifier.")
  @Valid
  private TargetingSpecAgeBucket AGE_BUCKET;
 /**
  * Age bucket identifier.
  * @return AGE_BUCKET
  */
  @JsonProperty("AGE_BUCKET")
  public TargetingSpecAgeBucket getAGEBUCKET() {
    return AGE_BUCKET;
  }

  /**
   * Sets the <code>AGE_BUCKET</code> property.
   */
 public void setAGEBUCKET(TargetingSpecAgeBucket AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
  }

  /**
   * Sets the <code>AGE_BUCKET</code> property.
   */
  public AgeBucketMultipliers AGE_BUCKET(TargetingSpecAgeBucket AGE_BUCKET) {
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
    AgeBucketMultipliers ageBucketMultipliers = (AgeBucketMultipliers) o;
    return super.equals(o) && Objects.equals(this.AGE_BUCKET, ageBucketMultipliers.AGE_BUCKET);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), AGE_BUCKET);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgeBucketMultipliers {\n");
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

