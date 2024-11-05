package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 **/
@ApiModel(description = "Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.")
@JsonTypeName("AdAccountCreateSubscriptionRequest_partner_metadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdAccountCreateSubscriptionRequestPartnerMetadata   {
  private String subscriberKey;

  /**
   * Text field value that uniquely identifies a subscriber.
   **/
  public AdAccountCreateSubscriptionRequestPartnerMetadata subscriberKey(String subscriberKey) {
    this.subscriberKey = subscriberKey;
    return this;
  }

  
  @ApiModelProperty(value = "Text field value that uniquely identifies a subscriber.")
  @JsonProperty("subscriber_key")
  public String getSubscriberKey() {
    return subscriberKey;
  }

  @JsonProperty("subscriber_key")
  public void setSubscriberKey(String subscriberKey) {
    this.subscriberKey = subscriberKey;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

