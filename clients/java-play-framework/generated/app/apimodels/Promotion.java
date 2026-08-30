package apimodels;

import apimodels.DiscountStatus;
import apimodels.EntityStatus;
import apimodels.PromotionTemplateValue;
import apimodels.PromotionType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Promotion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Promotion   {
  @JsonProperty("ad_account_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String adAccountId;

  @JsonProperty("discount_status")
  @Valid

  private DiscountStatus discountStatus;

  @JsonProperty("end_time")
  
  private Integer endTime;

  @JsonProperty("external_id")
  @Size(max=64)

  private String externalId;

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=18)

  private String id;

  @JsonProperty("platform_type")
  
  private String platformType;

  @JsonProperty("promotion_code")
  
  private String promotionCode;

  @JsonProperty("promotion_custom_id")
  @Size(max=50)

  private String promotionCustomId;

  @JsonProperty("promotion_title")
  @NotNull

  private String promotionTitle;

  @JsonProperty("promotion_type")
  @NotNull
@Valid

  private PromotionType promotionType;

  @JsonProperty("start_time")
  
  private Integer startTime;

  @JsonProperty("status")
  @Valid

  private EntityStatus status;

  @JsonProperty("template_values")
  @Size(min=0,max=2)
@Valid

  private List<@Valid PromotionTemplateValue> templateValues = null;

  public Promotion adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * The Ad Account ID that this promotion belongs to.
   * @return adAccountId
  **/
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public Promotion discountStatus(DiscountStatus discountStatus) {
    this.discountStatus = discountStatus;
    return this;
  }

   /**
   * Get discountStatus
   * @return discountStatus
  **/
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
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public Promotion status(EntityStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

