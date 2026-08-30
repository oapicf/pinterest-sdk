package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.BidFloorSpec;
import org.openapitools.vertxweb.server.model.TargetingSpecOptimal;

/**
 * Resource create operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BidFloorCreate   {
  
  private List<BidFloorSpec> bidFloorSpecs = new ArrayList<>();
  private TargetingSpecOptimal targetingSpec;

  public BidFloorCreate () {

  }

  public BidFloorCreate (List<BidFloorSpec> bidFloorSpecs, TargetingSpecOptimal targetingSpec) {
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
    return Objects.equals(bidFloorSpecs, bidFloorCreate.bidFloorSpecs) &&
        Objects.equals(targetingSpec, bidFloorCreate.targetingSpec);
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
