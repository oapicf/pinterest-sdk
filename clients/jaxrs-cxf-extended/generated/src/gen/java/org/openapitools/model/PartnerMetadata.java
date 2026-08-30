package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PartnerMetadata  {
  
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
  public PartnerMetadata subscriberKey(String subscriberKey) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

