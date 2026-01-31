package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PromotionTemplateValue;
import org.openapitools.model.PromotionType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PromotionResponse  {
  
public enum DiscountStatusEnum {

    @JsonProperty("OTHER") OTHER(String.valueOf("OTHER")),
    @JsonProperty("ACTIVE") ACTIVE(String.valueOf("ACTIVE")),
    @JsonProperty("PAUSED") PAUSED(String.valueOf("PAUSED")),
    @JsonProperty("SCHEDULED") SCHEDULED(String.valueOf("SCHEDULED")),
    @JsonProperty("EXPIRED") EXPIRED(String.valueOf("EXPIRED"));

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
  @ApiModelProperty(example = "Black Friday 10% off", value = "Internal name for the promotion.")
  private String promotionTitle;

  @ApiModelProperty(value = "")
  @Valid
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
  @Valid
  private List<@Valid PromotionTemplateValue> templateValues = new ArrayList<>();

 /**
  * The Ad Account ID that this promotion belongs to.
  */
  @ApiModelProperty(example = "549755885175", value = "The Ad Account ID that this promotion belongs to.")
  private String adAccountId;

 /**
  * Promotion ID
  */
  @ApiModelProperty(example = "7834020347906", value = "Promotion ID")
  private String id;

  @ApiModelProperty(value = "")
  @Valid
  private EntityStatus status;
 /**
  * Discount status based on the current time and start and end time of discount
  * @return discountStatus
  */
  @JsonProperty("discount_status")
  public String getDiscountStatus() {
    return discountStatus == null ? null : discountStatus.value();
  }

  /**
   * Sets the <code>discountStatus</code> property.
   */
 public void setDiscountStatus(DiscountStatusEnum discountStatus) {
    this.discountStatus = discountStatus;
  }

  /**
   * Sets the <code>discountStatus</code> property.
   */
  public PromotionResponse discountStatus(DiscountStatusEnum discountStatus) {
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
  public PromotionResponse endTime(Integer endTime) {
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
  public PromotionResponse externalId(String externalId) {
    this.externalId = externalId;
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
  public PromotionResponse platformType(String platformType) {
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
  public PromotionResponse promotionCode(String promotionCode) {
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
  public PromotionResponse promotionCustomId(String promotionCustomId) {
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
  public PromotionResponse promotionTitle(String promotionTitle) {
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
  public PromotionResponse promotionType(PromotionType promotionType) {
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
  public PromotionResponse startTime(Integer startTime) {
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
  public PromotionResponse templateValues(List<@Valid PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
    return this;
  }

  /**
   * Adds a new item to the <code>templateValues</code> list.
   */
  public PromotionResponse addTemplateValuesItem(PromotionTemplateValue templateValuesItem) {
    this.templateValues.add(templateValuesItem);
    return this;
  }

 /**
  * The Ad Account ID that this promotion belongs to.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
  public PromotionResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * Promotion ID
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
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
  public PromotionResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public PromotionResponse status(EntityStatus status) {
    this.status = status;
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
    PromotionResponse promotionResponse = (PromotionResponse) o;
    return Objects.equals(this.discountStatus, promotionResponse.discountStatus) &&
        Objects.equals(this.endTime, promotionResponse.endTime) &&
        Objects.equals(this.externalId, promotionResponse.externalId) &&
        Objects.equals(this.platformType, promotionResponse.platformType) &&
        Objects.equals(this.promotionCode, promotionResponse.promotionCode) &&
        Objects.equals(this.promotionCustomId, promotionResponse.promotionCustomId) &&
        Objects.equals(this.promotionTitle, promotionResponse.promotionTitle) &&
        Objects.equals(this.promotionType, promotionResponse.promotionType) &&
        Objects.equals(this.startTime, promotionResponse.startTime) &&
        Objects.equals(this.templateValues, promotionResponse.templateValues) &&
        Objects.equals(this.adAccountId, promotionResponse.adAccountId) &&
        Objects.equals(this.id, promotionResponse.id) &&
        Objects.equals(this.status, promotionResponse.status);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

