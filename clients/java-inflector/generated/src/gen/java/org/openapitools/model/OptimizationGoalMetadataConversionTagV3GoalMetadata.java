package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OptimizationGoalMetadataConversionTagV3GoalMetadata   {
  @JsonProperty("attribution_windows")
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConversionEventEnum fromValue(String text) {
      for (ConversionEventEnum b : ConversionEventEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("conversion_event")
  private ConversionEventEnum conversionEvent;

  @JsonProperty("conversion_tag_id")
  private String conversionTagId;

  @JsonProperty("cpa_goal_value_in_micro_currency")
  private String cpaGoalValueInMicroCurrency;

  @JsonProperty("is_roas_optimized")
  private Boolean isRoasOptimized;

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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LearningModeTypeEnum fromValue(String text) {
      for (LearningModeTypeEnum b : LearningModeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("learning_mode_type")
  private LearningModeTypeEnum learningModeType;

  /**
   **/
  public OptimizationGoalMetadataConversionTagV3GoalMetadata attributionWindows(OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows attributionWindows) {
    this.attributionWindows = attributionWindows;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("attribution_windows")
  public OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows getAttributionWindows() {
    return attributionWindows;
  }
  public void setAttributionWindows(OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows attributionWindows) {
    this.attributionWindows = attributionWindows;
  }

  /**
   **/
  public OptimizationGoalMetadataConversionTagV3GoalMetadata conversionEvent(ConversionEventEnum conversionEvent) {
    this.conversionEvent = conversionEvent;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("conversion_event")
  public ConversionEventEnum getConversionEvent() {
    return conversionEvent;
  }
  public void setConversionEvent(ConversionEventEnum conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

  /**
   **/
  public OptimizationGoalMetadataConversionTagV3GoalMetadata conversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("conversion_tag_id")
  public String getConversionTagId() {
    return conversionTagId;
  }
  public void setConversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
  }

  /**
   **/
  public OptimizationGoalMetadataConversionTagV3GoalMetadata cpaGoalValueInMicroCurrency(String cpaGoalValueInMicroCurrency) {
    this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cpa_goal_value_in_micro_currency")
  public String getCpaGoalValueInMicroCurrency() {
    return cpaGoalValueInMicroCurrency;
  }
  public void setCpaGoalValueInMicroCurrency(String cpaGoalValueInMicroCurrency) {
    this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
  }

  /**
   * Ad group is ROAS optimized
   **/
  public OptimizationGoalMetadataConversionTagV3GoalMetadata isRoasOptimized(Boolean isRoasOptimized) {
    this.isRoasOptimized = isRoasOptimized;
    return this;
  }

  
  @ApiModelProperty(value = "Ad group is ROAS optimized")
  @JsonProperty("is_roas_optimized")
  public Boolean getIsRoasOptimized() {
    return isRoasOptimized;
  }
  public void setIsRoasOptimized(Boolean isRoasOptimized) {
    this.isRoasOptimized = isRoasOptimized;
  }

  /**
   * Conversion learning model type
   **/
  public OptimizationGoalMetadataConversionTagV3GoalMetadata learningModeType(LearningModeTypeEnum learningModeType) {
    this.learningModeType = learningModeType;
    return this;
  }

  
  @ApiModelProperty(example = "ACTIVE", value = "Conversion learning model type")
  @JsonProperty("learning_mode_type")
  public LearningModeTypeEnum getLearningModeType() {
    return learningModeType;
  }
  public void setLearningModeType(LearningModeTypeEnum learningModeType) {
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
    return Objects.equals(attributionWindows, optimizationGoalMetadataConversionTagV3GoalMetadata.attributionWindows) &&
        Objects.equals(conversionEvent, optimizationGoalMetadataConversionTagV3GoalMetadata.conversionEvent) &&
        Objects.equals(conversionTagId, optimizationGoalMetadataConversionTagV3GoalMetadata.conversionTagId) &&
        Objects.equals(cpaGoalValueInMicroCurrency, optimizationGoalMetadataConversionTagV3GoalMetadata.cpaGoalValueInMicroCurrency) &&
        Objects.equals(isRoasOptimized, optimizationGoalMetadataConversionTagV3GoalMetadata.isRoasOptimized) &&
        Objects.equals(learningModeType, optimizationGoalMetadataConversionTagV3GoalMetadata.learningModeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributionWindows, conversionEvent, conversionTagId, cpaGoalValueInMicroCurrency, isRoasOptimized, learningModeType);
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

