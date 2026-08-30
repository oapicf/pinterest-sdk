package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.CampaignAdPreview;
import org.openapitools.model.CampaignAdPreviewCreate200ResponseInnerDataOneOf;
import org.openapitools.model.PinterestLibError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Created/updated resource on success or error details on failure
 */
@ApiModel(description="Created/updated resource on success or error details on failure")

public class CampaignAdPreviewCreate200ResponseInnerData  {
  
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

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PinterestLibError exceptions;
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
  public CampaignAdPreviewCreate200ResponseInnerData adAccountId(String adAccountId) {
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
  public CampaignAdPreviewCreate200ResponseInnerData adGroupId(String adGroupId) {
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
  public CampaignAdPreviewCreate200ResponseInnerData clientId(Integer clientId) {
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
  public CampaignAdPreviewCreate200ResponseInnerData expiresAt(Integer expiresAt) {
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
  public CampaignAdPreviewCreate200ResponseInnerData isActive(Boolean isActive) {
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
  public CampaignAdPreviewCreate200ResponseInnerData pinId(Integer pinId) {
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
  public CampaignAdPreviewCreate200ResponseInnerData pinPromotionId(Integer pinPromotionId) {
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
  public CampaignAdPreviewCreate200ResponseInnerData promotedProductGroupId(Integer promotedProductGroupId) {
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
  public CampaignAdPreviewCreate200ResponseInnerData url(String url) {
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
  public CampaignAdPreviewCreate200ResponseInnerData userId(Integer userId) {
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
  public CampaignAdPreviewCreate200ResponseInnerData uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

 /**
  * Get exceptions
  * @return exceptions
  */
  @JsonProperty("exceptions")
  @NotNull
  public PinterestLibError getExceptions() {
    return exceptions;
  }

  /**
   * Sets the <code>exceptions</code> property.
   */
 public void setExceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
  }

  /**
   * Sets the <code>exceptions</code> property.
   */
  public CampaignAdPreviewCreate200ResponseInnerData exceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
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
    CampaignAdPreviewCreate200ResponseInnerData campaignAdPreviewCreate200ResponseInnerData = (CampaignAdPreviewCreate200ResponseInnerData) o;
    return Objects.equals(this.adAccountId, campaignAdPreviewCreate200ResponseInnerData.adAccountId) &&
        Objects.equals(this.adGroupId, campaignAdPreviewCreate200ResponseInnerData.adGroupId) &&
        Objects.equals(this.clientId, campaignAdPreviewCreate200ResponseInnerData.clientId) &&
        Objects.equals(this.expiresAt, campaignAdPreviewCreate200ResponseInnerData.expiresAt) &&
        Objects.equals(this.isActive, campaignAdPreviewCreate200ResponseInnerData.isActive) &&
        Objects.equals(this.pinId, campaignAdPreviewCreate200ResponseInnerData.pinId) &&
        Objects.equals(this.pinPromotionId, campaignAdPreviewCreate200ResponseInnerData.pinPromotionId) &&
        Objects.equals(this.promotedProductGroupId, campaignAdPreviewCreate200ResponseInnerData.promotedProductGroupId) &&
        Objects.equals(this.url, campaignAdPreviewCreate200ResponseInnerData.url) &&
        Objects.equals(this.userId, campaignAdPreviewCreate200ResponseInnerData.userId) &&
        Objects.equals(this.uuid, campaignAdPreviewCreate200ResponseInnerData.uuid) &&
        Objects.equals(this.exceptions, campaignAdPreviewCreate200ResponseInnerData.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, adGroupId, clientId, expiresAt, isActive, pinId, pinPromotionId, promotedProductGroupId, url, userId, uuid, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAdPreviewCreate200ResponseInnerData {\n");
    
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
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

