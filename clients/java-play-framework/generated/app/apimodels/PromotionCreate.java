package apimodels;

import apimodels.DiscountStatus;
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
 * Resource create operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PromotionCreate   {
  @JsonProperty("discount_status")
  @Valid

  private DiscountStatus discountStatus;

  @JsonProperty("end_time")
  
  private Integer endTime;

  @JsonProperty("external_id")
  @Size(max=64)

  private String externalId;

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

  @JsonProperty("template_values")
  @Size(min=0,max=2)
@Valid

  private List<@Valid PromotionTemplateValue> templateValues = null;

  public PromotionCreate discountStatus(DiscountStatus discountStatus) {
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

  public PromotionCreate endTime(Integer endTime) {
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

  public PromotionCreate externalId(String externalId) {
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

  public PromotionCreate platformType(String platformType) {
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

  public PromotionCreate promotionCode(String promotionCode) {
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

  public PromotionCreate promotionCustomId(String promotionCustomId) {
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

  public PromotionCreate promotionTitle(String promotionTitle) {
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

  public PromotionCreate promotionType(PromotionType promotionType) {
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

  public PromotionCreate startTime(Integer startTime) {
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

  public PromotionCreate templateValues(List<@Valid PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
    return this;
  }

  public PromotionCreate addTemplateValuesItem(PromotionTemplateValue templateValuesItem) {
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
    PromotionCreate promotionCreate = (PromotionCreate) o;
    return Objects.equals(discountStatus, promotionCreate.discountStatus) &&
        Objects.equals(endTime, promotionCreate.endTime) &&
        Objects.equals(externalId, promotionCreate.externalId) &&
        Objects.equals(platformType, promotionCreate.platformType) &&
        Objects.equals(promotionCode, promotionCreate.promotionCode) &&
        Objects.equals(promotionCustomId, promotionCreate.promotionCustomId) &&
        Objects.equals(promotionTitle, promotionCreate.promotionTitle) &&
        Objects.equals(promotionType, promotionCreate.promotionType) &&
        Objects.equals(startTime, promotionCreate.startTime) &&
        Objects.equals(templateValues, promotionCreate.templateValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountStatus, endTime, externalId, platformType, promotionCode, promotionCustomId, promotionTitle, promotionType, startTime, templateValues);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

