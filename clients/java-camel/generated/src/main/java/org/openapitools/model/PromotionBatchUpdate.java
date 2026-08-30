package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DiscountStatus;
import org.openapitools.model.PromotionTemplateValue;
import org.openapitools.model.PromotionType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PromotionBatchUpdate
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PromotionBatchUpdate {

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

  @Valid
  private List<@Valid PromotionTemplateValue> templateValues = new ArrayList<>();

  public PromotionBatchUpdate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PromotionBatchUpdate(String id) {
    this.id = id;
  }

  public PromotionBatchUpdate discountStatus(DiscountStatus discountStatus) {
    this.discountStatus = discountStatus;
    return this;
  }

  /**
   * Get discountStatus
   * @return discountStatus
   */
  @Valid 
  @Schema(name = "discount_status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discount_status")
  public DiscountStatus getDiscountStatus() {
    return discountStatus;
  }

  public void setDiscountStatus(DiscountStatus discountStatus) {
    this.discountStatus = discountStatus;
  }

  public PromotionBatchUpdate endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
   * @return endTime
   */
  
  @Schema(name = "end_time", description = "Promotion end time. Unix timestamp in seconds. Independent of campaign end time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_time")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public PromotionBatchUpdate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
   * @return externalId
   */
  @Size(max = 64) 
  @Schema(name = "external_id", description = "Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("external_id")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public PromotionBatchUpdate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Promotion ID
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 18) 
  @Schema(name = "id", description = "Promotion ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PromotionBatchUpdate platformType(String platformType) {
    this.platformType = platformType;
    return this;
  }

  /**
   * The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
   * @return platformType
   */
  
  @Schema(name = "platform_type", description = "The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platform_type")
  public String getPlatformType() {
    return platformType;
  }

  public void setPlatformType(String platformType) {
    this.platformType = platformType;
  }

  public PromotionBatchUpdate promotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
    return this;
  }

  /**
   * Code that can be used to redeem a promotion.
   * @return promotionCode
   */
  
  @Schema(name = "promotion_code", description = "Code that can be used to redeem a promotion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promotion_code")
  public String getPromotionCode() {
    return promotionCode;
  }

  public void setPromotionCode(String promotionCode) {
    this.promotionCode = promotionCode;
  }

  public PromotionBatchUpdate promotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
    return this;
  }

  /**
   * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
   * @return promotionCustomId
   */
  @Size(max = 50) 
  @Schema(name = "promotion_custom_id", description = "An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promotion_custom_id")
  public String getPromotionCustomId() {
    return promotionCustomId;
  }

  public void setPromotionCustomId(String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
  }

  public PromotionBatchUpdate promotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
    return this;
  }

  /**
   * Internal name for the promotion.
   * @return promotionTitle
   */
  
  @Schema(name = "promotion_title", description = "Internal name for the promotion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promotion_title")
  public String getPromotionTitle() {
    return promotionTitle;
  }

  public void setPromotionTitle(String promotionTitle) {
    this.promotionTitle = promotionTitle;
  }

  public PromotionBatchUpdate promotionType(PromotionType promotionType) {
    this.promotionType = promotionType;
    return this;
  }

  /**
   * Get promotionType
   * @return promotionType
   */
  @Valid 
  @Schema(name = "promotion_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promotion_type")
  public PromotionType getPromotionType() {
    return promotionType;
  }

  public void setPromotionType(PromotionType promotionType) {
    this.promotionType = promotionType;
  }

  public PromotionBatchUpdate startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
   * @return startTime
   */
  
  @Schema(name = "start_time", description = "Promotion start time. Unix timestamp in seconds. Independent of campaign start time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_time")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public PromotionBatchUpdate templateValues(List<@Valid PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
    return this;
  }

  public PromotionBatchUpdate addTemplateValuesItem(PromotionTemplateValue templateValuesItem) {
    if (this.templateValues == null) {
      this.templateValues = new ArrayList<>();
    }
    this.templateValues.add(templateValuesItem);
    return this;
  }

  /**
   * List of values to be inserted in the promotion type-specific template.
   * @return templateValues
   */
  @Valid @Size(min = 0, max = 2) 
  @Schema(name = "template_values", description = "List of values to be inserted in the promotion type-specific template.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("template_values")
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
    PromotionBatchUpdate promotionBatchUpdate = (PromotionBatchUpdate) o;
    return Objects.equals(this.discountStatus, promotionBatchUpdate.discountStatus) &&
        Objects.equals(this.endTime, promotionBatchUpdate.endTime) &&
        Objects.equals(this.externalId, promotionBatchUpdate.externalId) &&
        Objects.equals(this.id, promotionBatchUpdate.id) &&
        Objects.equals(this.platformType, promotionBatchUpdate.platformType) &&
        Objects.equals(this.promotionCode, promotionBatchUpdate.promotionCode) &&
        Objects.equals(this.promotionCustomId, promotionBatchUpdate.promotionCustomId) &&
        Objects.equals(this.promotionTitle, promotionBatchUpdate.promotionTitle) &&
        Objects.equals(this.promotionType, promotionBatchUpdate.promotionType) &&
        Objects.equals(this.startTime, promotionBatchUpdate.startTime) &&
        Objects.equals(this.templateValues, promotionBatchUpdate.templateValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountStatus, endTime, externalId, id, platformType, promotionCode, promotionCustomId, promotionTitle, promotionType, startTime, templateValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionBatchUpdate {\n");
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

