package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BidFloorSpec;
import org.openapitools.model.TargetingSpec;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BidFloorRequest   {
  
  private List<@Valid BidFloorSpec> bidFloorSpecs = new ArrayList<>();
  private TargetingSpec targetingSpec;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("bid_floor_specs")
  @NotNull
  @Valid
  public List<@Valid BidFloorSpec> getBidFloorSpecs() {
    return bidFloorSpecs;
  }
  public void setBidFloorSpecs(List<@Valid BidFloorSpec> bidFloorSpecs) {
    this.bidFloorSpecs = bidFloorSpecs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("targeting_spec")
  @Valid
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

