package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DiscountStatus;
import org.openapitools.model.PromotionTemplateValue;
import org.openapitools.model.PromotionType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("PromotionCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PromotionCreate   {
  private DiscountStatus discountStatus;
  private Integer endTime;
  private String externalId;
  private String platformType;
  private String promotionCode;
  private String promotionCustomId;
  private String promotionTitle;
  private PromotionType promotionType;
  private Integer startTime;
  private @Valid List<@Valid PromotionTemplateValue> templateValues = new ArrayList<>();

  public PromotionCreate() {
  }

  @JsonCreator
  public PromotionCreate(
    @JsonProperty(required = true, value = "promotion_title") String promotionTitle,
    @JsonProperty(required = true, value = "promotion_type") PromotionType promotionType
  ) {
    this.promotionTitle = promotionTitle;
    this.promotionType = promotionType;
  }

  /**
   **/
  public PromotionCreate discountStatus(DiscountStatus discountStatus) {
    this.discountStatus = discountStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("discount_status")
  public DiscountStatus getDiscountStatus() {
    return discountStatus;
  }

  @JsonProperty("discount_status")
  public void setDiscountStatus(DiscountStatus discountStatus) {
    this.discountStatus = discountStatus;
  }

  /**
   * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
   **/
  public PromotionCreate endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(value = "Promotion end time. Unix timestamp in seconds. Independent of campaign end time.")
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }

  @JsonProperty("end_time")
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  /**
   * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
   **/
  public PromotionCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  
  @ApiModelProperty(value = "Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.")
  @JsonProperty("external_id")
   @Size(max=64)public String getExternalId() {
    return externalId;
  }

  @JsonProperty("external_id")
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.
   **/
  public PromotionCreate platformType(String platformType) {
    this.platformType = platformType;
    return this;
  }

  
  @ApiModelProperty(value = "The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.")
  @JsonProperty("platform_type")
  public String getPlatformType() {
    return platformType;
  }

  @JsonProperty("platform_type")
  public void setPlatformType(String platformType) {
    this.platformType = platformType;
  }

  /**
   * Code that can be used to redeem a promotion.
   **/
  public PromotionCreate promotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
    return this;
  }

  
  @ApiModelProperty(value = "Code that can be used to redeem a promotion.")
  @JsonProperty("promotion_code")
  public String getPromotionCode() {
    return promotionCode;
  }

  @JsonProperty("promotion_code")
  public void setPromotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
  }

  /**
   * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
   **/
  public PromotionCreate promotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
    return this;
  }

  
  @ApiModelProperty(value = "An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.")
  @JsonProperty("promotion_custom_id")
   @Size(max=50)public String getPromotionCustomId() {
    return promotionCustomId;
  }

  @JsonProperty("promotion_custom_id")
  public void setPromotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
  }

  /**
   * Internal name for the promotion.
   **/
  public PromotionCreate promotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Internal name for the promotion.")
  @JsonProperty(required = true, value = "promotion_title")
  @NotNull public String getPromotionTitle() {
    return promotionTitle;
  }

  @JsonProperty(required = true, value = "promotion_title")
  public void setPromotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
  }

  /**
   **/
  public PromotionCreate promotionType(PromotionType promotionType) {
    this.promotionType = promotionType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "promotion_type")
  @NotNull public PromotionType getPromotionType() {
    return promotionType;
  }

  @JsonProperty(required = true, value = "promotion_type")
  public void setPromotionType(PromotionType promotionType) {
    this.promotionType = promotionType;
  }

  /**
   * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
   **/
  public PromotionCreate startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(value = "Promotion start time. Unix timestamp in seconds. Independent of campaign start time.")
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }

  @JsonProperty("start_time")
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  /**
   * List of values to be inserted in the promotion type-specific template.
   **/
  public PromotionCreate templateValues(List<@Valid PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
    return this;
  }

  
  @ApiModelProperty(value = "List of values to be inserted in the promotion type-specific template.")
  @JsonProperty("template_values")
  @Valid  @Size(min=0,max=2)public List<@Valid PromotionTemplateValue> getTemplateValues() {
    return templateValues;
  }

  @JsonProperty("template_values")
  public void setTemplateValues(List<@Valid PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
  }

  public PromotionCreate addTemplateValuesItem(PromotionTemplateValue templateValuesItem) {
    if (this.templateValues == null) {
      this.templateValues = new ArrayList<>();
    }

    this.templateValues.add(templateValuesItem);
    return this;
  }

  public PromotionCreate removeTemplateValuesItem(PromotionTemplateValue templateValuesItem) {
    if (templateValuesItem != null && this.templateValues != null) {
      this.templateValues.remove(templateValuesItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
