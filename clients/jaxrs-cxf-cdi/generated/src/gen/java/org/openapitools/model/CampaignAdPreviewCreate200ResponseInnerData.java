package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignAdPreview;
import org.openapitools.model.CampaignAdPreviewCreate200ResponseInnerDataOneOf;
import org.openapitools.model.PinterestLibError;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Created/updated resource on success or error details on failure
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Created/updated resource on success or error details on failure")
public class CampaignAdPreviewCreate200ResponseInnerData   {
  
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

  private PinterestLibError exceptions;

  /**
   * Advertiser ID for this preview.
   **/
  public CampaignAdPreviewCreate200ResponseInnerData adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", required = true, value = "Advertiser ID for this preview.")
  @JsonProperty("ad_account_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }


  /**
   * Ad group ID to create a preview record for.
   **/
  public CampaignAdPreviewCreate200ResponseInnerData adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "1234567890", required = true, value = "Ad group ID to create a preview record for.")
  @JsonProperty("ad_group_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=18)  public String getAdGroupId() {
    return adGroupId;
  }
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }


  /**
   * Client ID that created preview.
   **/
  public CampaignAdPreviewCreate200ResponseInnerData clientId(Integer clientId) {
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
  public CampaignAdPreviewCreate200ResponseInnerData expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unix timestamp in milliseconds for preview expiration.")
  @JsonProperty("expires_at")
  @NotNull
  public Integer getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }


  /**
   * Whether preview link is active.
   **/
  public CampaignAdPreviewCreate200ResponseInnerData isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Whether preview link is active.")
  @JsonProperty("is_active")
  @NotNull
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  /**
   * Pin ID for pin promotion preview.
   **/
  public CampaignAdPreviewCreate200ResponseInnerData pinId(Integer pinId) {
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
  public CampaignAdPreviewCreate200ResponseInnerData pinPromotionId(Integer pinPromotionId) {
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
  public CampaignAdPreviewCreate200ResponseInnerData promotedProductGroupId(Integer promotedProductGroupId) {
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
  public CampaignAdPreviewCreate200ResponseInnerData url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(example = "https://ads.pinterest.com/web-ad-preview/748db198-bd61-4a6f-b756-996c034e8cbb/", required = true, value = "Campaign ad preview URL.")
  @JsonProperty("url")
  @NotNull
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * User ID that created preview.
   **/
  public CampaignAdPreviewCreate200ResponseInnerData userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "User ID that created preview.")
  @JsonProperty("user_id")
  @NotNull
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  /**
   * Pin promotion preview key.
   **/
  public CampaignAdPreviewCreate200ResponseInnerData uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Pin promotion preview key.")
  @JsonProperty("uuid")
  @NotNull
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  /**
   **/
  public CampaignAdPreviewCreate200ResponseInnerData exceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("exceptions")
  @NotNull
  public PinterestLibError getExceptions() {
    return exceptions;
  }
  public void setExceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

