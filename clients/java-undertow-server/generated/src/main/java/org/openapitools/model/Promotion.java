/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
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
import org.openapitools.model.DiscountStatus;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PromotionTemplateValue;
import org.openapitools.model.PromotionType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class Promotion   {
  
  private String adAccountId;
  private DiscountStatus discountStatus;
  private Integer endTime;
  private String externalId;
  private String id;
  private String platformType;
  private String promotionCode;
  private String promotionCustomId;
  private String promotionTitle;
  private PromotionType promotionType;
  private Integer startTime;
  private EntityStatus status;
  private List<PromotionTemplateValue> templateValues = new ArrayList<>();

  /**
   * The Ad Account ID that this promotion belongs to.
   */
  public Promotion adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Ad Account ID that this promotion belongs to.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   */
  public Promotion discountStatus(DiscountStatus discountStatus) {
    this.discountStatus = discountStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("discount_status")
  public DiscountStatus getDiscountStatus() {
    return discountStatus;
  }
  public void setDiscountStatus(DiscountStatus discountStatus) {
    this.discountStatus = discountStatus;
  }

  /**
   * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
   */
  public Promotion endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(value = "Promotion end time. Unix timestamp in seconds. Independent of campaign end time.")
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
  public Promotion externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  
  @ApiModelProperty(value = "Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.")
  @JsonProperty("external_id")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * Promotion ID
   */
  public Promotion id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Promotion ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
   */
  public Promotion platformType(String platformType) {
    this.platformType = platformType;
    return this;
  }

  
  @ApiModelProperty(value = "The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.")
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
  public Promotion promotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
    return this;
  }

  
  @ApiModelProperty(value = "Code that can be used to redeem a promotion.")
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
  public Promotion promotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
    return this;
  }

  
  @ApiModelProperty(value = "An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.")
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
  public Promotion promotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Internal name for the promotion.")
  @JsonProperty("promotion_title")
  public String getPromotionTitle() {
    return promotionTitle;
  }
  public void setPromotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
  }

  /**
   */
  public Promotion promotionType(PromotionType promotionType) {
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
  public Promotion startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(value = "Promotion start time. Unix timestamp in seconds. Independent of campaign start time.")
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }
  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  /**
   */
  public Promotion status(EntityStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * List of values to be inserted in the promotion type-specific template.
   */
  public Promotion templateValues(List<PromotionTemplateValue> templateValues) {
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
    Promotion promotion = (Promotion) o;
    return Objects.equals(adAccountId, promotion.adAccountId) &&
        Objects.equals(discountStatus, promotion.discountStatus) &&
        Objects.equals(endTime, promotion.endTime) &&
        Objects.equals(externalId, promotion.externalId) &&
        Objects.equals(id, promotion.id) &&
        Objects.equals(platformType, promotion.platformType) &&
        Objects.equals(promotionCode, promotion.promotionCode) &&
        Objects.equals(promotionCustomId, promotion.promotionCustomId) &&
        Objects.equals(promotionTitle, promotion.promotionTitle) &&
        Objects.equals(promotionType, promotion.promotionType) &&
        Objects.equals(startTime, promotion.startTime) &&
        Objects.equals(status, promotion.status) &&
        Objects.equals(templateValues, promotion.templateValues);
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

