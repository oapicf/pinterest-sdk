package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Campaign ad preview record.
 */
@ApiModel(description="Campaign ad preview record.")

public class CampaignAdPreview  {
  
 /**
  * Advertiser ID for this preview.
  */
  @ApiModelProperty(example = "549755885175", required = true, value = "Advertiser ID for this preview.")
  private String adAccountId;

 /**
  * Ad group ID to create a preview record for.
  */
  @ApiModelProperty(example = "1234567890", required = true, value = "Ad group ID to create a preview record for.")
  private String adGroupId;

 /**
  * Client ID that created preview.
  */
  @ApiModelProperty(value = "Client ID that created preview.")
  private Integer clientId;

 /**
  * Unix timestamp in milliseconds for preview expiration.
  */
  @ApiModelProperty(required = true, value = "Unix timestamp in milliseconds for preview expiration.")
  private Integer expiresAt;

 /**
  * Whether preview link is active.
  */
  @ApiModelProperty(required = true, value = "Whether preview link is active.")
  private Boolean isActive;

 /**
  * Pin ID for pin promotion preview.
  */
  @ApiModelProperty(value = "Pin ID for pin promotion preview.")
  private Integer pinId;

 /**
  * Pin promotion ID for this preview.
  */
  @ApiModelProperty(value = "Pin promotion ID for this preview.")
  private Integer pinPromotionId;

 /**
  * Promoted product group ID for catalog previews.
  */
  @ApiModelProperty(value = "Promoted product group ID for catalog previews.")
  private Integer promotedProductGroupId;

 /**
  * Campaign ad preview URL.
  */
  @ApiModelProperty(example = "https://ads.pinterest.com/web-ad-preview/748db198-bd61-4a6f-b756-996c034e8cbb/", required = true, value = "Campaign ad preview URL.")
  private String url;

 /**
  * User ID that created preview.
  */
  @ApiModelProperty(required = true, value = "User ID that created preview.")
  private Integer userId;

 /**
  * Pin promotion preview key.
  */
  @ApiModelProperty(required = true, value = "Pin promotion preview key.")
  private String uuid;
 /**
  * Advertiser ID for this preview.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   * <br><em>N.B. <code>adAccountId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   * <br><em>N.B. <code>adAccountId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CampaignAdPreview adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * Ad group ID to create a preview record for.
  * @return adGroupId
  */
  @JsonProperty("ad_group_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=18)  public String getAdGroupId() {
    return adGroupId;
  }

  /**
   * Sets the <code>adGroupId</code> property.
   */
 public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * Sets the <code>adGroupId</code> property.
   */
  public CampaignAdPreview adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

 /**
  * Client ID that created preview.
  * @return clientId
  */
  @JsonProperty("client_id")
  public Integer getClientId() {
    return clientId;
  }

  /**
   * Sets the <code>clientId</code> property.
   * <br><em>N.B. <code>clientId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  /**
   * Sets the <code>clientId</code> property.
   * <br><em>N.B. <code>clientId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CampaignAdPreview clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

 /**
  * Unix timestamp in milliseconds for preview expiration.
  * @return expiresAt
  */
  @JsonProperty("expires_at")
  @NotNull
  public Integer getExpiresAt() {
    return expiresAt;
  }

  /**
   * Sets the <code>expiresAt</code> property.
   * <br><em>N.B. <code>expiresAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * Sets the <code>expiresAt</code> property.
   * <br><em>N.B. <code>expiresAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CampaignAdPreview expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

 /**
  * Whether preview link is active.
  * @return isActive
  */
  @JsonProperty("is_active")
  @NotNull
  public Boolean getIsActive() {
    return isActive;
  }

  /**
   * Sets the <code>isActive</code> property.
   * <br><em>N.B. <code>isActive</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  /**
   * Sets the <code>isActive</code> property.
   * <br><em>N.B. <code>isActive</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CampaignAdPreview isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

 /**
  * Pin ID for pin promotion preview.
  * @return pinId
  */
  @JsonProperty("pin_id")
  public Integer getPinId() {
    return pinId;
  }

  /**
   * Sets the <code>pinId</code> property.
   * <br><em>N.B. <code>pinId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setPinId(Integer pinId) {
    this.pinId = pinId;
  }

  /**
   * Sets the <code>pinId</code> property.
   * <br><em>N.B. <code>pinId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CampaignAdPreview pinId(Integer pinId) {
    this.pinId = pinId;
    return this;
  }

 /**
  * Pin promotion ID for this preview.
  * @return pinPromotionId
  */
  @JsonProperty("pin_promotion_id")
  public Integer getPinPromotionId() {
    return pinPromotionId;
  }

  /**
   * Sets the <code>pinPromotionId</code> property.
   * <br><em>N.B. <code>pinPromotionId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setPinPromotionId(Integer pinPromotionId) {
    this.pinPromotionId = pinPromotionId;
  }

  /**
   * Sets the <code>pinPromotionId</code> property.
   * <br><em>N.B. <code>pinPromotionId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CampaignAdPreview pinPromotionId(Integer pinPromotionId) {
    this.pinPromotionId = pinPromotionId;
    return this;
  }

 /**
  * Promoted product group ID for catalog previews.
  * @return promotedProductGroupId
  */
  @JsonProperty("promoted_product_group_id")
  public Integer getPromotedProductGroupId() {
    return promotedProductGroupId;
  }

  /**
   * Sets the <code>promotedProductGroupId</code> property.
   * <br><em>N.B. <code>promotedProductGroupId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setPromotedProductGroupId(Integer promotedProductGroupId) {
    this.promotedProductGroupId = promotedProductGroupId;
  }

  /**
   * Sets the <code>promotedProductGroupId</code> property.
   * <br><em>N.B. <code>promotedProductGroupId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CampaignAdPreview promotedProductGroupId(Integer promotedProductGroupId) {
    this.promotedProductGroupId = promotedProductGroupId;
    return this;
  }

 /**
  * Campaign ad preview URL.
  * @return url
  */
  @JsonProperty("url")
  @NotNull
  public String getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   * <br><em>N.B. <code>url</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   * <br><em>N.B. <code>url</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CampaignAdPreview url(String url) {
    this.url = url;
    return this;
  }

 /**
  * User ID that created preview.
  * @return userId
  */
  @JsonProperty("user_id")
  @NotNull
  public Integer getUserId() {
    return userId;
  }

  /**
   * Sets the <code>userId</code> property.
   * <br><em>N.B. <code>userId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * Sets the <code>userId</code> property.
   * <br><em>N.B. <code>userId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CampaignAdPreview userId(Integer userId) {
    this.userId = userId;
    return this;
  }

 /**
  * Pin promotion preview key.
  * @return uuid
  */
  @JsonProperty("uuid")
  @NotNull
  public String getUuid() {
    return uuid;
  }

  /**
   * Sets the <code>uuid</code> property.
   * <br><em>N.B. <code>uuid</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * Sets the <code>uuid</code> property.
   * <br><em>N.B. <code>uuid</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CampaignAdPreview uuid(String uuid) {
    this.uuid = uuid;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

