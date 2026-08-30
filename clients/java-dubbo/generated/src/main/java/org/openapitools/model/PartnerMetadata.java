package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class PartnerMetadata implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Text field value that uniquely identifies a subscriber.
   */
  @JsonProperty("subscriber_key")
  private String subscriberKey;

  /**
   * Text field value that uniquely identifies a subscriber.
   * @return subscriberKey
   */
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
    PartnerMetadata partnerMetadata = (PartnerMetadata) o;
    return Objects.equals(this.subscriberKey, partnerMetadata.subscriberKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriberKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerMetadata {\n");
    
    sb.append("    subscriberKey: ").append(toIndentedString(subscriberKey)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
