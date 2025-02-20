/*
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

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 */
@Schema(name = "AdAccountCreateSubscriptionRequest_partner_metadata", description = "Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.")
@JsonPropertyOrder({
  AdAccountCreateSubscriptionRequestPartnerMetadata.JSON_PROPERTY_SUBSCRIBER_KEY
})
@JsonTypeName("AdAccountCreateSubscriptionRequest_partner_metadata")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-05T02:03:37.829873561Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class AdAccountCreateSubscriptionRequestPartnerMetadata {
    public static final String JSON_PROPERTY_SUBSCRIBER_KEY = "subscriber_key";
    private String subscriberKey;

    public AdAccountCreateSubscriptionRequestPartnerMetadata() {
    }

    public AdAccountCreateSubscriptionRequestPartnerMetadata subscriberKey(String subscriberKey) {
        this.subscriberKey = subscriberKey;
        return this;
    }

    /**
     * Text field value that uniquely identifies a subscriber.
     * @return subscriberKey
     */
    @Nullable
    @Schema(name = "subscriber_key", description = "Text field value that uniquely identifies a subscriber.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_SUBSCRIBER_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSubscriberKey() {
        return subscriberKey;
    }

    @JsonProperty(JSON_PROPERTY_SUBSCRIBER_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

