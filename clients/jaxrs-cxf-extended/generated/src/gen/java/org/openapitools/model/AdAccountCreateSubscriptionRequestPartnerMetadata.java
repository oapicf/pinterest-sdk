package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 */
@ApiModel(description="Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.")

public class AdAccountCreateSubscriptionRequestPartnerMetadata  {
  
 /**
  * Text field value that uniquely identifies a subscriber.
  */
  @ApiModelProperty(value = "Text field value that uniquely identifies a subscriber.")
  private String subscriberKey;
 /**
  * Text field value that uniquely identifies a subscriber.
  * @return subscriberKey
  */
  @JsonProperty("subscriber_key")
  public String getSubscriberKey() {
    return subscriberKey;
  }

  /**
   * Sets the <code>subscriberKey</code> property.
   */
 public void setSubscriberKey(String subscriberKey) {
    this.subscriberKey = subscriberKey;
  }

  /**
   * Sets the <code>subscriberKey</code> property.
   */
  public AdAccountCreateSubscriptionRequestPartnerMetadata subscriberKey(String subscriberKey) {
    this.subscriberKey = subscriberKey;
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
    AdAccountCreateSubscriptionRequestPartnerMetadata adAccountCreateSubscriptionRequestPartnerMetadata = (AdAccountCreateSubscriptionRequestPartnerMetadata) o;
    return Objects.equals(this.subscriberKey, adAccountCreateSubscriptionRequestPartnerMetadata.subscriberKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriberKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountCreateSubscriptionRequestPartnerMetadata {\n");
    
    sb.append("    subscriberKey: ").append(toIndentedString(subscriberKey)).append("\n");
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

