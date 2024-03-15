package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Response for lead data test API.
 */
@ApiModel(description="Response for lead data test API.")

public class LeadFormTestResponse  {
  
 /**
  * Subscription ID.
  */
  @ApiModelProperty(example = "8078432025948590686", value = "Subscription ID.")
  private String subscriptionId;
 /**
  * Subscription ID.
  * @return subscriptionId
  */
  @JsonProperty("subscription_id")
 @Pattern(regexp="^\\d+$")  public String getSubscriptionId() {
    return subscriptionId;
  }

  /**
   * Sets the <code>subscriptionId</code> property.
   */
 public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  /**
   * Sets the <code>subscriptionId</code> property.
   */
  public LeadFormTestResponse subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

