package apimodels;

import apimodels.CampaignAdPreview;
import apimodels.CampaignAdPreviewCreate200ResponseInnerDataOneOf;
import apimodels.PinterestLibError;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Created/updated resource on success or error details on failure
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignAdPreviewCreate200ResponseInnerData   {
  @JsonProperty("ad_account_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String adAccountId;

  @JsonProperty("ad_group_id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=18)

  private String adGroupId;

  @JsonProperty("client_id")
  
  private Integer clientId;

  @JsonProperty("expires_at")
  @NotNull

  private Integer expiresAt;

  @JsonProperty("is_active")
  @NotNull

  private Boolean isActive;

  @JsonProperty("pin_id")
  
  private Integer pinId;

  @JsonProperty("pin_promotion_id")
  
  private Integer pinPromotionId;

  @JsonProperty("promoted_product_group_id")
  
  private Integer promotedProductGroupId;

  @JsonProperty("url")
  @NotNull

  private String url;

  @JsonProperty("user_id")
  @NotNull

  private Integer userId;

  @JsonProperty("uuid")
  @NotNull

  private String uuid;

  @JsonProperty("exceptions")
  @NotNull
@Valid

  private PinterestLibError exceptions;

  public CampaignAdPreviewCreate200ResponseInnerData adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * Advertiser ID for this preview.
   * @return adAccountId
  **/
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public CampaignAdPreviewCreate200ResponseInnerData adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * Ad group ID to create a preview record for.
   * @return adGroupId
  **/
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public CampaignAdPreviewCreate200ResponseInnerData clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Client ID that created preview.
   * @return clientId
  **/
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public CampaignAdPreviewCreate200ResponseInnerData expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Unix timestamp in milliseconds for preview expiration.
   * @return expiresAt
  **/
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  public CampaignAdPreviewCreate200ResponseInnerData isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Whether preview link is active.
   * @return isActive
  **/
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public CampaignAdPreviewCreate200ResponseInnerData pinId(Integer pinId) {
    this.pinId = pinId;
    return this;
  }

   /**
   * Pin ID for pin promotion preview.
   * @return pinId
  **/
  public Integer getPinId() {
    return pinId;
  }

  public void setPinId(Integer pinId) {
    this.pinId = pinId;
  }

  public CampaignAdPreviewCreate200ResponseInnerData pinPromotionId(Integer pinPromotionId) {
    this.pinPromotionId = pinPromotionId;
    return this;
  }

   /**
   * Pin promotion ID for this preview.
   * @return pinPromotionId
  **/
  public Integer getPinPromotionId() {
    return pinPromotionId;
  }

  public void setPinPromotionId(Integer pinPromotionId) {
    this.pinPromotionId = pinPromotionId;
  }

  public CampaignAdPreviewCreate200ResponseInnerData promotedProductGroupId(Integer promotedProductGroupId) {
    this.promotedProductGroupId = promotedProductGroupId;
    return this;
  }

   /**
   * Promoted product group ID for catalog previews.
   * @return promotedProductGroupId
  **/
  public Integer getPromotedProductGroupId() {
    return promotedProductGroupId;
  }

  public void setPromotedProductGroupId(Integer promotedProductGroupId) {
    this.promotedProductGroupId = promotedProductGroupId;
  }

  public CampaignAdPreviewCreate200ResponseInnerData url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Campaign ad preview URL.
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CampaignAdPreviewCreate200ResponseInnerData userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User ID that created preview.
   * @return userId
  **/
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public CampaignAdPreviewCreate200ResponseInnerData uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Pin promotion preview key.
   * @return uuid
  **/
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public CampaignAdPreviewCreate200ResponseInnerData exceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
    return this;
  }

   /**
   * Get exceptions
   * @return exceptions
  **/
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
    return Objects.equals(adAccountId, campaignAdPreviewCreate200ResponseInnerData.adAccountId) &&
        Objects.equals(adGroupId, campaignAdPreviewCreate200ResponseInnerData.adGroupId) &&
        Objects.equals(clientId, campaignAdPreviewCreate200ResponseInnerData.clientId) &&
        Objects.equals(expiresAt, campaignAdPreviewCreate200ResponseInnerData.expiresAt) &&
        Objects.equals(isActive, campaignAdPreviewCreate200ResponseInnerData.isActive) &&
        Objects.equals(pinId, campaignAdPreviewCreate200ResponseInnerData.pinId) &&
        Objects.equals(pinPromotionId, campaignAdPreviewCreate200ResponseInnerData.pinPromotionId) &&
        Objects.equals(promotedProductGroupId, campaignAdPreviewCreate200ResponseInnerData.promotedProductGroupId) &&
        Objects.equals(url, campaignAdPreviewCreate200ResponseInnerData.url) &&
        Objects.equals(userId, campaignAdPreviewCreate200ResponseInnerData.userId) &&
        Objects.equals(uuid, campaignAdPreviewCreate200ResponseInnerData.uuid) &&
        Objects.equals(exceptions, campaignAdPreviewCreate200ResponseInnerData.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, adGroupId, clientId, expiresAt, isActive, pinId, pinPromotionId, promotedProductGroupId, url, userId, uuid, exceptions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

