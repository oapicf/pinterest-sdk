/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.BidFloorSpec;
import org.openapitools.client.model.TargetingSpec;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BidFloorRequest {
  
  @SerializedName("bid_floor_specs")
  private List<BidFloorSpec> bidFloorSpecs = null;
  @SerializedName("targeting_spec")
  private TargetingSpec targetingSpec = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<BidFloorSpec> getBidFloorSpecs() {
    return bidFloorSpecs;
  }
  public void setBidFloorSpecs(List<BidFloorSpec> bidFloorSpecs) {
    this.bidFloorSpecs = bidFloorSpecs;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.bidFloorSpecs == null ? bidFloorRequest.bidFloorSpecs == null : this.bidFloorSpecs.equals(bidFloorRequest.bidFloorSpecs)) &&
        (this.targetingSpec == null ? bidFloorRequest.targetingSpec == null : this.targetingSpec.equals(bidFloorRequest.targetingSpec));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.bidFloorSpecs == null ? 0: this.bidFloorSpecs.hashCode());
    result = 31 * result + (this.targetingSpec == null ? 0: this.targetingSpec.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidFloorRequest {\n");
    
    sb.append("  bidFloorSpecs: ").append(bidFloorSpecs).append("\n");
    sb.append("  targetingSpec: ").append(targetingSpec).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
