package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Response for lead data test API.
 */

@Schema(name = "LeadFormTestResponse", description = "Response for lead data test API.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class LeadFormTestResponse {

  private String subscriptionId;

  public LeadFormTestResponse subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Subscription ID.
   * @return subscriptionId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "subscription_id", example = "8078432025948590686", description = "Subscription ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscription_id")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadFormTestResponse leadFormTestResponse = (LeadFormTestResponse) o;
    return Objects.equals(this.subscriptionId, leadFormTestResponse.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormTestResponse {\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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

