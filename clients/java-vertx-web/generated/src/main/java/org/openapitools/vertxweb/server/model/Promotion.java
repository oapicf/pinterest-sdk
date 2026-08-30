package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.DiscountStatus;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.PromotionTemplateValue;
import org.openapitools.vertxweb.server.model.PromotionType;

@JsonInclude(JsonInclude.Include.NON_NULL)
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
  private List<PromotionTemplateValue> templateValues = new ArrayList<>();

  public Promotion () {

  }

  public Promotion (String adAccountId, DiscountStatus discountStatus, Integer endTime, String externalId, String id, String platformType, String promotionCode, String promotionCustomId, String promotionTitle, PromotionType promotionType, Integer startTime, EntityStatus status, List<PromotionTemplateValue> templateValues) {
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

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("discount_status")
  public DiscountStatus getDiscountStatus() {
    return discountStatus;
  }
  public void setDiscountStatus(DiscountStatus discountStatus) {
    this.discountStatus = discountStatus;
  }

    
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

    
  @JsonProperty("external_id")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("platform_type")
  public String getPlatformType() {
    return platformType;
  }
  public void setPlatformType(String platformType) {
    this.platformType = platformType;
  }

    
  @JsonProperty("promotion_code")
  public String getPromotionCode() {
    return promotionCode;
  }
  public void setPromotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
  }

    
  @JsonProperty("promotion_custom_id")
  public String getPromotionCustomId() {
    return promotionCustomId;
  }
  public void setPromotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
  }

    
  @JsonProperty("promotion_title")
  public String getPromotionTitle() {
    return promotionTitle;
  }
  public void setPromotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
  }

    
  @JsonProperty("promotion_type")
  public PromotionType getPromotionType() {
    return promotionType;
  }
  public void setPromotionType(PromotionType promotionType) {
    this.promotionType = promotionType;
  }

    
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

    
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

    
  @JsonProperty("template_values")
  public List<PromotionTemplateValue> getTemplateValues() {
    return templateValues;
  }
  public void setTemplateValues(List<PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Promotion promotion = (Promotion) o;
    return Objects.equals(adAccountId, promotion.adAccountId) &&
        Objects.equals(discountStatus, promotion.discountStatus) &&
        Objects.equals(endTime, promotion.endTime) &&
        Objects.equals(externalId, promotion.externalId) &&
        Objects.equals(id, promotion.id) &&
        Objects.equals(platformType, promotion.platformType) &&
        Objects.equals(promotionCode, promotion.promotionCode) &&
        Objects.equals(promotionCustomId, promotion.promotionCustomId) &&
        Objects.equals(promotionTitle, promotion.promotionTitle) &&
        Objects.equals(promotionType, promotion.promotionType) &&
        Objects.equals(startTime, promotion.startTime) &&
        Objects.equals(status, promotion.status) &&
        Objects.equals(templateValues, promotion.templateValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, discountStatus, endTime, externalId, id, platformType, promotionCode, promotionCustomId, promotionTitle, promotionType, startTime, status, templateValues);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
