package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Campaign ad preview record.
 */
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

    /**
     * Default constructor.
     */
    public CampaignAdPreview() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignAdPreview.
     *
     * @param adAccountId Advertiser ID for this preview.
     * @param adGroupId Ad group ID to create a preview record for.
     * @param clientId Client ID that created preview.
     * @param expiresAt Unix timestamp in milliseconds for preview expiration.
     * @param isActive Whether preview link is active.
     * @param pinId Pin ID for pin promotion preview.
     * @param pinPromotionId Pin promotion ID for this preview.
     * @param promotedProductGroupId Promoted product group ID for catalog previews.
     * @param url Campaign ad preview URL.
     * @param userId User ID that created preview.
     * @param uuid Pin promotion preview key.
     */
    public CampaignAdPreview(
        String adAccountId, 
        String adGroupId, 
        Integer clientId, 
        Integer expiresAt, 
        Boolean isActive, 
        Integer pinId, 
        Integer pinPromotionId, 
        Integer promotedProductGroupId, 
        String url, 
        Integer userId, 
        String uuid
    ) {
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



    /**
     * Advertiser ID for this preview.
     * @return adAccountId
     */
    public String getAdAccountId() {
        return adAccountId;
    }

    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
    }

    /**
     * Ad group ID to create a preview record for.
     * @return adGroupId
     */
    public String getAdGroupId() {
        return adGroupId;
    }

    public void setAdGroupId(String adGroupId) {
        this.adGroupId = adGroupId;
    }

    /**
     * Client ID that created preview.
     * @return clientId
     */
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    /**
     * Unix timestamp in milliseconds for preview expiration.
     * @return expiresAt
     */
    public Integer getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Whether preview link is active.
     * @return isActive
     */
    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * Pin ID for pin promotion preview.
     * @return pinId
     */
    public Integer getPinId() {
        return pinId;
    }

    public void setPinId(Integer pinId) {
        this.pinId = pinId;
    }

    /**
     * Pin promotion ID for this preview.
     * @return pinPromotionId
     */
    public Integer getPinPromotionId() {
        return pinPromotionId;
    }

    public void setPinPromotionId(Integer pinPromotionId) {
        this.pinPromotionId = pinPromotionId;
    }

    /**
     * Promoted product group ID for catalog previews.
     * @return promotedProductGroupId
     */
    public Integer getPromotedProductGroupId() {
        return promotedProductGroupId;
    }

    public void setPromotedProductGroupId(Integer promotedProductGroupId) {
        this.promotedProductGroupId = promotedProductGroupId;
    }

    /**
     * Campaign ad preview URL.
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * User ID that created preview.
     * @return userId
     */
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * Pin promotion preview key.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

