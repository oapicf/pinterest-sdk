package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdAccountCreateSubscriptionRequestPartnerMetadata   {
  @JsonProperty("subscriber_key")
  
  private String subscriberKey;

  public AdAccountCreateSubscriptionRequestPartnerMetadata subscriberKey(String subscriberKey) {
    this.subscriberKey = subscriberKey;
    return this;
  }

   /**
   * Text field value that uniquely identifies a subscriber.
   * @return subscriberKey
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

