package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OptimizationGoalMetadataConversionTagV3GoalMetadata
 */

@JsonTypeName("OptimizationGoalMetadata_conversion_tag_v3_goal_metadata")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OptimizationGoalMetadataConversionTagV3GoalMetadata {

  private OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows attributionWindows;

  /**
   * Gets or Sets conversionEvent
   */
  public enum ConversionEventEnum {
    PAGE_VISIT("PAGE_VISIT"),
    
    SIGNUP("SIGNUP"),
    
    CHECKOUT("CHECKOUT"),
    
    CUSTOM("CUSTOM"),
    
    VIEW_CATEGORY("VIEW_CATEGORY"),
    
    SEARCH("SEARCH"),
    
    ADD_TO_CART("ADD_TO_CART"),
    
    WATCH_VIDEO("WATCH_VIDEO"),
    
    LEAD("LEAD"),
    
    APP_INSTALL("APP_INSTALL");

    private String value;

    ConversionEventEnum(String value) {
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
    public static ConversionEventEnum fromValue(String value) {
      for (ConversionEventEnum b : ConversionEventEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ConversionEventEnum conversionEvent;

  private String conversionTagId;

  private String cpaGoalValueInMicroCurrency;

  private JsonNullable<Boolean> isRoasOptimized = JsonNullable.<Boolean>undefined();

  /**
   * Conversion learning model type
   */
  public enum LearningModeTypeEnum {
    NOT_ACTIVE("NOT_ACTIVE"),
    
    ACTIVE("ACTIVE"),
    
    NULL("null");

    private String value;

    LearningModeTypeEnum(String value) {
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
    public static LearningModeTypeEnum fromValue(String value) {
      for (LearningModeTypeEnum b : LearningModeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private JsonNullable<LearningModeTypeEnum> learningModeType = JsonNullable.<LearningModeTypeEnum>undefined();

  public OptimizationGoalMetadataConversionTagV3GoalMetadata attributionWindows(OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows attributionWindows) {
    this.attributionWindows = attributionWindows;
    return this;
  }

  /**
   * Get attributionWindows
   * @return attributionWindows
  */
  @Valid 
  @Schema(name = "attribution_windows", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attribution_windows")
  public OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows getAttributionWindows() {
    return attributionWindows;
  }

  public void setAttributionWindows(OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows attributionWindows) {
    this.attributionWindows = attributionWindows;
  }

  public OptimizationGoalMetadataConversionTagV3GoalMetadata conversionEvent(ConversionEventEnum conversionEvent) {
    this.conversionEvent = conversionEvent;
    return this;
  }

  /**
   * Get conversionEvent
   * @return conversionEvent
  */
  
  @Schema(name = "conversion_event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversion_event")
  public ConversionEventEnum getConversionEvent() {
    return conversionEvent;
  }

  public void setConversionEvent(ConversionEventEnum conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

  public OptimizationGoalMetadataConversionTagV3GoalMetadata conversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
    return this;
  }

  /**
   * Get conversionTagId
   * @return conversionTagId
  */
  @Pattern(regexp = "^[0-9]+$") 
  @Schema(name = "conversion_tag_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversion_tag_id")
  public String getConversionTagId() {
    return conversionTagId;
  }

  public void setConversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
  }

  public OptimizationGoalMetadataConversionTagV3GoalMetadata cpaGoalValueInMicroCurrency(String cpaGoalValueInMicroCurrency) {
    this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
    return this;
  }

  /**
   * Get cpaGoalValueInMicroCurrency
   * @return cpaGoalValueInMicroCurrency
  */
  @Pattern(regexp = "^[0-9]+$") 
  @Schema(name = "cpa_goal_value_in_micro_currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cpa_goal_value_in_micro_currency")
  public String getCpaGoalValueInMicroCurrency() {
    return cpaGoalValueInMicroCurrency;
  }

  public void setCpaGoalValueInMicroCurrency(String cpaGoalValueInMicroCurrency) {
    this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
  }

  public OptimizationGoalMetadataConversionTagV3GoalMetadata isRoasOptimized(Boolean isRoasOptimized) {
    this.isRoasOptimized = JsonNullable.of(isRoasOptimized);
    return this;
  }

  /**
   * Ad group is ROAS optimized
   * @return isRoasOptimized
  */
  
  @Schema(name = "is_roas_optimized", description = "Ad group is ROAS optimized", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_roas_optimized")
  public JsonNullable<Boolean> getIsRoasOptimized() {
    return isRoasOptimized;
  }

  public void setIsRoasOptimized(JsonNullable<Boolean> isRoasOptimized) {
    this.isRoasOptimized = isRoasOptimized;
  }

  public OptimizationGoalMetadataConversionTagV3GoalMetadata learningModeType(LearningModeTypeEnum learningModeType) {
    this.learningModeType = JsonNullable.of(learningModeType);
    return this;
  }

  /**
   * Conversion learning model type
   * @return learningModeType
  */
  
  @Schema(name = "learning_mode_type", example = "ACTIVE", description = "Conversion learning model type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("learning_mode_type")
  public JsonNullable<LearningModeTypeEnum> getLearningModeType() {
    return learningModeType;
  }

  public void setLearningModeType(JsonNullable<LearningModeTypeEnum> learningModeType) {
    this.learningModeType = learningModeType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizationGoalMetadataConversionTagV3GoalMetadata optimizationGoalMetadataConversionTagV3GoalMetadata = (OptimizationGoalMetadataConversionTagV3GoalMetadata) o;
    return Objects.equals(this.attributionWindows, optimizationGoalMetadataConversionTagV3GoalMetadata.attributionWindows) &&
        Objects.equals(this.conversionEvent, optimizationGoalMetadataConversionTagV3GoalMetadata.conversionEvent) &&
        Objects.equals(this.conversionTagId, optimizationGoalMetadataConversionTagV3GoalMetadata.conversionTagId) &&
        Objects.equals(this.cpaGoalValueInMicroCurrency, optimizationGoalMetadataConversionTagV3GoalMetadata.cpaGoalValueInMicroCurrency) &&
        equalsNullable(this.isRoasOptimized, optimizationGoalMetadataConversionTagV3GoalMetadata.isRoasOptimized) &&
        equalsNullable(this.learningModeType, optimizationGoalMetadataConversionTagV3GoalMetadata.learningModeType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributionWindows, conversionEvent, conversionTagId, cpaGoalValueInMicroCurrency, hashCodeNullable(isRoasOptimized), hashCodeNullable(learningModeType));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizationGoalMetadataConversionTagV3GoalMetadata {\n");
    sb.append("    attributionWindows: ").append(toIndentedString(attributionWindows)).append("\n");
    sb.append("    conversionEvent: ").append(toIndentedString(conversionEvent)).append("\n");
    sb.append("    conversionTagId: ").append(toIndentedString(conversionTagId)).append("\n");
    sb.append("    cpaGoalValueInMicroCurrency: ").append(toIndentedString(cpaGoalValueInMicroCurrency)).append("\n");
    sb.append("    isRoasOptimized: ").append(toIndentedString(isRoasOptimized)).append("\n");
    sb.append("    learningModeType: ").append(toIndentedString(learningModeType)).append("\n");
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

