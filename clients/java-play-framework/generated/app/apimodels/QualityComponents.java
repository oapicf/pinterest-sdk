package apimodels;

import apimodels.QualityComponentDetails;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Set of quality components, with each component containing a event coverage and details.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class QualityComponents   {
  @JsonProperty("advertiser_external_id")
  @Valid

  private Map<String, QualityComponentDetails> advertiserExternalId = null;

  @JsonProperty("click_id_epik")
  @Valid

  private Map<String, QualityComponentDetails> clickIdEpik = null;

  @JsonProperty("external_event_id")
  @Valid

  private Map<String, QualityComponentDetails> externalEventId = null;

  @JsonProperty("hashed_email")
  @Valid

  private Map<String, QualityComponentDetails> hashedEmail = null;

  @JsonProperty("hashed_maid")
  @Valid

  private Map<String, QualityComponentDetails> hashedMaid = null;

  @JsonProperty("ip_address")
  @Valid

  private Map<String, QualityComponentDetails> ipAddress = null;

  @JsonProperty("order_id")
  @Valid

  private Map<String, QualityComponentDetails> orderId = null;

  @JsonProperty("order_value")
  @Valid

  private Map<String, QualityComponentDetails> orderValue = null;

  @JsonProperty("product_id")
  @Valid

  private Map<String, QualityComponentDetails> productId = null;

  @JsonProperty("source_url")
  @Valid

  private Map<String, QualityComponentDetails> sourceUrl = null;

  @JsonProperty("user_agent")
  @Valid

  private Map<String, QualityComponentDetails> userAgent = null;

  public QualityComponents advertiserExternalId(Map<String, QualityComponentDetails> advertiserExternalId) {
    this.advertiserExternalId = advertiserExternalId;
    return this;
  }

  public QualityComponents putAdvertiserExternalIdItem(String key, QualityComponentDetails advertiserExternalIdItem) {
    if (this.advertiserExternalId == null) {
      this.advertiserExternalId = new HashMap<>();
    }
    this.advertiserExternalId.put(key, advertiserExternalIdItem);
    return this;
  }

   /**
   * Get advertiserExternalId
   * @return advertiserExternalId
  **/
  public Map<String, QualityComponentDetails> getAdvertiserExternalId() {
    return advertiserExternalId;
  }

  public void setAdvertiserExternalId(Map<String, QualityComponentDetails> advertiserExternalId) {
    this.advertiserExternalId = advertiserExternalId;
  }

  public QualityComponents clickIdEpik(Map<String, QualityComponentDetails> clickIdEpik) {
    this.clickIdEpik = clickIdEpik;
    return this;
  }

  public QualityComponents putClickIdEpikItem(String key, QualityComponentDetails clickIdEpikItem) {
    if (this.clickIdEpik == null) {
      this.clickIdEpik = new HashMap<>();
    }
    this.clickIdEpik.put(key, clickIdEpikItem);
    return this;
  }

   /**
   * Get clickIdEpik
   * @return clickIdEpik
  **/
  public Map<String, QualityComponentDetails> getClickIdEpik() {
    return clickIdEpik;
  }

  public void setClickIdEpik(Map<String, QualityComponentDetails> clickIdEpik) {
    this.clickIdEpik = clickIdEpik;
  }

  public QualityComponents externalEventId(Map<String, QualityComponentDetails> externalEventId) {
    this.externalEventId = externalEventId;
    return this;
  }

  public QualityComponents putExternalEventIdItem(String key, QualityComponentDetails externalEventIdItem) {
    if (this.externalEventId == null) {
      this.externalEventId = new HashMap<>();
    }
    this.externalEventId.put(key, externalEventIdItem);
    return this;
  }

   /**
   * Dedup components.
   * @return externalEventId
  **/
  public Map<String, QualityComponentDetails> getExternalEventId() {
    return externalEventId;
  }

  public void setExternalEventId(Map<String, QualityComponentDetails> externalEventId) {
    this.externalEventId = externalEventId;
  }

  public QualityComponents hashedEmail(Map<String, QualityComponentDetails> hashedEmail) {
    this.hashedEmail = hashedEmail;
    return this;
  }

  public QualityComponents putHashedEmailItem(String key, QualityComponentDetails hashedEmailItem) {
    if (this.hashedEmail == null) {
      this.hashedEmail = new HashMap<>();
    }
    this.hashedEmail.put(key, hashedEmailItem);
    return this;
  }

   /**
   * User matching identifiers.
   * @return hashedEmail
  **/
  public Map<String, QualityComponentDetails> getHashedEmail() {
    return hashedEmail;
  }

  public void setHashedEmail(Map<String, QualityComponentDetails> hashedEmail) {
    this.hashedEmail = hashedEmail;
  }

  public QualityComponents hashedMaid(Map<String, QualityComponentDetails> hashedMaid) {
    this.hashedMaid = hashedMaid;
    return this;
  }

  public QualityComponents putHashedMaidItem(String key, QualityComponentDetails hashedMaidItem) {
    if (this.hashedMaid == null) {
      this.hashedMaid = new HashMap<>();
    }
    this.hashedMaid.put(key, hashedMaidItem);
    return this;
  }

   /**
   * Get hashedMaid
   * @return hashedMaid
  **/
  public Map<String, QualityComponentDetails> getHashedMaid() {
    return hashedMaid;
  }

  public void setHashedMaid(Map<String, QualityComponentDetails> hashedMaid) {
    this.hashedMaid = hashedMaid;
  }

  public QualityComponents ipAddress(Map<String, QualityComponentDetails> ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  public QualityComponents putIpAddressItem(String key, QualityComponentDetails ipAddressItem) {
    if (this.ipAddress == null) {
      this.ipAddress = new HashMap<>();
    }
    this.ipAddress.put(key, ipAddressItem);
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  public Map<String, QualityComponentDetails> getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(Map<String, QualityComponentDetails> ipAddress) {
    this.ipAddress = ipAddress;
  }

  public QualityComponents orderId(Map<String, QualityComponentDetails> orderId) {
    this.orderId = orderId;
    return this;
  }

  public QualityComponents putOrderIdItem(String key, QualityComponentDetails orderIdItem) {
    if (this.orderId == null) {
      this.orderId = new HashMap<>();
    }
    this.orderId.put(key, orderIdItem);
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  public Map<String, QualityComponentDetails> getOrderId() {
    return orderId;
  }

  public void setOrderId(Map<String, QualityComponentDetails> orderId) {
    this.orderId = orderId;
  }

  public QualityComponents orderValue(Map<String, QualityComponentDetails> orderValue) {
    this.orderValue = orderValue;
    return this;
  }

  public QualityComponents putOrderValueItem(String key, QualityComponentDetails orderValueItem) {
    if (this.orderValue == null) {
      this.orderValue = new HashMap<>();
    }
    this.orderValue.put(key, orderValueItem);
    return this;
  }

   /**
   * Get orderValue
   * @return orderValue
  **/
  public Map<String, QualityComponentDetails> getOrderValue() {
    return orderValue;
  }

  public void setOrderValue(Map<String, QualityComponentDetails> orderValue) {
    this.orderValue = orderValue;
  }

  public QualityComponents productId(Map<String, QualityComponentDetails> productId) {
    this.productId = productId;
    return this;
  }

  public QualityComponents putProductIdItem(String key, QualityComponentDetails productIdItem) {
    if (this.productId == null) {
      this.productId = new HashMap<>();
    }
    this.productId.put(key, productIdItem);
    return this;
  }

   /**
   * Product/event metadata.
   * @return productId
  **/
  public Map<String, QualityComponentDetails> getProductId() {
    return productId;
  }

  public void setProductId(Map<String, QualityComponentDetails> productId) {
    this.productId = productId;
  }

  public QualityComponents sourceUrl(Map<String, QualityComponentDetails> sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

  public QualityComponents putSourceUrlItem(String key, QualityComponentDetails sourceUrlItem) {
    if (this.sourceUrl == null) {
      this.sourceUrl = new HashMap<>();
    }
    this.sourceUrl.put(key, sourceUrlItem);
    return this;
  }

   /**
   * Get sourceUrl
   * @return sourceUrl
  **/
  public Map<String, QualityComponentDetails> getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(Map<String, QualityComponentDetails> sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public QualityComponents userAgent(Map<String, QualityComponentDetails> userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  public QualityComponents putUserAgentItem(String key, QualityComponentDetails userAgentItem) {
    if (this.userAgent == null) {
      this.userAgent = new HashMap<>();
    }
    this.userAgent.put(key, userAgentItem);
    return this;
  }

   /**
   * Get userAgent
   * @return userAgent
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

