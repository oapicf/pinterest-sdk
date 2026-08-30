package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TargetingSpecOperations;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AdGroupUpdateRequestAllOf1
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupUpdateRequestAllOf1 {

  private BigDecimal bidMultiplier;

  private String id;

  @Valid
  private List<@Valid TargetingSpecOperations> targetingSpecOperations = new ArrayList<>();

  public AdGroupUpdateRequestAllOf1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdGroupUpdateRequestAllOf1(String id) {
    this.id = id;
  }

  public AdGroupUpdateRequestAllOf1 bidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
   * minimum: 0
   * maximum: 10
   * @return bidMultiplier
   */
  @Valid @DecimalMin(value = "0") @DecimalMax(value = "10") 
  @Schema(name = "bid_multiplier", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid_multiplier")
  public BigDecimal getBidMultiplier() {
    return bidMultiplier;
  }

  public void setBidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

  public AdGroupUpdateRequestAllOf1 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Ad group ID.
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", description = "Ad group ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdGroupUpdateRequestAllOf1 targetingSpecOperations(List<@Valid TargetingSpecOperations> targetingSpecOperations) {
    this.targetingSpecOperations = targetingSpecOperations;
    return this;
  }

  public AdGroupUpdateRequestAllOf1 addTargetingSpecOperationsItem(TargetingSpecOperations targetingSpecOperationsItem) {
    if (this.targetingSpecOperations == null) {
      this.targetingSpecOperations = new ArrayList<>();
    }
    this.targetingSpecOperations.add(targetingSpecOperationsItem);
    return this;
  }

  /**
   * <div>Targeting spec operations define modifications to apply to the targeting spec.</div> <br /> <div><strong>NOTE:</strong> The <code>targeting_spec</code> and <code>targeting_spec_operations</code> cannot be sent at the same time.</div> <br /> <div>The supported operations are:</div> <ul> <li><code>SET</code>: sets the field with the given values. If value is set to <code>null</code>, the field will be removed.</li> <li><code>ADD</code>: adds the given values to the field.</li> <li><code>REMOVE</code>: removes the given values from the field.</li> </ul> <div>Note the following:</div> <ul> <li>Same items are not added and removed at the same time.</li> <li>For a given field, only <code>ADD</code>/<code>REMOVE</code> or <code>SET</code> operations are allowed, not a mix of them.</li> <li>Only one SET operation is allowed for a given field.</li> <li>The <code>AGE_BUCKET</code>, <code>MAXIMUM_AGE</code>, <code>MINIMUM_AGE</code> and <code>SHOPPING_RETARGETING</code> fields only support the <code>SET</code> operation.</li> </ul>
   * @return targetingSpecOperations
   */
  @Valid 
  @Schema(name = "targeting_spec_operations", description = "<div>Targeting spec operations define modifications to apply to the targeting spec.</div> <br /> <div><strong>NOTE:</strong> The <code>targeting_spec</code> and <code>targeting_spec_operations</code> cannot be sent at the same time.</div> <br /> <div>The supported operations are:</div> <ul> <li><code>SET</code>: sets the field with the given values. If value is set to <code>null</code>, the field will be removed.</li> <li><code>ADD</code>: adds the given values to the field.</li> <li><code>REMOVE</code>: removes the given values from the field.</li> </ul> <div>Note the following:</div> <ul> <li>Same items are not added and removed at the same time.</li> <li>For a given field, only <code>ADD</code>/<code>REMOVE</code> or <code>SET</code> operations are allowed, not a mix of them.</li> <li>Only one SET operation is allowed for a given field.</li> <li>The <code>AGE_BUCKET</code>, <code>MAXIMUM_AGE</code>, <code>MINIMUM_AGE</code> and <code>SHOPPING_RETARGETING</code> fields only support the <code>SET</code> operation.</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targeting_spec_operations")
  public List<@Valid TargetingSpecOperations> getTargetingSpecOperations() {
    return targetingSpecOperations;
  }

  public void setTargetingSpecOperations(List<@Valid TargetingSpecOperations> targetingSpecOperations) {
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
    return Objects.equals(this.bidMultiplier, adGroupUpdateRequestAllOf1.bidMultiplier) &&
        Objects.equals(this.id, adGroupUpdateRequestAllOf1.id) &&
        Objects.equals(this.targetingSpecOperations, adGroupUpdateRequestAllOf1.targetingSpecOperations);
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

