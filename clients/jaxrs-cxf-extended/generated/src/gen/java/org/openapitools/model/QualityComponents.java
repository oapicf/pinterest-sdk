package org.openapitools.model;

import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.QualityComponentDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Set of quality components, with each component containing a event coverage and details.
 */
@ApiModel(description="Set of quality components, with each component containing a event coverage and details.")

public class QualityComponents  {
  
  @ApiModelProperty(value = "")
  @Valid
  private Map<String, QualityComponentDetails> advertiserExternalId = new HashMap<>();

  @ApiModelProperty(value = "")
  @Valid
  private Map<String, QualityComponentDetails> clickIdEpik = new HashMap<>();

 /**
  * Dedup components.
  */
  @ApiModelProperty(value = "Dedup components.")
  @Valid
  private Map<String, QualityComponentDetails> externalEventId = new HashMap<>();

 /**
  * User matching identifiers.
  */
  @ApiModelProperty(value = "User matching identifiers.")
  @Valid
  private Map<String, QualityComponentDetails> hashedEmail = new HashMap<>();

  @ApiModelProperty(value = "")
  @Valid
  private Map<String, QualityComponentDetails> hashedMaid = new HashMap<>();

  @ApiModelProperty(value = "")
  @Valid
  private Map<String, QualityComponentDetails> ipAddress = new HashMap<>();

  @ApiModelProperty(value = "")
  @Valid
  private Map<String, QualityComponentDetails> orderId = new HashMap<>();

  @ApiModelProperty(value = "")
  @Valid
  private Map<String, QualityComponentDetails> orderValue = new HashMap<>();

 /**
  * Product/event metadata.
  */
  @ApiModelProperty(value = "Product/event metadata.")
  @Valid
  private Map<String, QualityComponentDetails> productId = new HashMap<>();

  @ApiModelProperty(value = "")
  @Valid
  private Map<String, QualityComponentDetails> sourceUrl = new HashMap<>();

  @ApiModelProperty(value = "")
  @Valid
  private Map<String, QualityComponentDetails> userAgent = new HashMap<>();
 /**
  * Get advertiserExternalId
  * @return advertiserExternalId
  */
  @JsonProperty("advertiser_external_id")
  public Map<String, QualityComponentDetails> getAdvertiserExternalId() {
    return advertiserExternalId;
  }

  /**
   * Sets the <code>advertiserExternalId</code> property.
   */
 public void setAdvertiserExternalId(Map<String, QualityComponentDetails> advertiserExternalId) {
    this.advertiserExternalId = advertiserExternalId;
  }

  /**
   * Sets the <code>advertiserExternalId</code> property.
   */
  public QualityComponents advertiserExternalId(Map<String, QualityComponentDetails> advertiserExternalId) {
    this.advertiserExternalId = advertiserExternalId;
    return this;
  }

  /**
   * Puts a new item into the <code>advertiserExternalId</code> map.
   */
  public QualityComponents putAdvertiserExternalIdItem(String key, QualityComponentDetails advertiserExternalIdItem) {
    this.advertiserExternalId.put(key, advertiserExternalIdItem);
    return this;
  }

 /**
  * Get clickIdEpik
  * @return clickIdEpik
  */
  @JsonProperty("click_id_epik")
  public Map<String, QualityComponentDetails> getClickIdEpik() {
    return clickIdEpik;
  }

  /**
   * Sets the <code>clickIdEpik</code> property.
   */
 public void setClickIdEpik(Map<String, QualityComponentDetails> clickIdEpik) {
    this.clickIdEpik = clickIdEpik;
  }

  /**
   * Sets the <code>clickIdEpik</code> property.
   */
  public QualityComponents clickIdEpik(Map<String, QualityComponentDetails> clickIdEpik) {
    this.clickIdEpik = clickIdEpik;
    return this;
  }

  /**
   * Puts a new item into the <code>clickIdEpik</code> map.
   */
  public QualityComponents putClickIdEpikItem(String key, QualityComponentDetails clickIdEpikItem) {
    this.clickIdEpik.put(key, clickIdEpikItem);
    return this;
  }

 /**
  * Dedup components.
  * @return externalEventId
  */
  @JsonProperty("external_event_id")
  public Map<String, QualityComponentDetails> getExternalEventId() {
    return externalEventId;
  }

  /**
   * Sets the <code>externalEventId</code> property.
   */
 public void setExternalEventId(Map<String, QualityComponentDetails> externalEventId) {
    this.externalEventId = externalEventId;
  }

  /**
   * Sets the <code>externalEventId</code> property.
   */
  public QualityComponents externalEventId(Map<String, QualityComponentDetails> externalEventId) {
    this.externalEventId = externalEventId;
    return this;
  }

  /**
   * Puts a new item into the <code>externalEventId</code> map.
   */
  public QualityComponents putExternalEventIdItem(String key, QualityComponentDetails externalEventIdItem) {
    this.externalEventId.put(key, externalEventIdItem);
    return this;
  }

 /**
  * User matching identifiers.
  * @return hashedEmail
  */
  @JsonProperty("hashed_email")
  public Map<String, QualityComponentDetails> getHashedEmail() {
    return hashedEmail;
  }

  /**
   * Sets the <code>hashedEmail</code> property.
   */
 public void setHashedEmail(Map<String, QualityComponentDetails> hashedEmail) {
    this.hashedEmail = hashedEmail;
  }

  /**
   * Sets the <code>hashedEmail</code> property.
   */
  public QualityComponents hashedEmail(Map<String, QualityComponentDetails> hashedEmail) {
    this.hashedEmail = hashedEmail;
    return this;
  }

