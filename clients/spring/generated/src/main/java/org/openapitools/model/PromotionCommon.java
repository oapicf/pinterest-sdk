package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PromotionTemplateValue;
import org.openapitools.model.PromotionType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PromotionCommon
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PromotionCommon {

  /**
   * Discount status based on the current time and start and end time of discount
   */
  public enum DiscountStatusEnum {
    OTHER("OTHER"),
    
    ACTIVE("ACTIVE"),
    
    PAUSED("PAUSED"),
    
    SCHEDULED("SCHEDULED"),
    
    EXPIRED("EXPIRED");

    private final String value;

    DiscountStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DiscountStatusEnum fromValue(String value) {
      for (DiscountStatusEnum b : DiscountStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable DiscountStatusEnum discountStatus;

  private @Nullable Integer endTime;

  private @Nullable String externalId;

  private @Nullable String platformType;

  private @Nullable String promotionCode;

  private @Nullable String promotionCustomId;

  private @Nullable String promotionTitle;

  private @Nullable PromotionType promotionType;

  private @Nullable Integer startTime;

  @Valid
  private List<@Valid PromotionTemplateValue> templateValues = new ArrayList<>();

  public PromotionCommon discountStatus(@Nullable DiscountStatusEnum discountStatus) {
    this.discountStatus = discountStatus;
    return this;
  }

  /**
   * Discount status based on the current time and start and end time of discount
   * @return discountStatus
   */
  
  @Schema(name = "discount_status", example = "ACTIVE", description = "Discount status based on the current time and start and end time of discount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discount_status")
  public @Nullable DiscountStatusEnum getDiscountStatus() {
    return discountStatus;
  }

  public void setDiscountStatus(@Nullable DiscountStatusEnum discountStatus) {
    this.discountStatus = discountStatus;
  }

  public PromotionCommon endTime(@Nullable Integer endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
   * @return endTime
   */
  
  @Schema(name = "end_time", example = "1678003860", description = "Promotion end time. Unix timestamp in seconds. Independent of campaign end time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_time")
  public @Nullable Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(@Nullable Integer endTime) {
    this.endTime = endTime;
  }

  public PromotionCommon externalId(@Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
   * @return externalId
   */
  @Size(max = 64) 
  @Schema(name = "external_id", example = "abc", description = "Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("external_id")
  public @Nullable String getExternalId() {
    return externalId;
  }

  public void setExternalId(@Nullable String externalId) {
    this.externalId = externalId;
  }

  public PromotionCommon platformType(@Nullable String platformType) {
    this.platformType = platformType;
    return this;
  }

  /**
   * The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
   * @return platformType
   */
  
  @Schema(name = "platform_type", example = "DEFAULT", description = "The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platform_type")
  public @Nullable String getPlatformType() {
    return platformType;
  }

  public void setPlatformType(@Nullable String platformType) {
    this.platformType = platformType;
  }

  public PromotionCommon promotionCode(@Nullable String promotionCode) {
    this.promotionCode = promotionCode;
    return this;
  }

  /**
   * Code that can be used to redeem a promotion.
   * @return promotionCode
   */
  
  @Schema(name = "promotion_code", example = "blackfriday10", description = "Code that can be used to redeem a promotion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promotion_code")
  public @Nullable String getPromotionCode() {
    return promotionCode;
  }

  public void setPromotionCode(@Nullable String promotionCode) {
    this.promotionCode = promotionCode;
  }

  public PromotionCommon promotionCustomId(@Nullable String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
    return this;
  }

  /**
   * An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
   * @return promotionCustomId
   */
  @Size(max = 50) 
  @Schema(name = "promotion_custom_id", example = "freeshipping_2025", description = "An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promotion_custom_id")
  public @Nullable String getPromotionCustomId() {
    return promotionCustomId;
  }

  public void setPromotionCustomId(@Nullable String promotionCustomId) {
    this.promotionCustomId = promotionCustomId;
  }

  public PromotionCommon promotionTitle(@Nullable String promotionTitle) {
    this.promotionTitle = promotionTitle;
    return this;
  }

  /**
   * Internal name for the promotion.
   * @return promotionTitle
   */
  
  @Schema(name = "promotion_title", example = "Black Friday 10% off", description = "Internal name for the promotion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promotion_title")
  public @Nullable String getPromotionTitle() {
    return promotionTitle;
  }

  public void setPromotionTitle(@Nullable String promotionTitle) {
    this.promotionTitle = promotionTitle;
  }

  public PromotionCommon promotionType(@Nullable PromotionType promotionType) {
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
  public @Nullable PromotionType getPromotionType() {
    return promotionType;
  }

  public void setPromotionType(@Nullable PromotionType promotionType) {
    this.promotionType = promotionType;
  }

  public PromotionCommon startTime(@Nullable Integer startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
   * @return startTime
   */
  
  @Schema(name = "start_time", example = "1677003860", description = "Promotion start time. Unix timestamp in seconds. Independent of campaign start time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_time")
  public @Nullable Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(@Nullable Integer startTime) {
    this.startTime = startTime;
  }

  public PromotionCommon templateValues(List<@Valid PromotionTemplateValue> templateValues) {
    this.templateValues = templateValues;
    return this;
  }

  public PromotionCommon addTemplateValuesItem(PromotionTemplateValue templateValuesItem) {
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
    PromotionCommon promotionCommon = (PromotionCommon) o;
    return Objects.equals(this.discountStatus, promotionCommon.discountStatus) &&
        Objects.equals(this.endTime, promotionCommon.endTime) &&
        Objects.equals(this.externalId, promotionCommon.externalId) &&
        Objects.equals(this.platformType, promotionCommon.platformType) &&
        Objects.equals(this.promotionCode, promotionCommon.promotionCode) &&
        Objects.equals(this.promotionCustomId, promotionCommon.promotionCustomId) &&
        Objects.equals(this.promotionTitle, promotionCommon.promotionTitle) &&
        Objects.equals(this.promotionType, promotionCommon.promotionType) &&
        Objects.equals(this.startTime, promotionCommon.startTime) &&
        Objects.equals(this.templateValues, promotionCommon.templateValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountStatus, endTime, externalId, platformType, promotionCode, promotionCustomId, promotionTitle, promotionType, startTime, templateValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionCommon {\n");
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

