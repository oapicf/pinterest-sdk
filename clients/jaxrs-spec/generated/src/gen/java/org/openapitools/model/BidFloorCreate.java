package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BidFloorSpec;
import org.openapitools.model.TargetingSpecOptimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("BidFloorCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BidFloorCreate   {
  private @Valid List<@Valid BidFloorSpec> bidFloorSpecs = new ArrayList<>();
  private TargetingSpecOptimal targetingSpec;

  public BidFloorCreate() {
  }

  @JsonCreator
  public BidFloorCreate(
    @JsonProperty(required = true, value = "bid_floor_specs") List<@Valid BidFloorSpec> bidFloorSpecs
  ) {
    this.bidFloorSpecs = bidFloorSpecs;
  }

  /**
   * List of bid floor specifications.
   **/
  public BidFloorCreate bidFloorSpecs(List<@Valid BidFloorSpec> bidFloorSpecs) {
    this.bidFloorSpecs = bidFloorSpecs;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of bid floor specifications.")
  @JsonProperty(required = true, value = "bid_floor_specs")
  @NotNull @Valid public List<@Valid BidFloorSpec> getBidFloorSpecs() {
    return bidFloorSpecs;
  }

  @JsonProperty(required = true, value = "bid_floor_specs")
  public void setBidFloorSpecs(List<@Valid BidFloorSpec> bidFloorSpecs) {
    this.bidFloorSpecs = bidFloorSpecs;
  }

  public BidFloorCreate addBidFloorSpecsItem(BidFloorSpec bidFloorSpecsItem) {
    if (this.bidFloorSpecs == null) {
      this.bidFloorSpecs = new ArrayList<>();
    }

    this.bidFloorSpecs.add(bidFloorSpecsItem);
    return this;
  }

  public BidFloorCreate removeBidFloorSpecsItem(BidFloorSpec bidFloorSpecsItem) {
    if (bidFloorSpecsItem != null && this.bidFloorSpecs != null) {
      this.bidFloorSpecs.remove(bidFloorSpecsItem);
    }

    return this;
  }
  /**
   * Ad group targeting specification defining the ad group target audience.
   **/
  public BidFloorCreate targetingSpec(TargetingSpecOptimal targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

  
  @ApiModelProperty(value = "Ad group targeting specification defining the ad group target audience.")
  @JsonProperty("targeting_spec")
  @Valid public TargetingSpecOptimal getTargetingSpec() {
    return targetingSpec;
  }

  @JsonProperty("targeting_spec")
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
