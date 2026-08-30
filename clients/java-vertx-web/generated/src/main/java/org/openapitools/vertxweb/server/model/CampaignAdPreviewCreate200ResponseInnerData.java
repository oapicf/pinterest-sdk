package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CampaignAdPreview;
import org.openapitools.vertxweb.server.model.CampaignAdPreviewCreate200ResponseInnerDataOneOf;
import org.openapitools.vertxweb.server.model.PinterestLibError;

/**
 * Created/updated resource on success or error details on failure
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public CampaignAdPreviewCreate200ResponseInnerData () {

  }

  public CampaignAdPreviewCreate200ResponseInnerData (String adAccountId, String adGroupId, Integer clientId, Integer expiresAt, Boolean isActive, Integer pinId, Integer pinPromotionId, Integer promotedProductGroupId, String url, Integer userId, String uuid, PinterestLibError exceptions) {
    this.adAccountId = adAccountId;
    this.adGroupId = adGroupId;
    this.clientId = clientId;
    this.expiresAt = expiresAt;
    this.isActive = isActive;
    this.pinId = pinId;
    this.pinPromotionId = pinPromotionId;
    this.promotedProductGroupId = promotedProductGroupId;
    this.url = url;
    this.userId = userId;
    this.uuid = uuid;
    this.exceptions = exceptions;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

    
  @JsonProperty("client_id")
  public Integer getClientId() {
    return clientId;
  }
  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

    
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

    
  @JsonProperty("is_active")
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

    
  @JsonProperty("pin_id")
  public Integer getPinId() {
    return pinId;
  }
  public void setPinId(Integer pinId) {
    this.pinId = pinId;
  }

    
  @JsonProperty("pin_promotion_id")
  public Integer getPinPromotionId() {
    return pinPromotionId;
  }
  public void setPinPromotionId(Integer pinPromotionId) {
    this.pinPromotionId = pinPromotionId;
  }

    
  @JsonProperty("promoted_product_group_id")
  public Integer getPromotedProductGroupId() {
    return promotedProductGroupId;
  }
  public void setPromotedProductGroupId(Integer promotedProductGroupId) {
    this.promotedProductGroupId = promotedProductGroupId;
  }

    
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

    
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

    
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

    
  @JsonProperty("exceptions")
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
