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
import org.openapitools.model.DiscountStatus;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PromotionTemplateValue;
import org.openapitools.model.PromotionType;

/**
 * Promotion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class Promotion   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("discount_status")
  private DiscountStatus discountStatus;

  @JsonProperty("end_time")
  private Integer endTime;

  @JsonProperty("external_id")
  private String externalId;

  @JsonProperty("id")
  private String id;

  @JsonProperty("platform_type")
  private String platformType;

  @JsonProperty("promotion_code")
  private String promotionCode;

  @JsonProperty("promotion_custom_id")
  private String promotionCustomId;

  @JsonProperty("promotion_title")
  private String promotionTitle;

  @JsonProperty("promotion_type")
  private PromotionType promotionType;

  @JsonProperty("start_time")
  private Integer startTime;

  @JsonProperty("status")
  private EntityStatus status;

  @JsonProperty("template_values")
  private List<@Valid PromotionTemplateValue> templateValues = null;

   /**
   * The Ad Account ID that this promotion belongs to.
   * @return adAccountId
  **/
  @ApiModelProperty(required = true, value = "The Ad Account ID that this promotion belongs to.")
  public String getAdAccountId() {
    return adAccountId;
  }

  public Promotion discountStatus(DiscountStatus discountStatus) {
    this.discountStatus = discountStatus;
    return this;
  }

   /**
   * Get discountStatus
   * @return discountStatus
  **/
  @ApiModelProperty(value = "")
  public DiscountStatus getDiscountStatus() {
    return discountStatus;
  }

  public void setDiscountStatus(DiscountStatus discountStatus) {
    this.discountStatus = discountStatus;
  }

  public Promotion endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
   * @return endTime
  **/
  @ApiModelProperty(value = "Promotion end time. Unix timestamp in seconds. Independent of campaign end time.")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public Promotion externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
   * @return externalId
  **/
  @ApiModelProperty(value = "Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public Promotion id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Promotion ID
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Promotion ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Promotion platformType(String platformType) {
    this.platformType = platformType;
    return this;
  }

   /**
   * The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
   * @return platformType
  **/
  @ApiModelProperty(value = "The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.")
  public String getPlatformType() {
    return platformType;
  }

  public void setPlatformType(String platformType) {
    this.platformType = platformType;
  }

  public Promotion promotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
    return this;
  }

   /**
   * Code that can be used to redeem a promotion.
   * @return promotionCode
  **/
  @ApiModelProperty(value = "Code that can be used to redeem a promotion.")
  public String getPromotionCode() {
    return promotionCode;
  }

  public void setPromotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
  }

  public Promotion promotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
    return this;
  }

   /**
   * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
   * @return promotionCustomId
  **/
  @ApiModelProperty(value = "An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.")
  public String getPromotionCustomId() {
    return promotionCustomId;
  }

  public void setPromotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
  }

  public Promotion promotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
    return this;
  }

   /**
   * Internal name for the promotion.
   * @return promotionTitle
  **/
  @ApiModelProperty(required = true, value = "Internal name for the promotion.")
  public String getPromotionTitle() {
    return promotionTitle;
  }

  public void setPromotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
  }

  public Promotion promotionType(PromotionType promotionType) {
    this.promotionType = promotionType;
    return this;
  }

   /**
   * Get promotionType
   * @return promotionType
  **/
  @ApiModelProperty(required = true, value = "")
  public PromotionType getPromotionType() {
    return promotionType;
  }

  public void setPromotionType(PromotionType promotionType) {
    this.promotionType = promotionType;
  }

  public Promotion startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
   * @return startTime
  **/
  @ApiModelProperty(value = "Promotion start time. Unix timestamp in seconds. Independent of campaign start time.")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public EntityStatus getStatus() {
    return status;
  }

  public Promotion templateValues(List<@Valid PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
    return this;
  }

  public Promotion addTemplateValuesItem(PromotionTemplateValue templateValuesItem) {
    if (this.templateValues == null) {
      this.templateValues = new ArrayList<>();
    }
    this.templateValues.add(templateValuesItem);
    return this;
  }

   /**
   * List of values to be inserted in the promotion type-specific template.
   * @return templateValues
  **/
  @ApiModelProperty(value = "List of values to be inserted in the promotion type-specific template.")
  public List<@Valid PromotionTemplateValue> getTemplateValues() {
    return templateValues;
  }

  public void setTemplateValues(List<@Valid PromotionTemplateValue> templateValues) {
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
    Promotion promotion = (Promotion) o;
    return Objects.equals(this.adAccountId, promotion.adAccountId) &&
        Objects.equals(this.discountStatus, promotion.discountStatus) &&
        Objects.equals(this.endTime, promotion.endTime) &&
        Objects.equals(this.externalId, promotion.externalId) &&
        Objects.equals(this.id, promotion.id) &&
        Objects.equals(this.platformType, promotion.platformType) &&
        Objects.equals(this.promotionCode, promotion.promotionCode) &&
        Objects.equals(this.promotionCustomId, promotion.promotionCustomId) &&
        Objects.equals(this.promotionTitle, promotion.promotionTitle) &&
        Objects.equals(this.promotionType, promotion.promotionType) &&
        Objects.equals(this.startTime, promotion.startTime) &&
        Objects.equals(this.status, promotion.status) &&
        Objects.equals(this.templateValues, promotion.templateValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, discountStatus, endTime, externalId, id, platformType, promotionCode, promotionCustomId, promotionTitle, promotionType, startTime, status, templateValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Promotion {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
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
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

