package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Response for lead data test API.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Response for lead data test API.")
public class LeadFormTestResponse   {
  
  private String subscriptionId;

  /**
   * Subscription ID.
   **/
  public LeadFormTestResponse subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  
  @ApiModelProperty(example = "8078432025948590686", value = "Subscription ID.")
  @JsonProperty("subscription_id")
 @Pattern(regexp="^\\d+$")  public String getSubscriptionId() {
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

