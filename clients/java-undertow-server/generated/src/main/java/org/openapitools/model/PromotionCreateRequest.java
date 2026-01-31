/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.23.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PromotionTemplateValue;
import org.openapitools.model.PromotionType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-31T04:53:14.867699604Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

  /**
   * Discount status based on the current time and start and end time of discount
   */
  public PromotionCreateRequest discountStatus(DiscountStatusEnum discountStatus) {
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
   */
  public PromotionCreateRequest endTime(Integer endTime) {
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
   */
  public PromotionCreateRequest externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  
  @ApiModelProperty(example = "abc", value = "Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.")
  @JsonProperty("external_id")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
   */
  public PromotionCreateRequest platformType(String platformType) {
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
   */
  public PromotionCreateRequest promotionCode(String promotionCode) {
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
   */
  public PromotionCreateRequest promotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
    return this;
  }

  
  @ApiModelProperty(example = "freeshipping_2025", value = "An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.")
  @JsonProperty("promotion_custom_id")
  public String getPromotionCustomId() {
    return promotionCustomId;
  }
  public void setPromotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
  }

  /**
   * Internal name for the promotion.
   */
  public PromotionCreateRequest promotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
    return this;
  }

  
  @ApiModelProperty(example = "Black Friday 10% off", required = true, value = "Internal name for the promotion.")
  @JsonProperty("promotion_title")
  public String getPromotionTitle() {
    return promotionTitle;
  }
  public void setPromotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
  }

  /**
   */
  public PromotionCreateRequest promotionType(PromotionType promotionType) {
    this.promotionType = promotionType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("promotion_type")
  public PromotionType getPromotionType() {
    return promotionType;
  }
  public void setPromotionType(PromotionType promotionType) {
    this.promotionType = promotionType;
  }

  /**
   * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
   */
  public PromotionCreateRequest startTime(Integer startTime) {
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
   */
  public PromotionCreateRequest templateValues(List<PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
    return this;
  }

  
  @ApiModelProperty(value = "List of values to be inserted in the promotion type-specific template.")
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

