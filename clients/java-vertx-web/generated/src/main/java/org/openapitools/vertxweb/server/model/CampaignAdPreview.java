package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Campaign ad preview record.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignAdPreview   {
  
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

  public CampaignAdPreview () {

  }

  public CampaignAdPreview (String adAccountId, String adGroupId, Integer clientId, Integer expiresAt, Boolean isActive, Integer pinId, Integer pinPromotionId, Integer promotedProductGroupId, String url, Integer userId, String uuid) {
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
