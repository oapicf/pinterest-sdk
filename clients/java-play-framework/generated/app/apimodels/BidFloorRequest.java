package apimodels;

import apimodels.BidFloorSpec;
import apimodels.TargetingSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BidFloorRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BidFloorRequest   {
  @JsonProperty("bid_floor_specs")
  @NotNull
@Valid

  private List<@Valid BidFloorSpec> bidFloorSpecs = new ArrayList<>();

  @JsonProperty("targeting_spec")
  @Valid

  private TargetingSpec targetingSpec;

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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