  /**
   * Puts a new item into the <code>hashedEmail</code> map.
   */
  public QualityComponents putHashedEmailItem(String key, QualityComponentDetails hashedEmailItem) {
    this.hashedEmail.put(key, hashedEmailItem);
    return this;
  }

 /**
  * Get hashedMaid
  * @return hashedMaid
  */
  @JsonProperty("hashed_maid")
  public Map<String, QualityComponentDetails> getHashedMaid() {
    return hashedMaid;
  }

  /**
   * Sets the <code>hashedMaid</code> property.
   */
 public void setHashedMaid(Map<String, QualityComponentDetails> hashedMaid) {
    this.hashedMaid = hashedMaid;
  }

  /**
   * Sets the <code>hashedMaid</code> property.
   */
  public QualityComponents hashedMaid(Map<String, QualityComponentDetails> hashedMaid) {
    this.hashedMaid = hashedMaid;
    return this;
  }

  /**
   * Puts a new item into the <code>hashedMaid</code> map.
   */
  public QualityComponents putHashedMaidItem(String key, QualityComponentDetails hashedMaidItem) {
    this.hashedMaid.put(key, hashedMaidItem);
    return this;
  }

 /**
  * Get ipAddress
  * @return ipAddress
  */
  @JsonProperty("ip_address")
  public Map<String, QualityComponentDetails> getIpAddress() {
    return ipAddress;
  }

  /**
   * Sets the <code>ipAddress</code> property.
   */
 public void setIpAddress(Map<String, QualityComponentDetails> ipAddress) {
    this.ipAddress = ipAddress;
  }

  /**
   * Sets the <code>ipAddress</code> property.
   */
  public QualityComponents ipAddress(Map<String, QualityComponentDetails> ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Puts a new item into the <code>ipAddress</code> map.
   */
  public QualityComponents putIpAddressItem(String key, QualityComponentDetails ipAddressItem) {
    this.ipAddress.put(key, ipAddressItem);
    return this;
  }

 /**
  * Get orderId
  * @return orderId
  */
  @JsonProperty("order_id")
  public Map<String, QualityComponentDetails> getOrderId() {
    return orderId;
  }

  /**
   * Sets the <code>orderId</code> property.
   */
 public void setOrderId(Map<String, QualityComponentDetails> orderId) {
    this.orderId = orderId;
  }

  /**
   * Sets the <code>orderId</code> property.
   */
  public QualityComponents orderId(Map<String, QualityComponentDetails> orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Puts a new item into the <code>orderId</code> map.
   */
  public QualityComponents putOrderIdItem(String key, QualityComponentDetails orderIdItem) {
    this.orderId.put(key, orderIdItem);
    return this;
  }

 /**
  * Get orderValue
  * @return orderValue
  */
  @JsonProperty("order_value")
  public Map<String, QualityComponentDetails> getOrderValue() {
    return orderValue;
  }

  /**
   * Sets the <code>orderValue</code> property.
   */
 public void setOrderValue(Map<String, QualityComponentDetails> orderValue) {
    this.orderValue = orderValue;
  }

  /**
   * Sets the <code>orderValue</code> property.
   */
  public QualityComponents orderValue(Map<String, QualityComponentDetails> orderValue) {
    this.orderValue = orderValue;
    return this;
  }

  /**
   * Puts a new item into the <code>orderValue</code> map.
   */
  public QualityComponents putOrderValueItem(String key, QualityComponentDetails orderValueItem) {
    this.orderValue.put(key, orderValueItem);
    return this;
  }

 /**
  * Product/event metadata.
  * @return productId
  */
  @JsonProperty("product_id")
  public Map<String, QualityComponentDetails> getProductId() {
    return productId;
  }

  /**
   * Sets the <code>productId</code> property.
   */
 public void setProductId(Map<String, QualityComponentDetails> productId) {
    this.productId = productId;
  }

  /**
   * Sets the <code>productId</code> property.
   */
  public QualityComponents productId(Map<String, QualityComponentDetails> productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Puts a new item into the <code>productId</code> map.
   */
  public QualityComponents putProductIdItem(String key, QualityComponentDetails productIdItem) {
    this.productId.put(key, productIdItem);
    return this;
  }

 /**
  * Get sourceUrl
  * @return sourceUrl
  */
  @JsonProperty("source_url")
  public Map<String, QualityComponentDetails> getSourceUrl() {
    return sourceUrl;
  }

  /**
   * Sets the <code>sourceUrl</code> property.
   */
 public void setSourceUrl(Map<String, QualityComponentDetails> sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  /**
   * Sets the <code>sourceUrl</code> property.
   */
  public QualityComponents sourceUrl(Map<String, QualityComponentDetails> sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

  /**
   * Puts a new item into the <code>sourceUrl</code> map.
   */
  public QualityComponents putSourceUrlItem(String key, QualityComponentDetails sourceUrlItem) {
    this.sourceUrl.put(key, sourceUrlItem);
    return this;
  }

 /**
  * Get userAgent
  * @return userAgent
  */
  @JsonProperty("user_agent")
  public Map<String, QualityComponentDetails> getUserAgent() {
    return userAgent;
  }

  /**
   * Sets the <code>userAgent</code> property.
   */
 public void setUserAgent(Map<String, QualityComponentDetails> userAgent) {
    this.userAgent = userAgent;
  }

  /**
   * Sets the <code>userAgent</code> property.
   */
  public QualityComponents userAgent(Map<String, QualityComponentDetails> userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * Puts a new item into the <code>userAgent</code> map.
   */
  public QualityComponents putUserAgentItem(String key, QualityComponentDetails userAgentItem) {
    this.userAgent.put(key, userAgentItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

