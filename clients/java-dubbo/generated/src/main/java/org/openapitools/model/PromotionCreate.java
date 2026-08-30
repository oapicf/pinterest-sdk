package org.openapitools.model;

import org.openapitools.model.DiscountStatus;
import org.openapitools.model.PromotionTemplateValue;
import org.openapitools.model.PromotionType;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class PromotionCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("discount_status")
  private DiscountStatus discountStatus;

  /**
   * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
   */
  @JsonProperty("end_time")
  private Integer endTime;

  /**
   * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
   */
  @JsonProperty("external_id")
  private String externalId;

  /**
   * The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.
   */
  @JsonProperty("platform_type")
  private String platformType;

  /**
   * Code that can be used to redeem a promotion.
   */
  @JsonProperty("promotion_code")
  private String promotionCode;

  /**
   * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
   */
  @JsonProperty("promotion_custom_id")
  private String promotionCustomId;

  /**
   * Internal name for the promotion.
   */
  @JsonProperty("promotion_title")
  private String promotionTitle;

  @JsonProperty("promotion_type")
  private PromotionType promotionType;

  /**
   * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
   */
  @JsonProperty("start_time")
  private Integer startTime;

  /**
   * List of values to be inserted in the promotion type-specific template.
   */
  @JsonProperty("template_values")
  private List<PromotionTemplateValue> templateValues = new ArrayList<>();

  /**
   * 
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
   * The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.
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
   * 
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
   * List of values to be inserted in the promotion type-specific template.
   * @return templateValues
   */
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
    PromotionCreate promotionCreate = (PromotionCreate) o;
    return Objects.equals(this.discountStatus, promotionCreate.discountStatus) &&
        Objects.equals(this.endTime, promotionCreate.endTime) &&
        Objects.equals(this.externalId, promotionCreate.externalId) &&
        Objects.equals(this.platformType, promotionCreate.platformType) &&
        Objects.equals(this.promotionCode, promotionCreate.promotionCode) &&
        Objects.equals(this.promotionCustomId, promotionCreate.promotionCustomId) &&
        Objects.equals(this.promotionTitle, promotionCreate.promotionTitle) &&
        Objects.equals(this.promotionType, promotionCreate.promotionType) &&
        Objects.equals(this.startTime, promotionCreate.startTime) &&
        Objects.equals(this.templateValues, promotionCreate.templateValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountStatus, endTime, externalId, platformType, promotionCode, promotionCustomId, promotionTitle, promotionType, startTime, templateValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionCreate {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
