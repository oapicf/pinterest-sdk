package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.QualityComponentDetails;
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
 * Set of quality components, with each component containing a event coverage and details.
 **/
@ApiModel(description = "Set of quality components, with each component containing a event coverage and details.")
@JsonTypeName("QualityComponents")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-03T06:16:03.582968295Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class QualityComponents   {
  private Map<String, @Valid QualityComponentDetails> advertiserExternalId = new HashMap<>();
  private Map<String, @Valid QualityComponentDetails> clickIdEpik = new HashMap<>();
  private Map<String, @Valid QualityComponentDetails> externalEventId = new HashMap<>();
  private Map<String, @Valid QualityComponentDetails> hashedEmail = new HashMap<>();
  private Map<String, @Valid QualityComponentDetails> hashedMaid = new HashMap<>();
  private Map<String, @Valid QualityComponentDetails> ipAddress = new HashMap<>();
  private Map<String, @Valid QualityComponentDetails> orderId = new HashMap<>();
  private Map<String, @Valid QualityComponentDetails> orderValue = new HashMap<>();
  private Map<String, @Valid QualityComponentDetails> productId = new HashMap<>();
  private Map<String, @Valid QualityComponentDetails> sourceUrl = new HashMap<>();
  private Map<String, @Valid QualityComponentDetails> userAgent = new HashMap<>();

  public QualityComponents() {
  }

  /**
   **/
  public QualityComponents advertiserExternalId(Map<String, @Valid QualityComponentDetails> advertiserExternalId) {
    this.advertiserExternalId = advertiserExternalId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("advertiser_external_id")
  public Map<String, @Valid QualityComponentDetails> getAdvertiserExternalId() {
    return advertiserExternalId;
  }

  @JsonProperty("advertiser_external_id")
  public void setAdvertiserExternalId(Map<String, @Valid QualityComponentDetails> advertiserExternalId) {
    this.advertiserExternalId = advertiserExternalId;
  }

  public QualityComponents putAdvertiserExternalIdItem(String key, QualityComponentDetails advertiserExternalIdItem) {
    if (this.advertiserExternalId == null) {
      this.advertiserExternalId = new HashMap<>();
    }

    this.advertiserExternalId.put(key, advertiserExternalIdItem);
    return this;
  }

  public QualityComponents removeAdvertiserExternalIdItem(String key) {
    if (this.advertiserExternalId != null) {
      this.advertiserExternalId.remove(key);
    }

    return this;
  }
  /**
   **/
  public QualityComponents clickIdEpik(Map<String, @Valid QualityComponentDetails> clickIdEpik) {
    this.clickIdEpik = clickIdEpik;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("click_id_epik")
  public Map<String, @Valid QualityComponentDetails> getClickIdEpik() {
    return clickIdEpik;
  }

  @JsonProperty("click_id_epik")
  public void setClickIdEpik(Map<String, @Valid QualityComponentDetails> clickIdEpik) {
    this.clickIdEpik = clickIdEpik;
  }

  public QualityComponents putClickIdEpikItem(String key, QualityComponentDetails clickIdEpikItem) {
    if (this.clickIdEpik == null) {
      this.clickIdEpik = new HashMap<>();
    }

    this.clickIdEpik.put(key, clickIdEpikItem);
    return this;
  }

  public QualityComponents removeClickIdEpikItem(String key) {
    if (this.clickIdEpik != null) {
      this.clickIdEpik.remove(key);
    }

    return this;
  }
  /**
   * Dedup components.
   **/
  public QualityComponents externalEventId(Map<String, @Valid QualityComponentDetails> externalEventId) {
    this.externalEventId = externalEventId;
    return this;
  }

  
  @ApiModelProperty(value = "Dedup components.")
  @JsonProperty("external_event_id")
  public Map<String, @Valid QualityComponentDetails> getExternalEventId() {
    return externalEventId;
  }

  @JsonProperty("external_event_id")
  public void setExternalEventId(Map<String, @Valid QualityComponentDetails> externalEventId) {
    this.externalEventId = externalEventId;
  }

  public QualityComponents putExternalEventIdItem(String key, QualityComponentDetails externalEventIdItem) {
    if (this.externalEventId == null) {
      this.externalEventId = new HashMap<>();
    }

    this.externalEventId.put(key, externalEventIdItem);
    return this;
  }

  public QualityComponents removeExternalEventIdItem(String key) {
    if (this.externalEventId != null) {
      this.externalEventId.remove(key);
    }

    return this;
  }
  /**
   * User matching identifiers.
   **/
  public QualityComponents hashedEmail(Map<String, @Valid QualityComponentDetails> hashedEmail) {
    this.hashedEmail = hashedEmail;
    return this;
  }

  
  @ApiModelProperty(value = "User matching identifiers.")
  @JsonProperty("hashed_email")
  public Map<String, @Valid QualityComponentDetails> getHashedEmail() {
    return hashedEmail;
  }

  @JsonProperty("hashed_email")
  public void setHashedEmail(Map<String, @Valid QualityComponentDetails> hashedEmail) {
    this.hashedEmail = hashedEmail;
  }

  public QualityComponents putHashedEmailItem(String key, QualityComponentDetails hashedEmailItem) {
    if (this.hashedEmail == null) {
      this.hashedEmail = new HashMap<>();
    }

    this.hashedEmail.put(key, hashedEmailItem);
    return this;
  }

  public QualityComponents removeHashedEmailItem(String key) {
    if (this.hashedEmail != null) {
      this.hashedEmail.remove(key);
    }

    return this;
  }
  /**
   **/
  public QualityComponents hashedMaid(Map<String, @Valid QualityComponentDetails> hashedMaid) {
    this.hashedMaid = hashedMaid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hashed_maid")
  public Map<String, @Valid QualityComponentDetails> getHashedMaid() {
    return hashedMaid;
  }

  @JsonProperty("hashed_maid")
  public void setHashedMaid(Map<String, @Valid QualityComponentDetails> hashedMaid) {
    this.hashedMaid = hashedMaid;
  }

  public QualityComponents putHashedMaidItem(String key, QualityComponentDetails hashedMaidItem) {
    if (this.hashedMaid == null) {
      this.hashedMaid = new HashMap<>();
    }

    this.hashedMaid.put(key, hashedMaidItem);
    return this;
  }

  public QualityComponents removeHashedMaidItem(String key) {
    if (this.hashedMaid != null) {
      this.hashedMaid.remove(key);
    }

    return this;
  }
  /**
   **/
  public QualityComponents ipAddress(Map<String, @Valid QualityComponentDetails> ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ip_address")
  public Map<String, @Valid QualityComponentDetails> getIpAddress() {
    return ipAddress;
  }

  @JsonProperty("ip_address")
  public void setIpAddress(Map<String, @Valid QualityComponentDetails> ipAddress) {
    this.ipAddress = ipAddress;
  }

  public QualityComponents putIpAddressItem(String key, QualityComponentDetails ipAddressItem) {
    if (this.ipAddress == null) {
      this.ipAddress = new HashMap<>();
    }

    this.ipAddress.put(key, ipAddressItem);
    return this;
  }

  public QualityComponents removeIpAddressItem(String key) {
    if (this.ipAddress != null) {
      this.ipAddress.remove(key);
    }

    return this;
  }
  /**
   **/
  public QualityComponents orderId(Map<String, @Valid QualityComponentDetails> orderId) {
    this.orderId = orderId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("order_id")
  public Map<String, @Valid QualityComponentDetails> getOrderId() {
    return orderId;
  }

  @JsonProperty("order_id")
  public void setOrderId(Map<String, @Valid QualityComponentDetails> orderId) {
    this.orderId = orderId;
  }

  public QualityComponents putOrderIdItem(String key, QualityComponentDetails orderIdItem) {
    if (this.orderId == null) {
      this.orderId = new HashMap<>();
    }

    this.orderId.put(key, orderIdItem);
    return this;
  }

  public QualityComponents removeOrderIdItem(String key) {
    if (this.orderId != null) {
      this.orderId.remove(key);
    }

    return this;
  }
  /**
   **/
  public QualityComponents orderValue(Map<String, @Valid QualityComponentDetails> orderValue) {
    this.orderValue = orderValue;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("order_value")
  public Map<String, @Valid QualityComponentDetails> getOrderValue() {
    return orderValue;
  }

  @JsonProperty("order_value")
  public void setOrderValue(Map<String, @Valid QualityComponentDetails> orderValue) {
    this.orderValue = orderValue;
  }

  public QualityComponents putOrderValueItem(String key, QualityComponentDetails orderValueItem) {
    if (this.orderValue == null) {
      this.orderValue = new HashMap<>();
    }

    this.orderValue.put(key, orderValueItem);
    return this;
  }

  public QualityComponents removeOrderValueItem(String key) {
    if (this.orderValue != null) {
      this.orderValue.remove(key);
    }

    return this;
  }
  /**
   * Product/event metadata.
   **/
  public QualityComponents productId(Map<String, @Valid QualityComponentDetails> productId) {
    this.productId = productId;
    return this;
  }

  
  @ApiModelProperty(value = "Product/event metadata.")
  @JsonProperty("product_id")
  public Map<String, @Valid QualityComponentDetails> getProductId() {
    return productId;
  }

  @JsonProperty("product_id")
  public void setProductId(Map<String, @Valid QualityComponentDetails> productId) {
    this.productId = productId;
  }

  public QualityComponents putProductIdItem(String key, QualityComponentDetails productIdItem) {
    if (this.productId == null) {
      this.productId = new HashMap<>();
    }

    this.productId.put(key, productIdItem);
    return this;
  }

  public QualityComponents removeProductIdItem(String key) {
    if (this.productId != null) {
      this.productId.remove(key);
    }

    return this;
  }
  /**
   **/
  public QualityComponents sourceUrl(Map<String, @Valid QualityComponentDetails> sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("source_url")
  public Map<String, @Valid QualityComponentDetails> getSourceUrl() {
    return sourceUrl;
  }

  @JsonProperty("source_url")
  public void setSourceUrl(Map<String, @Valid QualityComponentDetails> sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public QualityComponents putSourceUrlItem(String key, QualityComponentDetails sourceUrlItem) {
    if (this.sourceUrl == null) {
      this.sourceUrl = new HashMap<>();
    }

    this.sourceUrl.put(key, sourceUrlItem);
    return this;
  }

  public QualityComponents removeSourceUrlItem(String key) {
    if (this.sourceUrl != null) {
      this.sourceUrl.remove(key);
    }

    return this;
  }
  /**
   **/
  public QualityComponents userAgent(Map<String, @Valid QualityComponentDetails> userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user_agent")
  public Map<String, @Valid QualityComponentDetails> getUserAgent() {
    return userAgent;
  }

  @JsonProperty("user_agent")
  public void setUserAgent(Map<String, @Valid QualityComponentDetails> userAgent) {
    this.userAgent = userAgent;
  }

  public QualityComponents putUserAgentItem(String key, QualityComponentDetails userAgentItem) {
    if (this.userAgent == null) {
      this.userAgent = new HashMap<>();
    }

    this.userAgent.put(key, userAgentItem);
    return this;
  }

  public QualityComponents removeUserAgentItem(String key) {
    if (this.userAgent != null) {
      this.userAgent.remove(key);
    }

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
    QualityComponents qualityComponents = (QualityComponents) o;
    return Objects.equals(this.advertiserExternalId, qualityComponents.advertiserExternalId) &&
        Objects.equals(this.clickIdEpik, qualityComponents.clickIdEpik) &&
        Objects.equals(this.externalEventId, qualityComponents.externalEventId) &&
        Objects.equals(this.hashedEmail, qualityComponents.hashedEmail) &&
        Objects.equals(this.hashedMaid, qualityComponents.hashedMaid) &&
        Objects.equals(this.ipAddress, qualityComponents.ipAddress) &&
        Objects.equals(this.orderId, qualityComponents.orderId) &&
        Objects.equals(this.orderValue, qualityComponents.orderValue) &&
        Objects.equals(this.productId, qualityComponents.productId) &&
        Objects.equals(this.sourceUrl, qualityComponents.sourceUrl) &&
        Objects.equals(this.userAgent, qualityComponents.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserExternalId, clickIdEpik, externalEventId, hashedEmail, hashedMaid, ipAddress, orderId, orderValue, productId, sourceUrl, userAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityComponents {\n");
    
    sb.append("    advertiserExternalId: ").append(toIndentedString(advertiserExternalId)).append("\n");
    sb.append("    clickIdEpik: ").append(toIndentedString(clickIdEpik)).append("\n");
    sb.append("    externalEventId: ").append(toIndentedString(externalEventId)).append("\n");
    sb.append("    hashedEmail: ").append(toIndentedString(hashedEmail)).append("\n");
    sb.append("    hashedMaid: ").append(toIndentedString(hashedMaid)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderValue: ").append(toIndentedString(orderValue)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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
