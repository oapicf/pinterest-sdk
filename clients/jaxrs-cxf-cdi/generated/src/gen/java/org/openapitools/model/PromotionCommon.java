package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PromotionTemplateValue;
import org.openapitools.model.PromotionType;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PromotionCommon   {
  

public enum DiscountStatusEnum {

    @JsonProperty("OTHER") OTHER(String.valueOf("OTHER")), @JsonProperty("ACTIVE") ACTIVE(String.valueOf("ACTIVE")), @JsonProperty("PAUSED") PAUSED(String.valueOf("PAUSED")), @JsonProperty("SCHEDULED") SCHEDULED(String.valueOf("SCHEDULED")), @JsonProperty("EXPIRED") EXPIRED(String.valueOf("EXPIRED"));


    private String value;

    DiscountStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DiscountStatusEnum fromValue(String value) {
        for (DiscountStatusEnum b : DiscountStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

  private List<@Valid PromotionTemplateValue> templateValues = new ArrayList<>();

  /**
   * Discount status based on the current time and start and end time of discount
   **/
  public PromotionCommon discountStatus(DiscountStatusEnum discountStatus) {
    this.discountStatus = discountStatus;
    return this;
  }

  
  @ApiModelProperty(example = "ACTIVE", value = "Discount status based on the current time and start and end time of discount")
  @JsonProperty("discount_status")
  public DiscountStatusEnum getDiscountStatus() {
    return discountStatus;
  }
  public void setDiscountStatus(DiscountStatusEnum discountStatus) {
    this.discountStatus = discountStatus;
  }


  /**
   * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
   **/
  public PromotionCommon endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(example = "1678003860", value = "Promotion end time. Unix timestamp in seconds. Independent of campaign end time.")
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }
  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }


  /**
   * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
   **/
  public PromotionCommon externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  
  @ApiModelProperty(example = "abc", value = "Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.")
  @JsonProperty("external_id")
 @Size(max=64)  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  /**
   * The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.
   **/
  public PromotionCommon platformType(String platformType) {
    this.platformType = platformType;
    return this;
  }

  
  @ApiModelProperty(example = "DEFAULT", value = "The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.")
  @JsonProperty("platform_type")
  public String getPlatformType() {
    return platformType;
  }
  public void setPlatformType(String platformType) {
    this.platformType = platformType;
  }


  /**
   * Code that can be used to redeem a promotion.
   **/
  public PromotionCommon promotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
    return this;
  }

  
  @ApiModelProperty(example = "blackfriday10", value = "Code that can be used to redeem a promotion.")
  @JsonProperty("promotion_code")
  public String getPromotionCode() {
    return promotionCode;
  }
  public void setPromotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
  }


  /**
   * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
   **/
  public PromotionCommon promotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
    return this;
  }

  
  @ApiModelProperty(example = "freeshipping_2025", value = "An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.")
  @JsonProperty("promotion_custom_id")
 @Size(max=50)  public String getPromotionCustomId() {
    return promotionCustomId;
  }
  public void setPromotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
  }


  /**
   * Internal name for the promotion.
   **/
  public PromotionCommon promotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
    return this;
  }

  
  @ApiModelProperty(example = "Black Friday 10% off", value = "Internal name for the promotion.")
  @JsonProperty("promotion_title")
  public String getPromotionTitle() {
    return promotionTitle;
  }
  public void setPromotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
  }


  /**
   **/
  public PromotionCommon promotionType(PromotionType promotionType) {
    this.promotionType = promotionType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("promotion_type")
  public PromotionType getPromotionType() {
    return promotionType;
  }
  public void setPromotionType(PromotionType promotionType) {
    this.promotionType = promotionType;
  }


  /**
   * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
   **/
  public PromotionCommon startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(example = "1677003860", value = "Promotion start time. Unix timestamp in seconds. Independent of campaign start time.")
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }


  /**
   * List of values to be inserted in the promotion type-specific template.
   **/
  public PromotionCommon templateValues(List<@Valid PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
    return this;
  }

  
  @ApiModelProperty(value = "List of values to be inserted in the promotion type-specific template.")
  @JsonProperty("template_values")
 @Size(min=0,max=2)  public List<@Valid PromotionTemplateValue> getTemplateValues() {
    return templateValues;
  }
  public void setTemplateValues(List<@Valid PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
  }

  public PromotionCommon addTemplateValuesItem(PromotionTemplateValue templateValuesItem) {
    if (this.templateValues == null) {
      this.templateValues = new ArrayList<>();
    }
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
    PromotionCommon promotionCommon = (PromotionCommon) o;
    return Objects.equals(this.discountStatus, promotionCommon.discountStatus) &&
        Objects.equals(this.endTime, promotionCommon.endTime) &&
        Objects.equals(this.externalId, promotionCommon.externalId) &&
        Objects.equals(this.platformType, promotionCommon.platformType) &&
        Objects.equals(this.promotionCode, promotionCommon.promotionCode) &&
        Objects.equals(this.promotionCustomId, promotionCommon.promotionCustomId) &&
        Objects.equals(this.promotionTitle, promotionCommon.promotionTitle) &&
        Objects.equals(this.promotionType, promotionCommon.promotionType) &&
        Objects.equals(this.startTime, promotionCommon.startTime) &&
        Objects.equals(this.templateValues, promotionCommon.templateValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountStatus, endTime, externalId, platformType, promotionCode, promotionCustomId, promotionTitle, promotionType, startTime, templateValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionCommon {\n");
    
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

