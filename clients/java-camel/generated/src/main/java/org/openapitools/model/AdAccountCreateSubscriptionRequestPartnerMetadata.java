package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 */

@Schema(name = "AdAccountCreateSubscriptionRequest_partner_metadata", description = "Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.")
@JsonTypeName("AdAccountCreateSubscriptionRequest_partner_metadata")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdAccountCreateSubscriptionRequestPartnerMetadata {

  private String subscriberKey;

  public AdAccountCreateSubscriptionRequestPartnerMetadata subscriberKey(String subscriberKey) {
    this.subscriberKey = subscriberKey;
    return this;
  }

  /**
   * Text field value that uniquely identifies a subscriber.
   * @return subscriberKey
   */
  
  @Schema(name = "subscriber_key", description = "Text field value that uniquely identifies a subscriber.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

