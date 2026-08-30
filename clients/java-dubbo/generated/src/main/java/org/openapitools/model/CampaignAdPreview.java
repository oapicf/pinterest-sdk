package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Campaign ad preview record.
 */
public class CampaignAdPreview implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Advertiser ID for this preview.
   */
  @JsonProperty("ad_account_id")
  private String adAccountId;

  /**
   * Ad group ID to create a preview record for.
   */
  @JsonProperty("ad_group_id")
  private String adGroupId;

  /**
   * Client ID that created preview.
   */
  @JsonProperty("client_id")
  private Integer clientId;

  /**
   * Unix timestamp in milliseconds for preview expiration.
   */
  @JsonProperty("expires_at")
  private Integer expiresAt;

  /**
   * Whether preview link is active.
   */
  @JsonProperty("is_active")
  private Boolean isActive;

  /**
   * Pin ID for pin promotion preview.
   */
  @JsonProperty("pin_id")
  private Integer pinId;

  /**
   * Pin promotion ID for this preview.
   */
  @JsonProperty("pin_promotion_id")
  private Integer pinPromotionId;

  /**
   * Promoted product group ID for catalog previews.
   */
  @JsonProperty("promoted_product_group_id")
  private Integer promotedProductGroupId;

  /**
   * Campaign ad preview URL.
   */
  @JsonProperty("url")
  private String url;

  /**
   * User ID that created preview.
   */
  @JsonProperty("user_id")
  private Integer userId;

  /**
   * Pin promotion preview key.
   */
  @JsonProperty("uuid")
  private String uuid;

  /**
   * Advertiser ID for this preview.
   * @return adAccountId
   */
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Ad group ID to create a preview record for.
   * @return adGroupId
   */
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * Client ID that created preview.
   * @return clientId
   */
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  /**
   * Unix timestamp in milliseconds for preview expiration.
   * @return expiresAt
   */
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * Whether preview link is active.
   * @return isActive
   */
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  /**
   * Pin ID for pin promotion preview.
   * @return pinId
   */
  public Integer getPinId() {
    return pinId;
  }

  public void setPinId(Integer pinId) {
    this.pinId = pinId;
  }

  /**
   * Pin promotion ID for this preview.
   * @return pinPromotionId
   */
  public Integer getPinPromotionId() {
    return pinPromotionId;
  }

  public void setPinPromotionId(Integer pinPromotionId) {
    this.pinPromotionId = pinPromotionId;
  }

  /**
   * Promoted product group ID for catalog previews.
   * @return promotedProductGroupId
   */
  public Integer getPromotedProductGroupId() {
    return promotedProductGroupId;
  }

  public void setPromotedProductGroupId(Integer promotedProductGroupId) {
    this.promotedProductGroupId = promotedProductGroupId;
  }

  /**
   * Campaign ad preview URL.
   * @return url
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * User ID that created preview.
   * @return userId
   */
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * Pin promotion preview key.
   * @return uuid
   */
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignAdPreview campaignAdPreview = (CampaignAdPreview) o;
    return Objects.equals(this.adAccountId, campaignAdPreview.adAccountId) &&
        Objects.equals(this.adGroupId, campaignAdPreview.adGroupId) &&
        Objects.equals(this.clientId, campaignAdPreview.clientId) &&
        Objects.equals(this.expiresAt, campaignAdPreview.expiresAt) &&
        Objects.equals(this.isActive, campaignAdPreview.isActive) &&
        Objects.equals(this.pinId, campaignAdPreview.pinId) &&
        Objects.equals(this.pinPromotionId, campaignAdPreview.pinPromotionId) &&
        Objects.equals(this.promotedProductGroupId, campaignAdPreview.promotedProductGroupId) &&
        Objects.equals(this.url, campaignAdPreview.url) &&
        Objects.equals(this.userId, campaignAdPreview.userId) &&
        Objects.equals(this.uuid, campaignAdPreview.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, adGroupId, clientId, expiresAt, isActive, pinId, pinPromotionId, promotedProductGroupId, url, userId, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAdPreview {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
    sb.append("    pinPromotionId: ").append(toIndentedString(pinPromotionId)).append("\n");
    sb.append("    promotedProductGroupId: ").append(toIndentedString(promotedProductGroupId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
