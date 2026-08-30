package apimodels;

import apimodels.TargetingSpecAgeBucket;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * This represents a mapping from age bucket to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified age bucket in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AgeBucketMultipliers extends HashMap<String, Double>  {
  @JsonProperty("AGE_BUCKET")
  @Valid

  private TargetingSpecAgeBucket AGE_BUCKET;

  public AgeBucketMultipliers AGE_BUCKET(TargetingSpecAgeBucket AGE_BUCKET) {
    this.AGE_BUCKET = AGE_BUCKET;
    return this;
  }

   /**
   * Age bucket identifier.
   * @return AGE_BUCKET
  **/
  public TargetingSpecAgeBucket getAGEBUCKET() {
    return AGE_BUCKET;
  }

  public void setAGEBUCKET(TargetingSpecAgeBucket AGE_BUCKET) {
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
    AgeBucketMultipliers ageBucketMultipliers = (AgeBucketMultipliers) o;
    return Objects.equals(AGE_BUCKET, ageBucketMultipliers.AGE_BUCKET) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AGE_BUCKET, super.hashCode());
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

