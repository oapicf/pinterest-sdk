package org.openapitools.model;

import org.openapitools.model.DiscountStatus;
import org.openapitools.model.EntityStatus;
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

public class Promotion implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The Ad Account ID that this promotion belongs to.
   */
  @JsonProperty("ad_account_id")
  private String adAccountId;

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
   * Promotion ID
   */
  @JsonProperty("id")
  private String id;

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

  @JsonProperty("status")
  private EntityStatus status;

  /**
   * List of values to be inserted in the promotion type-specific template.
   */
  @JsonProperty("template_values")
  private List<PromotionTemplateValue> templateValues = new ArrayList<>();

  /**
   * The Ad Account ID that this promotion belongs to.
   * @return adAccountId
   */
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

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
   * Promotion ID
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
   * 
   * @return status
   */
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
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
