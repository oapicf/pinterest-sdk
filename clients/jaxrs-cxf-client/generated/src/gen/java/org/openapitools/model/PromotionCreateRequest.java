package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PromotionTemplateValue;
import org.openapitools.model.PromotionType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PromotionCreateRequest  {
  
public enum DiscountStatusEnum {

OTHER(String.valueOf("OTHER")), ACTIVE(String.valueOf("ACTIVE")), PAUSED(String.valueOf("PAUSED")), SCHEDULED(String.valueOf("SCHEDULED")), EXPIRED(String.valueOf("EXPIRED"));


    private String value;

    DiscountStatusEnum (String v) {
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

 /**
  * Discount status based on the current time and start and end time of discount
  */
  @ApiModelProperty(example = "ACTIVE", value = "Discount status based on the current time and start and end time of discount")

  private DiscountStatusEnum discountStatus;

 /**
  * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
  */
  @ApiModelProperty(example = "1678003860", value = "Promotion end time. Unix timestamp in seconds. Independent of campaign end time.")

  private Integer endTime;

 /**
  * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
  */
  @ApiModelProperty(example = "abc", value = "Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.")

  private String externalId;

 /**
  * The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
  */
  @ApiModelProperty(example = "DEFAULT", value = "The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.")

  private String platformType;

 /**
  * Code that can be used to redeem a promotion.
  */
  @ApiModelProperty(example = "blackfriday10", value = "Code that can be used to redeem a promotion.")

  private String promotionCode;

 /**
  * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
  */
  @ApiModelProperty(example = "freeshipping_2025", value = "An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.")

  private String promotionCustomId;

 /**
  * Internal name for the promotion.
  */
  @ApiModelProperty(example = "Black Friday 10% off", required = true, value = "Internal name for the promotion.")

  private String promotionTitle;

  @ApiModelProperty(required = true, value = "")

  private PromotionType promotionType;

 /**
  * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
  */
  @ApiModelProperty(example = "1677003860", value = "Promotion start time. Unix timestamp in seconds. Independent of campaign start time.")

  private Integer startTime;

 /**
  * List of values to be inserted in the promotion type-specific template.
  */
  @ApiModelProperty(value = "List of values to be inserted in the promotion type-specific template.")

  private List<PromotionTemplateValue> templateValues = new ArrayList<>();
 /**
   * Discount status based on the current time and start and end time of discount
   * @return discountStatus
  **/
  @JsonProperty("discount_status")
  public String getDiscountStatus() {
    if (discountStatus == null) {
      return null;
    }
    return discountStatus.value();
  }

  public void setDiscountStatus(DiscountStatusEnum discountStatus) {
    this.discountStatus = discountStatus;
  }

  public PromotionCreateRequest discountStatus(DiscountStatusEnum discountStatus) {
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

  public PromotionCreateRequest endTime(Integer endTime) {
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

  public PromotionCreateRequest externalId(String externalId) {
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

  public PromotionCreateRequest platformType(String platformType) {
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

  public PromotionCreateRequest promotionCode(String promotionCode) {
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

  public PromotionCreateRequest promotionCustomId(String promotionCustomId) {
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

  public PromotionCreateRequest promotionTitle(String promotionTitle) {
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

  public PromotionCreateRequest promotionType(PromotionType promotionType) {
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

  public PromotionCreateRequest startTime(Integer startTime) {
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

  public PromotionCreateRequest templateValues(List<PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
    return this;
  }

  public PromotionCreateRequest addTemplateValuesItem(PromotionTemplateValue templateValuesItem) {
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
    PromotionCreateRequest promotionCreateRequest = (PromotionCreateRequest) o;
    return Objects.equals(this.discountStatus, promotionCreateRequest.discountStatus) &&
        Objects.equals(this.endTime, promotionCreateRequest.endTime) &&
        Objects.equals(this.externalId, promotionCreateRequest.externalId) &&
        Objects.equals(this.platformType, promotionCreateRequest.platformType) &&
        Objects.equals(this.promotionCode, promotionCreateRequest.promotionCode) &&
        Objects.equals(this.promotionCustomId, promotionCreateRequest.promotionCustomId) &&
        Objects.equals(this.promotionTitle, promotionCreateRequest.promotionTitle) &&
        Objects.equals(this.promotionType, promotionCreateRequest.promotionType) &&
        Objects.equals(this.startTime, promotionCreateRequest.startTime) &&
        Objects.equals(this.templateValues, promotionCreateRequest.templateValues);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

