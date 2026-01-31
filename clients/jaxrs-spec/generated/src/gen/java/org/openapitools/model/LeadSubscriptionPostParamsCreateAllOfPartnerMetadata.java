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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 **/
@ApiModel(description = "Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.")
@JsonTypeName("LeadSubscriptionPostParamsCreate_allOf_partner_metadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LeadSubscriptionPostParamsCreateAllOfPartnerMetadata   {
  private String subscriberKey;

  public LeadSubscriptionPostParamsCreateAllOfPartnerMetadata() {
  }

  /**
   * Text field value that uniquely identifies a subscriber.
   **/
  public LeadSubscriptionPostParamsCreateAllOfPartnerMetadata subscriberKey(String subscriberKey) {
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
    LeadSubscriptionPostParamsCreateAllOfPartnerMetadata leadSubscriptionPostParamsCreateAllOfPartnerMetadata = (LeadSubscriptionPostParamsCreateAllOfPartnerMetadata) o;
    return Objects.equals(this.subscriberKey, leadSubscriptionPostParamsCreateAllOfPartnerMetadata.subscriberKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriberKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadSubscriptionPostParamsCreateAllOfPartnerMetadata {\n");
    
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

