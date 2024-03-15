package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OptimizationGoalMetadataConversionTagV3GoalMetadata   {
  
  private OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows attributionWindows;


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
      return value;
    }
  }

  private ConversionEventEnum conversionEvent;
  private String conversionTagId;
  private String cpaGoalValueInMicroCurrency;
  private Boolean isRoasOptimized;


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
      return value;
    }
  }

  private LearningModeTypeEnum learningModeType;

  public OptimizationGoalMetadataConversionTagV3GoalMetadata () {

  }

  public OptimizationGoalMetadataConversionTagV3GoalMetadata (OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows attributionWindows, ConversionEventEnum conversionEvent, String conversionTagId, String cpaGoalValueInMicroCurrency, Boolean isRoasOptimized, LearningModeTypeEnum learningModeType) {
    this.attributionWindows = attributionWindows;
    this.conversionEvent = conversionEvent;
    this.conversionTagId = conversionTagId;
    this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
    this.isRoasOptimized = isRoasOptimized;
    this.learningModeType = learningModeType;
  }

    
  @JsonProperty("attribution_windows")
  public OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows getAttributionWindows() {
    return attributionWindows;
  }
  public void setAttributionWindows(OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows attributionWindows) {
    this.attributionWindows = attributionWindows;
  }

    
  @JsonProperty("conversion_event")
  public ConversionEventEnum getConversionEvent() {
    return conversionEvent;
  }
  public void setConversionEvent(ConversionEventEnum conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

    
  @JsonProperty("conversion_tag_id")
  public String getConversionTagId() {
    return conversionTagId;
  }
  public void setConversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
  }

    
  @JsonProperty("cpa_goal_value_in_micro_currency")
  public String getCpaGoalValueInMicroCurrency() {
    return cpaGoalValueInMicroCurrency;
  }
  public void setCpaGoalValueInMicroCurrency(String cpaGoalValueInMicroCurrency) {
    this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
  }

    
  @JsonProperty("is_roas_optimized")
  public Boolean getIsRoasOptimized() {
    return isRoasOptimized;
  }
  public void setIsRoasOptimized(Boolean isRoasOptimized) {
    this.isRoasOptimized = isRoasOptimized;
  }

    
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
