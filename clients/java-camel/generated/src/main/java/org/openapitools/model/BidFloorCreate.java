package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BidFloorSpec;
import org.openapitools.model.TargetingSpecOptimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "BidFloorCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BidFloorCreate {

  @Valid
  private List<@Valid BidFloorSpec> bidFloorSpecs = new ArrayList<>();

  private TargetingSpecOptimal targetingSpec;

  public BidFloorCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BidFloorCreate(List<@Valid BidFloorSpec> bidFloorSpecs) {
    this.bidFloorSpecs = bidFloorSpecs;
  }

  public BidFloorCreate bidFloorSpecs(List<@Valid BidFloorSpec> bidFloorSpecs) {
    this.bidFloorSpecs = bidFloorSpecs;
    return this;
  }

  public BidFloorCreate addBidFloorSpecsItem(BidFloorSpec bidFloorSpecsItem) {
    if (this.bidFloorSpecs == null) {
      this.bidFloorSpecs = new ArrayList<>();
    }
    this.bidFloorSpecs.add(bidFloorSpecsItem);
    return this;
  }

  /**
   * List of bid floor specifications.
   * @return bidFloorSpecs
   */
  @NotNull @Valid 
  @Schema(name = "bid_floor_specs", description = "List of bid floor specifications.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bid_floor_specs")
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
   */
  @Valid 
  @Schema(name = "targeting_spec", description = "Ad group targeting specification defining the ad group target audience.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

