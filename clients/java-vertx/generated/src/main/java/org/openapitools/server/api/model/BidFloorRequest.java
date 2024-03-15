package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.BidFloorSpec;
import org.openapitools.server.api.model.TargetingSpec;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BidFloorRequest   {
  
  private List<BidFloorSpec> bidFloorSpecs = new ArrayList<>();
  private TargetingSpec targetingSpec;

  public BidFloorRequest () {

  }

  public BidFloorRequest (List<BidFloorSpec> bidFloorSpecs, TargetingSpec targetingSpec) {
    this.bidFloorSpecs = bidFloorSpecs;
    this.targetingSpec = targetingSpec;
  }

    
  @JsonProperty("bid_floor_specs")
  public List<BidFloorSpec> getBidFloorSpecs() {
    return bidFloorSpecs;
  }
  public void setBidFloorSpecs(List<BidFloorSpec> bidFloorSpecs) {
    this.bidFloorSpecs = bidFloorSpecs;
  }

    
  @JsonProperty("targeting_spec")
  public TargetingSpec getTargetingSpec() {
    return targetingSpec;
  }
  public void setTargetingSpec(TargetingSpec targetingSpec) {
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
    BidFloorRequest bidFloorRequest = (BidFloorRequest) o;
    return Objects.equals(bidFloorSpecs, bidFloorRequest.bidFloorSpecs) &&
        Objects.equals(targetingSpec, bidFloorRequest.targetingSpec);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
