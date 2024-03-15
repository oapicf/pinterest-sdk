package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BidFloorSpec;
import org.openapitools.model.TargetingSpec;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BidFloorRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BidFloorRequest {

  @Valid
  private List<@Valid BidFloorSpec> bidFloorSpecs = new ArrayList<>();

  private TargetingSpec targetingSpec;

  public BidFloorRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BidFloorRequest(List<@Valid BidFloorSpec> bidFloorSpecs) {
    this.bidFloorSpecs = bidFloorSpecs;
  }

  public BidFloorRequest bidFloorSpecs(List<@Valid BidFloorSpec> bidFloorSpecs) {
    this.bidFloorSpecs = bidFloorSpecs;
    return this;
  }

  public BidFloorRequest addBidFloorSpecsItem(BidFloorSpec bidFloorSpecsItem) {
    if (this.bidFloorSpecs == null) {
      this.bidFloorSpecs = new ArrayList<>();
    }
    this.bidFloorSpecs.add(bidFloorSpecsItem);
    return this;
  }

  /**
   * Get bidFloorSpecs
   * @return bidFloorSpecs
  */
  @NotNull @Valid 
  @Schema(name = "bid_floor_specs", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bid_floor_specs")
  public List<@Valid BidFloorSpec> getBidFloorSpecs() {
    return bidFloorSpecs;
  }

  public void setBidFloorSpecs(List<@Valid BidFloorSpec> bidFloorSpecs) {
    this.bidFloorSpecs = bidFloorSpecs;
  }

  public BidFloorRequest targetingSpec(TargetingSpec targetingSpec) {
    this.targetingSpec = targetingSpec;
    return this;
  }

  /**
   * Get targetingSpec
   * @return targetingSpec
  */
  @Valid 
  @Schema(name = "targeting_spec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

