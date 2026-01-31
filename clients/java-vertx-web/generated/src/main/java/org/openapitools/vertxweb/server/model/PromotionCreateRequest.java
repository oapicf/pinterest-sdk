package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.PromotionTemplateValue;
import org.openapitools.vertxweb.server.model.PromotionType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PromotionCreateRequest   {
  


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

  public PromotionCreateRequest () {

  }

  public PromotionCreateRequest (DiscountStatusEnum discountStatus, Integer endTime, String externalId, String platformType, String promotionCode, String promotionCustomId, String promotionTitle, PromotionType promotionType, Integer startTime, List<PromotionTemplateValue> templateValues) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionCreateRequest promotionCreateRequest = (PromotionCreateRequest) o;
    return Objects.equals(discountStatus, promotionCreateRequest.discountStatus) &&
        Objects.equals(endTime, promotionCreateRequest.endTime) &&
        Objects.equals(externalId, promotionCreateRequest.externalId) &&
        Objects.equals(platformType, promotionCreateRequest.platformType) &&
        Objects.equals(promotionCode, promotionCreateRequest.promotionCode) &&
        Objects.equals(promotionCustomId, promotionCreateRequest.promotionCustomId) &&
        Objects.equals(promotionTitle, promotionCreateRequest.promotionTitle) &&
        Objects.equals(promotionType, promotionCreateRequest.promotionType) &&
        Objects.equals(startTime, promotionCreateRequest.startTime) &&
        Objects.equals(templateValues, promotionCreateRequest.templateValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountStatus, endTime, externalId, platformType, promotionCode, promotionCustomId, promotionTitle, promotionType, startTime, templateValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionCreateRequest {\n");
    
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
