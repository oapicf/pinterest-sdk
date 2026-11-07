package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.QualityComponentDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Set of quality components, with each component containing a event coverage and details.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-07T04:06:44.072323441Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("advertiser_external_id")
  public Map<String, @Valid QualityComponentDetails> getAdvertiserExternalId() {
    return advertiserExternalId;
  }
  public void setAdvertiserExternalId(Map<String, @Valid QualityComponentDetails> advertiserExternalId) {
    this.advertiserExternalId = advertiserExternalId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("click_id_epik")
  public Map<String, @Valid QualityComponentDetails> getClickIdEpik() {
    return clickIdEpik;
  }
  public void setClickIdEpik(Map<String, @Valid QualityComponentDetails> clickIdEpik) {
    this.clickIdEpik = clickIdEpik;
  }

  /**
   * Dedup components.
   **/
  
  @ApiModelProperty(value = "Dedup components.")
  @JsonProperty("external_event_id")
  public Map<String, @Valid QualityComponentDetails> getExternalEventId() {
    return externalEventId;
  }
  public void setExternalEventId(Map<String, @Valid QualityComponentDetails> externalEventId) {
    this.externalEventId = externalEventId;
  }

  /**
   * User matching identifiers.
   **/
  
  @ApiModelProperty(value = "User matching identifiers.")
  @JsonProperty("hashed_email")
  public Map<String, @Valid QualityComponentDetails> getHashedEmail() {
    return hashedEmail;
  }
  public void setHashedEmail(Map<String, @Valid QualityComponentDetails> hashedEmail) {
    this.hashedEmail = hashedEmail;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hashed_maid")
  public Map<String, @Valid QualityComponentDetails> getHashedMaid() {
    return hashedMaid;
  }
  public void setHashedMaid(Map<String, @Valid QualityComponentDetails> hashedMaid) {
    this.hashedMaid = hashedMaid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ip_address")
  public Map<String, @Valid QualityComponentDetails> getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(Map<String, @Valid QualityComponentDetails> ipAddress) {
    this.ipAddress = ipAddress;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("order_id")
  public Map<String, @Valid QualityComponentDetails> getOrderId() {
    return orderId;
  }
  public void setOrderId(Map<String, @Valid QualityComponentDetails> orderId) {
    this.orderId = orderId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("order_value")
  public Map<String, @Valid QualityComponentDetails> getOrderValue() {
    return orderValue;
  }
  public void setOrderValue(Map<String, @Valid QualityComponentDetails> orderValue) {
    this.orderValue = orderValue;
  }

  /**
   * Product/event metadata.
   **/
  
  @ApiModelProperty(value = "Product/event metadata.")
  @JsonProperty("product_id")
  public Map<String, @Valid QualityComponentDetails> getProductId() {
    return productId;
  }
  public void setProductId(Map<String, @Valid QualityComponentDetails> productId) {
    this.productId = productId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("source_url")
  public Map<String, @Valid QualityComponentDetails> getSourceUrl() {
    return sourceUrl;
  }
  public void setSourceUrl(Map<String, @Valid QualityComponentDetails> sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("user_agent")
  public Map<String, @Valid QualityComponentDetails> getUserAgent() {
    return userAgent;
  }
  public void setUserAgent(Map<String, @Valid QualityComponentDetails> userAgent) {
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

