package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.TargetingSpecOperations;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdGroupUpdateRequestAllOf1   {
  
  private BigDecimal bidMultiplier;
  private String id;
  private List<TargetingSpecOperations> targetingSpecOperations = new ArrayList<>();

  public AdGroupUpdateRequestAllOf1 () {

  }

  public AdGroupUpdateRequestAllOf1 (BigDecimal bidMultiplier, String id, List<TargetingSpecOperations> targetingSpecOperations) {
    this.bidMultiplier = bidMultiplier;
    this.id = id;
    this.targetingSpecOperations = targetingSpecOperations;
  }

    
  @JsonProperty("bid_multiplier")
  public BigDecimal getBidMultiplier() {
    return bidMultiplier;
  }
  public void setBidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("targeting_spec_operations")
  public List<TargetingSpecOperations> getTargetingSpecOperations() {
    return targetingSpecOperations;
  }
  public void setTargetingSpecOperations(List<TargetingSpecOperations> targetingSpecOperations) {
    this.targetingSpecOperations = targetingSpecOperations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupUpdateRequestAllOf1 adGroupUpdateRequestAllOf1 = (AdGroupUpdateRequestAllOf1) o;
    return Objects.equals(bidMultiplier, adGroupUpdateRequestAllOf1.bidMultiplier) &&
        Objects.equals(id, adGroupUpdateRequestAllOf1.id) &&
        Objects.equals(targetingSpecOperations, adGroupUpdateRequestAllOf1.targetingSpecOperations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidMultiplier, id, targetingSpecOperations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupUpdateRequestAllOf1 {\n");
    
    sb.append("    bidMultiplier: ").append(toIndentedString(bidMultiplier)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    targetingSpecOperations: ").append(toIndentedString(targetingSpecOperations)).append("\n");
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
