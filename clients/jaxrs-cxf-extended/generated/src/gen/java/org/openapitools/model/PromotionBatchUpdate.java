package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DiscountStatus;
import org.openapitools.model.PromotionTemplateValue;
import org.openapitools.model.PromotionType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PromotionBatchUpdate  {
  
  @ApiModelProperty(value = "")
  @Valid
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
  * Promotion ID
  */
  @ApiModelProperty(required = true, value = "Promotion ID")
  private String id;

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
  @ApiModelProperty(value = "Internal name for the promotion.")
  private String promotionTitle;

  @ApiModelProperty(value = "")
  @Valid
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
  @Valid
  private List<@Valid PromotionTemplateValue> templateValues = new ArrayList<>();
 /**
  * Get discountStatus
  * @return discountStatus
  */
  @JsonProperty("discount_status")
  public DiscountStatus getDiscountStatus() {
    return discountStatus;
  }

  /**
   * Sets the <code>discountStatus</code> property.
   */
 public void setDiscountStatus(DiscountStatus discountStatus) {
    this.discountStatus = discountStatus;
  }

  /**
   * Sets the <code>discountStatus</code> property.
   */
  public PromotionBatchUpdate discountStatus(DiscountStatus discountStatus) {
    this.discountStatus = discountStatus;
    return this;
  }

 /**
  * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
  * @return endTime
  */
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }

  /**
   * Sets the <code>endTime</code> property.
   */
 public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  /**
   * Sets the <code>endTime</code> property.
   */
  public PromotionBatchUpdate endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
  * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
  * @return externalId
  */
  @JsonProperty("external_id")
 @Size(max=64)  public String getExternalId() {
    return externalId;
  }

  /**
   * Sets the <code>externalId</code> property.
   */
 public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * Sets the <code>externalId</code> property.
   */
  public PromotionBatchUpdate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
  * Promotion ID
  * @return id
  */
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=18)  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public PromotionBatchUpdate id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.
  * @return platformType
  */
  @JsonProperty("platform_type")
  public String getPlatformType() {
    return platformType;
  }

  /**
   * Sets the <code>platformType</code> property.
   */
 public void setPlatformType(String platformType) {
    this.platformType = platformType;
  }

  /**
   * Sets the <code>platformType</code> property.
   */
  public PromotionBatchUpdate platformType(String platformType) {
    this.platformType = platformType;
    return this;
  }

 /**
  * Code that can be used to redeem a promotion.
  * @return promotionCode
  */
  @JsonProperty("promotion_code")
  public String getPromotionCode() {
    return promotionCode;
  }

  /**
   * Sets the <code>promotionCode</code> property.
   */
 public void setPromotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
  }

  /**
   * Sets the <code>promotionCode</code> property.
   */
  public PromotionBatchUpdate promotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
    return this;
  }

 /**
  * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
  * @return promotionCustomId
  */
  @JsonProperty("promotion_custom_id")
 @Size(max=50)  public String getPromotionCustomId() {
    return promotionCustomId;
  }

  /**
   * Sets the <code>promotionCustomId</code> property.
   */
 public void setPromotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
  }

  /**
   * Sets the <code>promotionCustomId</code> property.
   */
  public PromotionBatchUpdate promotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
    return this;
  }

 /**
  * Internal name for the promotion.
  * @return promotionTitle
  */
  @JsonProperty("promotion_title")
  public String getPromotionTitle() {
    return promotionTitle;
  }

  /**
   * Sets the <code>promotionTitle</code> property.
   */
 public void setPromotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
  }

  /**
   * Sets the <code>promotionTitle</code> property.
   */
  public PromotionBatchUpdate promotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
    return this;
  }

 /**
  * Get promotionType
  * @return promotionType
  */
  @JsonProperty("promotion_type")
  public PromotionType getPromotionType() {
    return promotionType;
  }

  /**
   * Sets the <code>promotionType</code> property.
   */
 public void setPromotionType(PromotionType promotionType) {
    this.promotionType = promotionType;
  }

  /**
   * Sets the <code>promotionType</code> property.
   */
  public PromotionBatchUpdate promotionType(PromotionType promotionType) {
    this.promotionType = promotionType;
    return this;
  }

 /**
  * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
  * @return startTime
  */
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }

  /**
   * Sets the <code>startTime</code> property.
   */
 public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  /**
   * Sets the <code>startTime</code> property.
   */
  public PromotionBatchUpdate startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
  * List of values to be inserted in the promotion type-specific template.
  * @return templateValues
  */
  @JsonProperty("template_values")
 @Size(min=0,max=2)  public List<@Valid PromotionTemplateValue> getTemplateValues() {
    return templateValues;
  }

  /**
   * Sets the <code>templateValues</code> property.
   */
 public void setTemplateValues(List<@Valid PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
  }

  /**
   * Sets the <code>templateValues</code> property.
   */
  public PromotionBatchUpdate templateValues(List<@Valid PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
    return this;
  }

  /**
   * Adds a new item to the <code>templateValues</code> list.
   */
  public PromotionBatchUpdate addTemplateValuesItem(PromotionTemplateValue templateValuesItem) {
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
    PromotionBatchUpdate promotionBatchUpdate = (PromotionBatchUpdate) o;
    return Objects.equals(this.discountStatus, promotionBatchUpdate.discountStatus) &&
        Objects.equals(this.endTime, promotionBatchUpdate.endTime) &&
        Objects.equals(this.externalId, promotionBatchUpdate.externalId) &&
        Objects.equals(this.id, promotionBatchUpdate.id) &&
        Objects.equals(this.platformType, promotionBatchUpdate.platformType) &&
        Objects.equals(this.promotionCode, promotionBatchUpdate.promotionCode) &&
        Objects.equals(this.promotionCustomId, promotionBatchUpdate.promotionCustomId) &&
        Objects.equals(this.promotionTitle, promotionBatchUpdate.promotionTitle) &&
        Objects.equals(this.promotionType, promotionBatchUpdate.promotionType) &&
        Objects.equals(this.startTime, promotionBatchUpdate.startTime) &&
        Objects.equals(this.templateValues, promotionBatchUpdate.templateValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountStatus, endTime, externalId, id, platformType, promotionCode, promotionCustomId, promotionTitle, promotionType, startTime, templateValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionBatchUpdate {\n");
    
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

