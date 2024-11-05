package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 **/

@ApiModel(description = "Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdAccountCreateSubscriptionRequestPartnerMetadata   {
  @JsonProperty("subscriber_key")
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
    return Objects.equals(subscriberKey, adAccountCreateSubscriptionRequestPartnerMetadata.subscriberKey);
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

