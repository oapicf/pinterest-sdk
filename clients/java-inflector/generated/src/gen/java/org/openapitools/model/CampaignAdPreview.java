package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Campaign ad preview record.
 **/

@ApiModel(description = "Campaign ad preview record.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  /**
   * Advertiser ID for this preview.
   **/
  public CampaignAdPreview adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", required = true, value = "Advertiser ID for this preview.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Ad group ID to create a preview record for.
   **/
  public CampaignAdPreview adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "1234567890", required = true, value = "Ad group ID to create a preview record for.")
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * Client ID that created preview.
   **/
  public CampaignAdPreview clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

  
  @ApiModelProperty(value = "Client ID that created preview.")
  @JsonProperty("client_id")
  public Integer getClientId() {
    return clientId;
  }
  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  /**
   * Unix timestamp in milliseconds for preview expiration.
   **/
  public CampaignAdPreview expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unix timestamp in milliseconds for preview expiration.")
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * Whether preview link is active.
   **/
  public CampaignAdPreview isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Whether preview link is active.")
  @JsonProperty("is_active")
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  /**
   * Pin ID for pin promotion preview.
   **/
  public CampaignAdPreview pinId(Integer pinId) {
    this.pinId = pinId;
    return this;
  }

  
  @ApiModelProperty(value = "Pin ID for pin promotion preview.")
  @JsonProperty("pin_id")
  public Integer getPinId() {
    return pinId;
  }
  public void setPinId(Integer pinId) {
    this.pinId = pinId;
  }

  /**
   * Pin promotion ID for this preview.
   **/
  public CampaignAdPreview pinPromotionId(Integer pinPromotionId) {
    this.pinPromotionId = pinPromotionId;
    return this;
  }

  
  @ApiModelProperty(value = "Pin promotion ID for this preview.")
  @JsonProperty("pin_promotion_id")
  public Integer getPinPromotionId() {
    return pinPromotionId;
  }
  public void setPinPromotionId(Integer pinPromotionId) {
    this.pinPromotionId = pinPromotionId;
  }

  /**
   * Promoted product group ID for catalog previews.
   **/
  public CampaignAdPreview promotedProductGroupId(Integer promotedProductGroupId) {
    this.promotedProductGroupId = promotedProductGroupId;
    return this;
  }

  
  @ApiModelProperty(value = "Promoted product group ID for catalog previews.")
  @JsonProperty("promoted_product_group_id")
  public Integer getPromotedProductGroupId() {
    return promotedProductGroupId;
  }
  public void setPromotedProductGroupId(Integer promotedProductGroupId) {
    this.promotedProductGroupId = promotedProductGroupId;
  }

  /**
   * Campaign ad preview URL.
   **/
  public CampaignAdPreview url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(example = "https://ads.pinterest.com/web-ad-preview/748db198-bd61-4a6f-b756-996c034e8cbb/", required = true, value = "Campaign ad preview URL.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * User ID that created preview.
   **/
  public CampaignAdPreview userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "User ID that created preview.")
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * Pin promotion preview key.
   **/
  public CampaignAdPreview uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Pin promotion preview key.")
  @JsonProperty("uuid")
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
    return Objects.equals(adAccountId, campaignAdPreview.adAccountId) &&
        Objects.equals(adGroupId, campaignAdPreview.adGroupId) &&
        Objects.equals(clientId, campaignAdPreview.clientId) &&
        Objects.equals(expiresAt, campaignAdPreview.expiresAt) &&
        Objects.equals(isActive, campaignAdPreview.isActive) &&
        Objects.equals(pinId, campaignAdPreview.pinId) &&
        Objects.equals(pinPromotionId, campaignAdPreview.pinPromotionId) &&
        Objects.equals(promotedProductGroupId, campaignAdPreview.promotedProductGroupId) &&
        Objects.equals(url, campaignAdPreview.url) &&
        Objects.equals(userId, campaignAdPreview.userId) &&
        Objects.equals(uuid, campaignAdPreview.uuid);
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

