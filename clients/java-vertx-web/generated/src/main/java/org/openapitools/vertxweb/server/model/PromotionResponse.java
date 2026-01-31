package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.PromotionTemplateValue;
import org.openapitools.vertxweb.server.model.PromotionType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PromotionResponse   {
  


  public enum DiscountStatusEnum {
    OTHER("OTHER"),
    ACTIVE("ACTIVE"),
    PAUSED("PAUSED"),
    SCHEDULED("SCHEDULED"),
    EXPIRED("EXPIRED");

    private String value;

    DiscountStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private DiscountStatusEnum discountStatus;
  private Integer endTime;
  private String externalId;
  private String platformType;
  private String promotionCode;
  private String promotionCustomId;
  private String promotionTitle;
  private PromotionType promotionType;
  private Integer startTime;
  private List<PromotionTemplateValue> templateValues = new ArrayList<>();
  private String adAccountId;
  private String id;
  private EntityStatus status;

  public PromotionResponse () {

  }

  public PromotionResponse (DiscountStatusEnum discountStatus, Integer endTime, String externalId, String platformType, String promotionCode, String promotionCustomId, String promotionTitle, PromotionType promotionType, Integer startTime, List<PromotionTemplateValue> templateValues, String adAccountId, String id, EntityStatus status) {
    this.discountStatus = discountStatus;
    this.endTime = endTime;
    this.externalId = externalId;
    this.platformType = platformType;
    this.promotionCode = promotionCode;
    this.promotionCustomId = promotionCustomId;
    this.promotionTitle = promotionTitle;
    this.promotionType = promotionType;
    this.startTime = startTime;
    this.templateValues = templateValues;
    this.adAccountId = adAccountId;
    this.id = id;
    this.status = status;
  }

    
  @JsonProperty("discount_status")
  public DiscountStatusEnum getDiscountStatus() {
    return discountStatus;
  }
  public void setDiscountStatus(DiscountStatusEnum discountStatus) {
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

    
  @JsonProperty("template_values")
  public List<PromotionTemplateValue> getTemplateValues() {
    return templateValues;
  }
  public void setTemplateValues(List<PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionResponse promotionResponse = (PromotionResponse) o;
    return Objects.equals(discountStatus, promotionResponse.discountStatus) &&
        Objects.equals(endTime, promotionResponse.endTime) &&
        Objects.equals(externalId, promotionResponse.externalId) &&
        Objects.equals(platformType, promotionResponse.platformType) &&
        Objects.equals(promotionCode, promotionResponse.promotionCode) &&
        Objects.equals(promotionCustomId, promotionResponse.promotionCustomId) &&
        Objects.equals(promotionTitle, promotionResponse.promotionTitle) &&
        Objects.equals(promotionType, promotionResponse.promotionType) &&
        Objects.equals(startTime, promotionResponse.startTime) &&
        Objects.equals(templateValues, promotionResponse.templateValues) &&
        Objects.equals(adAccountId, promotionResponse.adAccountId) &&
        Objects.equals(id, promotionResponse.id) &&
        Objects.equals(status, promotionResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountStatus, endTime, externalId, platformType, promotionCode, promotionCustomId, promotionTitle, promotionType, startTime, templateValues, adAccountId, id, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionResponse {\n");
    
    sb.append("    discountStatus: ").append(toIndentedString(discountStatus)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
    sb.append("    promotionCode: ").append(toIndentedString(promotionCode)).append("\n");
    sb.append("    promotionCustomId: ").append(toIndentedString(promotionCustomId)).append("\n");
    sb.append("    promotionTitle: ").append(toIndentedString(promotionTitle)).append("\n");
    sb.append("    promotionType: ").append(toIndentedString(promotionType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    templateValues: ").append(toIndentedString(templateValues)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
