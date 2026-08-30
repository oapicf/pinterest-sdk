package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BidFloorSpec;
import org.openapitools.model.TargetingSpecOptimal;

/**
 * Resource create operation model.
 */
@ApiModel(description = "Resource create operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BidFloorCreate   {
  @JsonProperty("bid_floor_specs")
  private List<@Valid BidFloorSpec> bidFloorSpecs = new ArrayList<>();

  @JsonProperty("targeting_spec")
  private TargetingSpecOptimal targetingSpec;

  public BidFloorCreate bidFloorSpecs(List<@Valid BidFloorSpec> bidFloorSpecs) {
    this.bidFloorSpecs = bidFloorSpecs;
    return this;
  }

  public BidFloorCreate addBidFloorSpecsItem(BidFloorSpec bidFloorSpecsItem) {
    this.bidFloorSpecs.add(bidFloorSpecsItem);
    return this;
  }

   /**
   * List of bid floor specifications.
   * @return bidFloorSpecs
  **/
  @ApiModelProperty(required = true, value = "List of bid floor specifications.")
  public List<@Valid BidFloorSpec> getBidFloorSpecs() {
    return bidFloorSpecs;
  }

  public void setBidFloorSpecs(List<@Valid BidFloorSpec> bidFloorSpecs) {
    this.bidFloorSpecs = bidFloorSpecs;
  }

  public BidFloorCreate targetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

   /**
   * Ad group targeting specification defining the ad group target audience.
   * @return targetingSpec
  **/
  @ApiModelProperty(value = "Ad group targeting specification defining the ad group target audience.")
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

