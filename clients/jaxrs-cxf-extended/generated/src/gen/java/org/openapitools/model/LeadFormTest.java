package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Lead form test action: submit sample answers and receive the resulting subscription id.
 */
@ApiModel(description="Lead form test action: submit sample answers and receive the resulting subscription id.")

public class LeadFormTest  {
  
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
   * <br><em>N.B. <code>subscriptionId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  /**
   * Sets the <code>subscriptionId</code> property.
   * <br><em>N.B. <code>subscriptionId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public LeadFormTest subscriptionId(String subscriptionId) {
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
    LeadFormTest leadFormTest = (LeadFormTest) o;
    return Objects.equals(this.subscriptionId, leadFormTest.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormTest {\n");
    
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

