package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Campaign ad preview record.
 */
@ApiModel(description = "Campaign ad preview record.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignAdPreview   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("ad_group_id")
  private String adGroupId;

  @JsonProperty("client_id")
  private Integer clientId;

  @JsonProperty("expires_at")
  private Integer expiresAt;

  @JsonProperty("is_active")
  private Boolean isActive;

  @JsonProperty("pin_id")
  private Integer pinId;

  @JsonProperty("pin_promotion_id")
  private Integer pinPromotionId;

  @JsonProperty("promoted_product_group_id")
  private Integer promotedProductGroupId;

  @JsonProperty("url")
  private String url;

  @JsonProperty("user_id")
  private Integer userId;

  @JsonProperty("uuid")
  private String uuid;

  public CampaignAdPreview adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Advertiser ID for this preview.
   * @return adAccountId
   */
  @ApiModelProperty(example = "549755885175", required = true, readOnly = true, value = "Advertiser ID for this preview.")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public CampaignAdPreview adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * Ad group ID to create a preview record for.
   * @return adGroupId
   */
  @ApiModelProperty(example = "1234567890", required = true, value = "Ad group ID to create a preview record for.")
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public CampaignAdPreview clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Client ID that created preview.
   * @return clientId
   */
  @ApiModelProperty(readOnly = true, value = "Client ID that created preview.")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public CampaignAdPreview expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Unix timestamp in milliseconds for preview expiration.
   * @return expiresAt
   */
  @ApiModelProperty(required = true, readOnly = true, value = "Unix timestamp in milliseconds for preview expiration.")
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  public CampaignAdPreview isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Whether preview link is active.
   * @return isActive
   */
  @ApiModelProperty(required = true, readOnly = true, value = "Whether preview link is active.")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public CampaignAdPreview pinId(Integer pinId) {
    this.pinId = pinId;
    return this;
  }

  /**
   * Pin ID for pin promotion preview.
   * @return pinId
   */
  @ApiModelProperty(readOnly = true, value = "Pin ID for pin promotion preview.")
  public Integer getPinId() {
    return pinId;
  }

  public void setPinId(Integer pinId) {
    this.pinId = pinId;
  }

  public CampaignAdPreview pinPromotionId(Integer pinPromotionId) {
    this.pinPromotionId = pinPromotionId;
    return this;
  }

  /**
   * Pin promotion ID for this preview.
   * @return pinPromotionId
   */
  @ApiModelProperty(readOnly = true, value = "Pin promotion ID for this preview.")
  public Integer getPinPromotionId() {
    return pinPromotionId;
  }

  public void setPinPromotionId(Integer pinPromotionId) {
    this.pinPromotionId = pinPromotionId;
  }

  public CampaignAdPreview promotedProductGroupId(Integer promotedProductGroupId) {
    this.promotedProductGroupId = promotedProductGroupId;
    return this;
  }

  /**
   * Promoted product group ID for catalog previews.
   * @return promotedProductGroupId
   */
  @ApiModelProperty(readOnly = true, value = "Promoted product group ID for catalog previews.")
  public Integer getPromotedProductGroupId() {
    return promotedProductGroupId;
  }

  public void setPromotedProductGroupId(Integer promotedProductGroupId) {
    this.promotedProductGroupId = promotedProductGroupId;
  }

  public CampaignAdPreview url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Campaign ad preview URL.
   * @return url
   */
  @ApiModelProperty(example = "https://ads.pinterest.com/web-ad-preview/748db198-bd61-4a6f-b756-996c034e8cbb/", required = true, readOnly = true, value = "Campaign ad preview URL.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CampaignAdPreview userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User ID that created preview.
   * @return userId
   */
  @ApiModelProperty(required = true, readOnly = true, value = "User ID that created preview.")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public CampaignAdPreview uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Pin promotion preview key.
   * @return uuid
   */
  @ApiModelProperty(required = true, readOnly = true, value = "Pin promotion preview key.")
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

