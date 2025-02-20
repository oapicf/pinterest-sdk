/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for lead data test API.
 **/
@ApiModel(description = "Response for lead data test API.")
public class LeadFormTestResponse {
  
  @SerializedName("subscription_id")
  private String subscriptionId = null;

  /**
   * Subscription ID.
   **/
  @ApiModelProperty(value = "Subscription ID.")
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
    return (this.subscriptionId == null ? leadFormTestResponse.subscriptionId == null : this.subscriptionId.equals(leadFormTestResponse.subscriptionId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.subscriptionId == null ? 0: this.subscriptionId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormTestResponse {\n");
    
    sb.append("  subscriptionId: ").append(subscriptionId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
