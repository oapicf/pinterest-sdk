package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BidFloorSpec;
import org.openapitools.model.TargetingSpec;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BidFloorRequest  {
  
  @ApiModelProperty(required = true, value = "")
  private List<BidFloorSpec> bidFloorSpecs = new ArrayList<>();

  @ApiModelProperty(value = "")
  private TargetingSpec targetingSpec;
 /**
   * Get bidFloorSpecs
   * @return bidFloorSpecs
  **/
  @JsonProperty("bid_floor_specs")
  public List<BidFloorSpec> getBidFloorSpecs() {
    return bidFloorSpecs;
  }

  public void setBidFloorSpecs(List<BidFloorSpec> bidFloorSpecs) {
    this.bidFloorSpecs = bidFloorSpecs;
  }

  public BidFloorRequest bidFloorSpecs(List<BidFloorSpec> bidFloorSpecs) {
    this.bidFloorSpecs = bidFloorSpecs;
    return this;
  }

  public BidFloorRequest addBidFloorSpecsItem(BidFloorSpec bidFloorSpecsItem) {
    this.bidFloorSpecs.add(bidFloorSpecsItem);
    return this;
  }

 /**
   * Get targetingSpec
   * @return targetingSpec
  **/
  @JsonProperty("targeting_spec")
  public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }

  public void setTargetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
  }

  public BidFloorRequest targetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
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
    BidFloorRequest bidFloorRequest = (BidFloorRequest) o;
    return Objects.equals(this.bidFloorSpecs, bidFloorRequest.bidFloorSpecs) &&
        Objects.equals(this.targetingSpec, bidFloorRequest.targetingSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidFloorSpecs, targetingSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidFloorRequest {\n");
    
    sb.append("    bidFloorSpecs: ").append(toIndentedString(bidFloorSpecs)).append("\n");
    sb.append("    targetingSpec: ").append(toIndentedString(targetingSpec)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

