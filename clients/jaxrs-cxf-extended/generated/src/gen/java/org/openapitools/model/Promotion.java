package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DiscountStatus;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PromotionTemplateValue;
import org.openapitools.model.PromotionType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Promotion  {
  
 /**
  * The Ad Account ID that this promotion belongs to.
  */
  @ApiModelProperty(required = true, value = "The Ad Account ID that this promotion belongs to.")
  private String adAccountId;

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
  @ApiModelProperty(required = true, value = "Internal name for the promotion.")
  private String promotionTitle;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PromotionType promotionType;

 /**
  * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
  */
  @ApiModelProperty(value = "Promotion start time. Unix timestamp in seconds. Independent of campaign start time.")
  private Integer startTime;

  @ApiModelProperty(value = "")
  @Valid
  private EntityStatus status;

 /**
  * List of values to be inserted in the promotion type-specific template.
  */
  @ApiModelProperty(value = "List of values to be inserted in the promotion type-specific template.")
  @Valid
  private List<@Valid PromotionTemplateValue> templateValues = new ArrayList<>();
 /**
  * The Ad Account ID that this promotion belongs to.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   * <br><em>N.B. <code>adAccountId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   * <br><em>N.B. <code>adAccountId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Promotion adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

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
  public Promotion discountStatus(DiscountStatus discountStatus) {
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
  public Promotion endTime(Integer endTime) {
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
  public Promotion externalId(String externalId) {
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
  public Promotion id(String id) {
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
  public Promotion platformType(String platformType) {
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
  public Promotion promotionCode(String promotionCode) {
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
  public Promotion promotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
    return this;
  }

 /**
  * Internal name for the promotion.
  * @return promotionTitle
  */
  @JsonProperty("promotion_title")
  @NotNull
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
  public Promotion promotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
    return this;
  }

 /**
  * Get promotionType
  * @return promotionType
  */
  @JsonProperty("promotion_type")
  @NotNull
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
  public Promotion promotionType(PromotionType promotionType) {
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
  public Promotion startTime(Integer startTime) {
    this.startTime = startTime;
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
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Promotion status(EntityStatus status) {
    this.status = status;
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
  public Promotion templateValues(List<@Valid PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
    return this;
  }

  /**
   * Adds a new item to the <code>templateValues</code> list.
   */
  public Promotion addTemplateValuesItem(PromotionTemplateValue templateValuesItem) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

