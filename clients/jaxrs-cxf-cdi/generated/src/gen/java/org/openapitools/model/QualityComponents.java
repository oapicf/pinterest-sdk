package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.QualityComponentDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Set of quality components, with each component containing a event coverage and details.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Set of quality components, with each component containing a event coverage and details.")
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

  /**
   **/
  public QualityComponents advertiserExternalId(Map<String, QualityComponentDetails> advertiserExternalId) {
    this.advertiserExternalId = advertiserExternalId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("advertiser_external_id")
  public Map<String, QualityComponentDetails> getAdvertiserExternalId() {
    return advertiserExternalId;
  }
  public void setAdvertiserExternalId(Map<String, QualityComponentDetails> advertiserExternalId) {
    this.advertiserExternalId = advertiserExternalId;
  }


  public QualityComponents putAdvertiserExternalIdItem(String key, QualityComponentDetails advertiserExternalIdItem) {
    if (this.advertiserExternalId == null) {
      this.advertiserExternalId = new HashMap<>();
    }
    this.advertiserExternalId.put(key, advertiserExternalIdItem);
    return this;
  }

  /**
   **/
  public QualityComponents clickIdEpik(Map<String, QualityComponentDetails> clickIdEpik) {
    this.clickIdEpik = clickIdEpik;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("click_id_epik")
  public Map<String, QualityComponentDetails> getClickIdEpik() {
    return clickIdEpik;
  }
  public void setClickIdEpik(Map<String, QualityComponentDetails> clickIdEpik) {
    this.clickIdEpik = clickIdEpik;
  }


  public QualityComponents putClickIdEpikItem(String key, QualityComponentDetails clickIdEpikItem) {
    if (this.clickIdEpik == null) {
      this.clickIdEpik = new HashMap<>();
    }
    this.clickIdEpik.put(key, clickIdEpikItem);
    return this;
  }

  /**
   * Dedup components.
   **/
  public QualityComponents externalEventId(Map<String, QualityComponentDetails> externalEventId) {
    this.externalEventId = externalEventId;
    return this;
  }

  
  @ApiModelProperty(value = "Dedup components.")
  @JsonProperty("external_event_id")
  public Map<String, QualityComponentDetails> getExternalEventId() {
    return externalEventId;
  }
  public void setExternalEventId(Map<String, QualityComponentDetails> externalEventId) {
    this.externalEventId = externalEventId;
  }


  public QualityComponents putExternalEventIdItem(String key, QualityComponentDetails externalEventIdItem) {
    if (this.externalEventId == null) {
      this.externalEventId = new HashMap<>();
    }
    this.externalEventId.put(key, externalEventIdItem);
    return this;
  }

  /**
   * User matching identifiers.
   **/
  public QualityComponents hashedEmail(Map<String, QualityComponentDetails> hashedEmail) {
    this.hashedEmail = hashedEmail;
    return this;
  }

  
  @ApiModelProperty(value = "User matching identifiers.")
  @JsonProperty("hashed_email")
  public Map<String, QualityComponentDetails> getHashedEmail() {
    return hashedEmail;
  }
  public void setHashedEmail(Map<String, QualityComponentDetails> hashedEmail) {
    this.hashedEmail = hashedEmail;
  }


  public QualityComponents putHashedEmailItem(String key, QualityComponentDetails hashedEmailItem) {
    if (this.hashedEmail == null) {
      this.hashedEmail = new HashMap<>();
    }
    this.hashedEmail.put(key, hashedEmailItem);
    return this;
  }

  /**
   **/
  public QualityComponents hashedMaid(Map<String, QualityComponentDetails> hashedMaid) {
    this.hashedMaid = hashedMaid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hashed_maid")
  public Map<String, QualityComponentDetails> getHashedMaid() {
    return hashedMaid;
  }
  public void setHashedMaid(Map<String, QualityComponentDetails> hashedMaid) {
    this.hashedMaid = hashedMaid;
  }


  public QualityComponents putHashedMaidItem(String key, QualityComponentDetails hashedMaidItem) {
    if (this.hashedMaid == null) {
      this.hashedMaid = new HashMap<>();
    }
    this.hashedMaid.put(key, hashedMaidItem);
    return this;
  }

  /**
   **/
  public QualityComponents ipAddress(Map<String, QualityComponentDetails> ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ip_address")
  public Map<String, QualityComponentDetails> getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(Map<String, QualityComponentDetails> ipAddress) {
    this.ipAddress = ipAddress;
  }


  public QualityComponents putIpAddressItem(String key, QualityComponentDetails ipAddressItem) {
    if (this.ipAddress == null) {
      this.ipAddress = new HashMap<>();
    }
    this.ipAddress.put(key, ipAddressItem);
    return this;
  }

  /**
   **/
  public QualityComponents orderId(Map<String, QualityComponentDetails> orderId) {
    this.orderId = orderId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("order_id")
  public Map<String, QualityComponentDetails> getOrderId() {
    return orderId;
  }
  public void setOrderId(Map<String, QualityComponentDetails> orderId) {
    this.orderId = orderId;
  }


  public QualityComponents putOrderIdItem(String key, QualityComponentDetails orderIdItem) {
    if (this.orderId == null) {
      this.orderId = new HashMap<>();
    }
    this.orderId.put(key, orderIdItem);
    return this;
  }

  /**
   **/
  public QualityComponents orderValue(Map<String, QualityComponentDetails> orderValue) {
    this.orderValue = orderValue;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("order_value")
  public Map<String, QualityComponentDetails> getOrderValue() {
    return orderValue;
  }
  public void setOrderValue(Map<String, QualityComponentDetails> orderValue) {
    this.orderValue = orderValue;
  }


  public QualityComponents putOrderValueItem(String key, QualityComponentDetails orderValueItem) {
    if (this.orderValue == null) {
      this.orderValue = new HashMap<>();
    }
    this.orderValue.put(key, orderValueItem);
    return this;
  }

  /**
   * Product/event metadata.
   **/
  public QualityComponents productId(Map<String, QualityComponentDetails> productId) {
    this.productId = productId;
    return this;
  }

  
  @ApiModelProperty(value = "Product/event metadata.")
  @JsonProperty("product_id")
  public Map<String, QualityComponentDetails> getProductId() {
    return productId;
  }
  public void setProductId(Map<String, QualityComponentDetails> productId) {
    this.productId = productId;
  }


  public QualityComponents putProductIdItem(String key, QualityComponentDetails productIdItem) {
    if (this.productId == null) {
      this.productId = new HashMap<>();
    }
    this.productId.put(key, productIdItem);
    return this;
  }

  /**
   **/
  public QualityComponents sourceUrl(Map<String, QualityComponentDetails> sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("source_url")
  public Map<String, QualityComponentDetails> getSourceUrl() {
    return sourceUrl;
  }
  public void setSourceUrl(Map<String, QualityComponentDetails> sourceUrl) {
    this.sourceUrl = sourceUrl;
  }


  public QualityComponents putSourceUrlItem(String key, QualityComponentDetails sourceUrlItem) {
    if (this.sourceUrl == null) {
      this.sourceUrl = new HashMap<>();
    }
    this.sourceUrl.put(key, sourceUrlItem);
    return this;
  }

  /**
   **/
  public QualityComponents userAgent(Map<String, QualityComponentDetails> userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user_agent")
  public Map<String, QualityComponentDetails> getUserAgent() {
    return userAgent;
  }
  public void setUserAgent(Map<String, QualityComponentDetails> userAgent) {
    this.userAgent = userAgent;
  }


  public QualityComponents putUserAgentItem(String key, QualityComponentDetails userAgentItem) {
    if (this.userAgent == null) {
      this.userAgent = new HashMap<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

