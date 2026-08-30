package org.openapitools.model;

import org.openapitools.model.QualityComponentDetails;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Set of quality components, with each component containing a event coverage and details.
 */
public class QualityComponents implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("advertiser_external_id")
  private Map<String, QualityComponentDetails> advertiserExternalId = new HashMap<>();

  @JsonProperty("click_id_epik")
  private Map<String, QualityComponentDetails> clickIdEpik = new HashMap<>();

  /**
   * Dedup components.
   */
  @JsonProperty("external_event_id")
  private Map<String, QualityComponentDetails> externalEventId = new HashMap<>();

  /**
   * User matching identifiers.
   */
  @JsonProperty("hashed_email")
  private Map<String, QualityComponentDetails> hashedEmail = new HashMap<>();

  @JsonProperty("hashed_maid")
  private Map<String, QualityComponentDetails> hashedMaid = new HashMap<>();

  @JsonProperty("ip_address")
  private Map<String, QualityComponentDetails> ipAddress = new HashMap<>();

  @JsonProperty("order_id")
  private Map<String, QualityComponentDetails> orderId = new HashMap<>();

  @JsonProperty("order_value")
  private Map<String, QualityComponentDetails> orderValue = new HashMap<>();

  /**
   * Product/event metadata.
   */
  @JsonProperty("product_id")
  private Map<String, QualityComponentDetails> productId = new HashMap<>();

  @JsonProperty("source_url")
  private Map<String, QualityComponentDetails> sourceUrl = new HashMap<>();

  @JsonProperty("user_agent")
  private Map<String, QualityComponentDetails> userAgent = new HashMap<>();

  /**
   * 
   * @return advertiserExternalId
   */
  public Map<String, QualityComponentDetails> getAdvertiserExternalId() {
    return advertiserExternalId;
  }

  public void setAdvertiserExternalId(Map<String, QualityComponentDetails> advertiserExternalId) {
    this.advertiserExternalId = advertiserExternalId;
  }

  /**
   * 
   * @return clickIdEpik
   */
  public Map<String, QualityComponentDetails> getClickIdEpik() {
    return clickIdEpik;
  }

  public void setClickIdEpik(Map<String, QualityComponentDetails> clickIdEpik) {
    this.clickIdEpik = clickIdEpik;
  }

  /**
   * Dedup components.
   * @return externalEventId
   */
  public Map<String, QualityComponentDetails> getExternalEventId() {
    return externalEventId;
  }

  public void setExternalEventId(Map<String, QualityComponentDetails> externalEventId) {
    this.externalEventId = externalEventId;
  }

  /**
   * User matching identifiers.
   * @return hashedEmail
   */
  public Map<String, QualityComponentDetails> getHashedEmail() {
    return hashedEmail;
  }

  public void setHashedEmail(Map<String, QualityComponentDetails> hashedEmail) {
    this.hashedEmail = hashedEmail;
  }

  /**
   * 
   * @return hashedMaid
   */
  public Map<String, QualityComponentDetails> getHashedMaid() {
    return hashedMaid;
  }

  public void setHashedMaid(Map<String, QualityComponentDetails> hashedMaid) {
    this.hashedMaid = hashedMaid;
  }

  /**
   * 
   * @return ipAddress
   */
  public Map<String, QualityComponentDetails> getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(Map<String, QualityComponentDetails> ipAddress) {
    this.ipAddress = ipAddress;
  }

  /**
   * 
   * @return orderId
   */
  public Map<String, QualityComponentDetails> getOrderId() {
    return orderId;
  }

  public void setOrderId(Map<String, QualityComponentDetails> orderId) {
    this.orderId = orderId;
  }

  /**
   * 
   * @return orderValue
   */
  public Map<String, QualityComponentDetails> getOrderValue() {
    return orderValue;
  }

  public void setOrderValue(Map<String, QualityComponentDetails> orderValue) {
    this.orderValue = orderValue;
  }

  /**
   * Product/event metadata.
   * @return productId
   */
  public Map<String, QualityComponentDetails> getProductId() {
    return productId;
  }

  public void setProductId(Map<String, QualityComponentDetails> productId) {
    this.productId = productId;
  }

  /**
   * 
   * @return sourceUrl
   */
  public Map<String, QualityComponentDetails> getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(Map<String, QualityComponentDetails> sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  /**
   * 
   * @return userAgent
   */
  public Map<String, QualityComponentDetails> getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(Map<String, QualityComponentDetails> userAgent) {
    this.userAgent = userAgent;
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
