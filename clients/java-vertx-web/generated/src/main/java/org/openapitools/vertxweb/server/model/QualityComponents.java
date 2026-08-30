package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.vertxweb.server.model.QualityComponentDetails;

/**
 * Set of quality components, with each component containing a event coverage and details.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QualityComponents   {
  
  private Map<String, QualityComponentDetails> advertiserExternalId = new HashMap<>();
  private Map<String, QualityComponentDetails> clickIdEpik = new HashMap<>();
  private Map<String, QualityComponentDetails> externalEventId = new HashMap<>();
  private Map<String, QualityComponentDetails> hashedEmail = new HashMap<>();
  private Map<String, QualityComponentDetails> hashedMaid = new HashMap<>();
  private Map<String, QualityComponentDetails> ipAddress = new HashMap<>();
  private Map<String, QualityComponentDetails> orderId = new HashMap<>();
  private Map<String, QualityComponentDetails> orderValue = new HashMap<>();
  private Map<String, QualityComponentDetails> productId = new HashMap<>();
  private Map<String, QualityComponentDetails> sourceUrl = new HashMap<>();
  private Map<String, QualityComponentDetails> userAgent = new HashMap<>();

  public QualityComponents () {

  }

  public QualityComponents (Map<String, QualityComponentDetails> advertiserExternalId, Map<String, QualityComponentDetails> clickIdEpik, Map<String, QualityComponentDetails> externalEventId, Map<String, QualityComponentDetails> hashedEmail, Map<String, QualityComponentDetails> hashedMaid, Map<String, QualityComponentDetails> ipAddress, Map<String, QualityComponentDetails> orderId, Map<String, QualityComponentDetails> orderValue, Map<String, QualityComponentDetails> productId, Map<String, QualityComponentDetails> sourceUrl, Map<String, QualityComponentDetails> userAgent) {
    this.advertiserExternalId = advertiserExternalId;
    this.clickIdEpik = clickIdEpik;
    this.externalEventId = externalEventId;
    this.hashedEmail = hashedEmail;
    this.hashedMaid = hashedMaid;
    this.ipAddress = ipAddress;
    this.orderId = orderId;
    this.orderValue = orderValue;
    this.productId = productId;
    this.sourceUrl = sourceUrl;
    this.userAgent = userAgent;
  }

    
  @JsonProperty("advertiser_external_id")
  public Map<String, QualityComponentDetails> getAdvertiserExternalId() {
    return advertiserExternalId;
  }
  public void setAdvertiserExternalId(Map<String, QualityComponentDetails> advertiserExternalId) {
    this.advertiserExternalId = advertiserExternalId;
  }

    
  @JsonProperty("click_id_epik")
  public Map<String, QualityComponentDetails> getClickIdEpik() {
    return clickIdEpik;
  }
  public void setClickIdEpik(Map<String, QualityComponentDetails> clickIdEpik) {
    this.clickIdEpik = clickIdEpik;
  }

    
  @JsonProperty("external_event_id")
  public Map<String, QualityComponentDetails> getExternalEventId() {
    return externalEventId;
  }
  public void setExternalEventId(Map<String, QualityComponentDetails> externalEventId) {
    this.externalEventId = externalEventId;
  }

    
  @JsonProperty("hashed_email")
  public Map<String, QualityComponentDetails> getHashedEmail() {
    return hashedEmail;
  }
  public void setHashedEmail(Map<String, QualityComponentDetails> hashedEmail) {
    this.hashedEmail = hashedEmail;
  }

    
  @JsonProperty("hashed_maid")
  public Map<String, QualityComponentDetails> getHashedMaid() {
    return hashedMaid;
  }
  public void setHashedMaid(Map<String, QualityComponentDetails> hashedMaid) {
    this.hashedMaid = hashedMaid;
  }

    
  @JsonProperty("ip_address")
  public Map<String, QualityComponentDetails> getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(Map<String, QualityComponentDetails> ipAddress) {
    this.ipAddress = ipAddress;
  }

    
  @JsonProperty("order_id")
  public Map<String, QualityComponentDetails> getOrderId() {
    return orderId;
  }
  public void setOrderId(Map<String, QualityComponentDetails> orderId) {
    this.orderId = orderId;
  }

    
  @JsonProperty("order_value")
  public Map<String, QualityComponentDetails> getOrderValue() {
    return orderValue;
  }
  public void setOrderValue(Map<String, QualityComponentDetails> orderValue) {
    this.orderValue = orderValue;
  }

    
  @JsonProperty("product_id")
  public Map<String, QualityComponentDetails> getProductId() {
    return productId;
  }
  public void setProductId(Map<String, QualityComponentDetails> productId) {
    this.productId = productId;
  }

    
  @JsonProperty("source_url")
  public Map<String, QualityComponentDetails> getSourceUrl() {
    return sourceUrl;
  }
  public void setSourceUrl(Map<String, QualityComponentDetails> sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

    
  @JsonProperty("user_agent")
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
    return Objects.equals(advertiserExternalId, qualityComponents.advertiserExternalId) &&
        Objects.equals(clickIdEpik, qualityComponents.clickIdEpik) &&
        Objects.equals(externalEventId, qualityComponents.externalEventId) &&
        Objects.equals(hashedEmail, qualityComponents.hashedEmail) &&
        Objects.equals(hashedMaid, qualityComponents.hashedMaid) &&
        Objects.equals(ipAddress, qualityComponents.ipAddress) &&
        Objects.equals(orderId, qualityComponents.orderId) &&
        Objects.equals(orderValue, qualityComponents.orderValue) &&
        Objects.equals(productId, qualityComponents.productId) &&
        Objects.equals(sourceUrl, qualityComponents.sourceUrl) &&
        Objects.equals(userAgent, qualityComponents.userAgent);
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
