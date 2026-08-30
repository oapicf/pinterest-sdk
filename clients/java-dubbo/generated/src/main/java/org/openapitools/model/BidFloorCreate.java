package org.openapitools.model;

import org.openapitools.model.BidFloorSpec;
import org.openapitools.model.TargetingSpecOptimal;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class BidFloorCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * List of bid floor specifications.
   */
  @JsonProperty("bid_floor_specs")
  private List<BidFloorSpec> bidFloorSpecs = new ArrayList<>();

  /**
   * Ad group targeting specification defining the ad group target audience.
   */
  @JsonProperty("targeting_spec")
  private TargetingSpecOptimal targetingSpec;

  /**
   * List of bid floor specifications.
   * @return bidFloorSpecs
   */
  public List<BidFloorSpec> getBidFloorSpecs() {
    return bidFloorSpecs;
  }

  public void setBidFloorSpecs(List<BidFloorSpec> bidFloorSpecs) {
    this.bidFloorSpecs = bidFloorSpecs;
  }

  /**
   * Ad group targeting specification defining the ad group target audience.
   * @return targetingSpec
   */
  public TargetingSpecOptimal getTargetingSpec() {
    return targetingSpec;
  }

  public void setTargetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidFloorCreate bidFloorCreate = (BidFloorCreate) o;
    return Objects.equals(this.bidFloorSpecs, bidFloorCreate.bidFloorSpecs) &&
        Objects.equals(this.targetingSpec, bidFloorCreate.targetingSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidFloorSpecs, targetingSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidFloorCreate {\n");
    
    sb.append("    bidFloorSpecs: ").append(toIndentedString(bidFloorSpecs)).append("\n");
    sb.append("    targetingSpec: ").append(toIndentedString(targetingSpec)).append("\n");
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
