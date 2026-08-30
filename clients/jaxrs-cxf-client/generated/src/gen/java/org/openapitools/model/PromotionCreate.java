package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DiscountStatus;
import org.openapitools.model.PromotionTemplateValue;
import org.openapitools.model.PromotionType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class PromotionCreate  {
  
  @ApiModelProperty(value = "")

  private DiscountStatus discountStatus;

 /**
  * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
  */
  @ApiModelProperty(value = "Promotion end time. Unix timestamp in seconds. Independent of campaign end time.")

  private Integer endTime;

 /**
  * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
  */
  @ApiModelProperty(value = "Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.")

  private String externalId;

 /**
  * The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
  */
  @ApiModelProperty(value = "The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.")

  private String platformType;

 /**
  * Code that can be used to redeem a promotion.
  */
  @ApiModelProperty(value = "Code that can be used to redeem a promotion.")

  private String promotionCode;

 /**
  * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
  */
  @ApiModelProperty(value = "An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.")

  private String promotionCustomId;

 /**
  * Internal name for the promotion.
  */
  @ApiModelProperty(required = true, value = "Internal name for the promotion.")

  private String promotionTitle;

  @ApiModelProperty(required = true, value = "")

  private PromotionType promotionType;

 /**
  * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
  */
  @ApiModelProperty(value = "Promotion start time. Unix timestamp in seconds. Independent of campaign start time.")

  private Integer startTime;

 /**
  * List of values to be inserted in the promotion type-specific template.
  */
  @ApiModelProperty(value = "List of values to be inserted in the promotion type-specific template.")

  private List<PromotionTemplateValue> templateValues = new ArrayList<>();
 /**
   * Get discountStatus
   * @return discountStatus
  **/
  @JsonProperty("discount_status")
  public DiscountStatus getDiscountStatus() {
    return discountStatus;
  }

  public void setDiscountStatus(DiscountStatus discountStatus) {
    this.discountStatus = discountStatus;
  }

  public PromotionCreate discountStatus(DiscountStatus discountStatus) {
    this.discountStatus = discountStatus;
    return this;
  }

 /**
   * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
   * @return endTime
  **/
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public PromotionCreate endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
   * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
   * @return externalId
  **/
  @JsonProperty("external_id")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public PromotionCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
   * The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.
   * @return platformType
  **/
  @JsonProperty("platform_type")
  public String getPlatformType() {
    return platformType;
  }

  public void setPlatformType(String platformType) {
    this.platformType = platformType;
  }

  public PromotionCreate platformType(String platformType) {
    this.platformType = platformType;
    return this;
  }

 /**
   * Code that can be used to redeem a promotion.
   * @return promotionCode
  **/
  @JsonProperty("promotion_code")
  public String getPromotionCode() {
    return promotionCode;
  }

  public void setPromotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
  }

  public PromotionCreate promotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
    return this;
  }

 /**
   * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
   * @return promotionCustomId
  **/
  @JsonProperty("promotion_custom_id")
  public String getPromotionCustomId() {
    return promotionCustomId;
  }

  public void setPromotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
  }

  public PromotionCreate promotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
    return this;
  }

 /**
   * Internal name for the promotion.
   * @return promotionTitle
  **/
  @JsonProperty("promotion_title")
  public String getPromotionTitle() {
    return promotionTitle;
  }

  public void setPromotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
  }

  public PromotionCreate promotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
    return this;
  }

 /**
   * Get promotionType
   * @return promotionType
  **/
  @JsonProperty("promotion_type")
  public PromotionType getPromotionType() {
    return promotionType;
  }

  public void setPromotionType(PromotionType promotionType) {
    this.promotionType = promotionType;
  }

  public PromotionCreate promotionType(PromotionType promotionType) {
    this.promotionType = promotionType;
    return this;
  }

 /**
   * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
   * @return startTime
  **/
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public PromotionCreate startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
   * List of values to be inserted in the promotion type-specific template.
   * @return templateValues
  **/
  @JsonProperty("template_values")
  public List<PromotionTemplateValue> getTemplateValues() {
    return templateValues;
  }

  public void setTemplateValues(List<PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
  }

  public PromotionCreate templateValues(List<PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
    return this;
  }

  public PromotionCreate addTemplateValuesItem(PromotionTemplateValue templateValuesItem) {
    this.templateValues.add(templateValuesItem);
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

