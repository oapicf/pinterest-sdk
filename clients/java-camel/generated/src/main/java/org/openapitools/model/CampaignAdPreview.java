package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Campaign ad preview record.
 */

@Schema(name = "CampaignAdPreview", description = "Campaign ad preview record.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignAdPreview implements CampaignAdPreviewCreate200ResponseInnerData {

  private String adAccountId;

  private String adGroupId;

  private Integer clientId;

  private Integer expiresAt;

  private Boolean isActive;

  private Integer pinId;

  private Integer pinPromotionId;

  private Integer promotedProductGroupId;

  private String url;

  private Integer userId;

  private String uuid;

  public CampaignAdPreview() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CampaignAdPreview(String adAccountId, String adGroupId, Integer expiresAt, Boolean isActive, String url, Integer userId, String uuid) {
    this.adAccountId = adAccountId;
    this.adGroupId = adGroupId;
    this.expiresAt = expiresAt;
    this.isActive = isActive;
    this.url = url;
    this.userId = userId;
    this.uuid = uuid;
  }

  public CampaignAdPreview adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Advertiser ID for this preview.
   * @return adAccountId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", accessMode = Schema.AccessMode.READ_ONLY, example = "549755885175", description = "Advertiser ID for this preview.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ad_account_id")
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
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 18) 
  @Schema(name = "ad_group_id", example = "1234567890", description = "Ad group ID to create a preview record for.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ad_group_id")
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
  
  @Schema(name = "client_id", accessMode = Schema.AccessMode.READ_ONLY, description = "Client ID that created preview.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("client_id")
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
  
  @Schema(name = "expires_at", accessMode = Schema.AccessMode.READ_ONLY, description = "Unix timestamp in milliseconds for preview expiration.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expires_at")
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
  
  @Schema(name = "is_active", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether preview link is active.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_active")
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
  
  @Schema(name = "pin_id", accessMode = Schema.AccessMode.READ_ONLY, description = "Pin ID for pin promotion preview.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pin_id")
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
  
  @Schema(name = "pin_promotion_id", accessMode = Schema.AccessMode.READ_ONLY, description = "Pin promotion ID for this preview.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pin_promotion_id")
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
  
  @Schema(name = "promoted_product_group_id", accessMode = Schema.AccessMode.READ_ONLY, description = "Promoted product group ID for catalog previews.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promoted_product_group_id")
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
  
  @Schema(name = "url", accessMode = Schema.AccessMode.READ_ONLY, example = "https://ads.pinterest.com/web-ad-preview/748db198-bd61-4a6f-b756-996c034e8cbb/", description = "Campaign ad preview URL.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
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
  
  @Schema(name = "user_id", accessMode = Schema.AccessMode.READ_ONLY, description = "User ID that created preview.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user_id")
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
  
  @Schema(name = "uuid", accessMode = Schema.AccessMode.READ_ONLY, description = "Pin promotion preview key.", requiredMode = Schema.RequiredMode.REQUIRED)
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

