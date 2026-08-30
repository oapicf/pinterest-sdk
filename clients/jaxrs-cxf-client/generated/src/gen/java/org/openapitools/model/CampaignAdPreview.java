package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
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
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }


 /**
   * Ad group ID to create a preview record for.
   * @return adGroupId
  **/
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public CampaignAdPreview adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

 /**
   * Client ID that created preview.
   * @return clientId
  **/
  @JsonProperty("client_id")
  public Integer getClientId() {
    return clientId;
  }


 /**
   * Unix timestamp in milliseconds for preview expiration.
   * @return expiresAt
  **/
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }


 /**
   * Whether preview link is active.
   * @return isActive
  **/
  @JsonProperty("is_active")
  public Boolean getIsActive() {
    return isActive;
  }


 /**
   * Pin ID for pin promotion preview.
   * @return pinId
  **/
  @JsonProperty("pin_id")
  public Integer getPinId() {
    return pinId;
  }


 /**
   * Pin promotion ID for this preview.
   * @return pinPromotionId
  **/
  @JsonProperty("pin_promotion_id")
  public Integer getPinPromotionId() {
    return pinPromotionId;
  }


 /**
   * Promoted product group ID for catalog previews.
   * @return promotedProductGroupId
  **/
  @JsonProperty("promoted_product_group_id")
  public Integer getPromotedProductGroupId() {
    return promotedProductGroupId;
  }


 /**
   * Campaign ad preview URL.
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }


 /**
   * User ID that created preview.
   * @return userId
  **/
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }


 /**
   * Pin promotion preview key.
   * @return uuid
  **/
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
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

