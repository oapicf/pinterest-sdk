package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.DiscountStatus;
import org.openapitools.server.model.EntityStatus;
import org.openapitools.server.model.PromotionTemplateValue;
import org.openapitools.server.model.PromotionType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Promotion   {

    private String adAccountId;
    private DiscountStatus discountStatus;
    private Integer endTime;
    private String externalId;
    private String id;
    private String platformType;
    private String promotionCode;
    private String promotionCustomId;
    private String promotionTitle;
    private PromotionType promotionType;
    private Integer startTime;
    private EntityStatus status;
    private List<@Valid PromotionTemplateValue> templateValues = new ArrayList<>();

    /**
     * Default constructor.
     */
    public Promotion() {
    // JSON-B / Jackson
    }

    /**
     * Create Promotion.
     *
     * @param adAccountId The Ad Account ID that this promotion belongs to.
     * @param discountStatus discountStatus
     * @param endTime Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
     * @param externalId Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
     * @param id Promotion ID
     * @param platformType The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.
     * @param promotionCode Code that can be used to redeem a promotion.
     * @param promotionCustomId An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
     * @param promotionTitle Internal name for the promotion.
     * @param promotionType promotionType
     * @param startTime Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
     * @param status status
     * @param templateValues List of values to be inserted in the promotion type-specific template.
     */
    public Promotion(
        String adAccountId, 
        DiscountStatus discountStatus, 
        Integer endTime, 
        String externalId, 
        String id, 
        String platformType, 
        String promotionCode, 
        String promotionCustomId, 
        String promotionTitle, 
        PromotionType promotionType, 
        Integer startTime, 
        EntityStatus status, 
        List<@Valid PromotionTemplateValue> templateValues
    ) {
        this.adAccountId = adAccountId;
        this.discountStatus = discountStatus;
        this.endTime = endTime;
        this.externalId = externalId;
        this.id = id;
        this.platformType = platformType;
        this.promotionCode = promotionCode;
        this.promotionCustomId = promotionCustomId;
        this.promotionTitle = promotionTitle;
        this.promotionType = promotionType;
        this.startTime = startTime;
        this.status = status;
        this.templateValues = templateValues;
    }



    /**
     * The Ad Account ID that this promotion belongs to.
     * @return adAccountId
     */
    public String getAdAccountId() {
        return adAccountId;
    }

    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
    }

    /**
     * Get discountStatus
     * @return discountStatus
     */
    public DiscountStatus getDiscountStatus() {
        return discountStatus;
    }

    public void setDiscountStatus(DiscountStatus discountStatus) {
        this.discountStatus = discountStatus;
    }

    /**
     * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
     * @return endTime
     */
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
     * @return externalId
     */
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * Promotion ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
     * @return platformType
     */
    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    /**
     * Code that can be used to redeem a promotion.
     * @return promotionCode
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    /**
     * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
     * @return promotionCustomId
     */
    public String getPromotionCustomId() {
        return promotionCustomId;
    }

    public void setPromotionCustomId(String promotionCustomId) {
        this.promotionCustomId = promotionCustomId;
    }

    /**
     * Internal name for the promotion.
     * @return promotionTitle
     */
    public String getPromotionTitle() {
        return promotionTitle;
    }

    public void setPromotionTitle(String promotionTitle) {
        this.promotionTitle = promotionTitle;
    }

    /**
     * Get promotionType
     * @return promotionType
     */
    public PromotionType getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(PromotionType promotionType) {
        this.promotionType = promotionType;
    }

    /**
     * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
     * @return startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * Get status
     * @return status
     */
    public EntityStatus getStatus() {
        return status;
    }

    public void setStatus(EntityStatus status) {
        this.status = status;
    }

    /**
     * List of values to be inserted in the promotion type-specific template.
     * @return templateValues
     */
    public List<@Valid PromotionTemplateValue> getTemplateValues() {
        return templateValues;
    }

    public void setTemplateValues(List<@Valid PromotionTemplateValue> templateValues) {
        this.templateValues = templateValues;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Promotion {\n");
        
        sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
        sb.append("    discountStatus: ").append(toIndentedString(discountStatus)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
        sb.append("    promotionCode: ").append(toIndentedString(promotionCode)).append("\n");
        sb.append("    promotionCustomId: ").append(toIndentedString(promotionCustomId)).append("\n");
        sb.append("    promotionTitle: ").append(toIndentedString(promotionTitle)).append("\n");
        sb.append("    promotionType: ").append(toIndentedString(promotionType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    templateValues: ").append(toIndentedString(templateValues)).append("\n");
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

