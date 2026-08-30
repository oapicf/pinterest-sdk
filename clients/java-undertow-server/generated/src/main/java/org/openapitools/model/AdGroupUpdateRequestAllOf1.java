/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TargetingSpecOperations;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupUpdateRequestAllOf1   {
  
  private BigDecimal bidMultiplier;
  private String id;
  private List<TargetingSpecOperations> targetingSpecOperations = new ArrayList<>();

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
   * minimum: 0
   * maximum: 10
   */
  public AdGroupUpdateRequestAllOf1 bidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
    return this;
  }

  
  @ApiModelProperty(value = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.")
  @JsonProperty("bid_multiplier")
  public BigDecimal getBidMultiplier() {
    return bidMultiplier;
  }
  public void setBidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

  /**
   * Ad group ID.
   */
  public AdGroupUpdateRequestAllOf1 id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ad group ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * <div>Targeting spec operations define modifications to apply to the targeting spec.</div> <br /> <div><strong>NOTE:</strong> The <code>targeting_spec</code> and <code>targeting_spec_operations</code> cannot be sent at the same time.</div> <br /> <div>The supported operations are:</div> <ul> <li><code>SET</code>: sets the field with the given values. If value is set to <code>null</code>, the field will be removed.</li> <li><code>ADD</code>: adds the given values to the field.</li> <li><code>REMOVE</code>: removes the given values from the field.</li> </ul> <div>Note the following:</div> <ul> <li>Same items are not added and removed at the same time.</li> <li>For a given field, only <code>ADD</code>/<code>REMOVE</code> or <code>SET</code> operations are allowed, not a mix of them.</li> <li>Only one SET operation is allowed for a given field.</li> <li>The <code>AGE_BUCKET</code>, <code>MAXIMUM_AGE</code>, <code>MINIMUM_AGE</code> and <code>SHOPPING_RETARGETING</code> fields only support the <code>SET</code> operation.</li> </ul>
   */
  public AdGroupUpdateRequestAllOf1 targetingSpecOperations(List<TargetingSpecOperations> targetingSpecOperations) {
    this.targetingSpecOperations = targetingSpecOperations;
    return this;
  }

  
  @ApiModelProperty(value = "<div>Targeting spec operations define modifications to apply to the targeting spec.</div> <br /> <div><strong>NOTE:</strong> The <code>targeting_spec</code> and <code>targeting_spec_operations</code> cannot be sent at the same time.</div> <br /> <div>The supported operations are:</div> <ul> <li><code>SET</code>: sets the field with the given values. If value is set to <code>null</code>, the field will be removed.</li> <li><code>ADD</code>: adds the given values to the field.</li> <li><code>REMOVE</code>: removes the given values from the field.</li> </ul> <div>Note the following:</div> <ul> <li>Same items are not added and removed at the same time.</li> <li>For a given field, only <code>ADD</code>/<code>REMOVE</code> or <code>SET</code> operations are allowed, not a mix of them.</li> <li>Only one SET operation is allowed for a given field.</li> <li>The <code>AGE_BUCKET</code>, <code>MAXIMUM_AGE</code>, <code>MINIMUM_AGE</code> and <code>SHOPPING_RETARGETING</code> fields only support the <code>SET</code> operation.</li> </ul>")
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

