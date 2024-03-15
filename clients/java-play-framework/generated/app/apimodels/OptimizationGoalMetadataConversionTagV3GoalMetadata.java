package apimodels;

import apimodels.OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OptimizationGoalMetadataConversionTagV3GoalMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OptimizationGoalMetadataConversionTagV3GoalMetadata   {
  @JsonProperty("attribution_windows")
  @Valid

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

    private final String value;

    ConversionEventEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("conversion_event")
  
  private ConversionEventEnum conversionEvent;

  @JsonProperty("conversion_tag_id")
  @Pattern(regexp="^[0-9]+$")

  private String conversionTagId;

  @JsonProperty("cpa_goal_value_in_micro_currency")
  @Pattern(regexp="^[0-9]+$")

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

    private final String value;

    LearningModeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("learning_mode_type")
  
  private LearningModeTypeEnum learningModeType;

  public OptimizationGoalMetadataConversionTagV3GoalMetadata attributionWindows(OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows attributionWindows) {
    this.attributionWindows = attributionWindows;
    return this;
  }

   /**
   * Get attributionWindows
   * @return attributionWindows
  **/
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
  **/
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
  **/
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
  **/
  public String getCpaGoalValueInMicroCurrency() {
    return cpaGoalValueInMicroCurrency;
  }

  public void setCpaGoalValueInMicroCurrency(String cpaGoalValueInMicroCurrency) {
    this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
  }

  public OptimizationGoalMetadataConversionTagV3GoalMetadata isRoasOptimized(Boolean isRoasOptimized) {
    this.isRoasOptimized = isRoasOptimized;
    return this;
  }

   /**
   * Ad group is ROAS optimized
   * @return isRoasOptimized
  **/
  public Boolean getIsRoasOptimized() {
    return isRoasOptimized;
  }

  public void setIsRoasOptimized(Boolean isRoasOptimized) {
    this.isRoasOptimized = isRoasOptimized;
  }

  public OptimizationGoalMetadataConversionTagV3GoalMetadata learningModeType(LearningModeTypeEnum learningModeType) {
    this.learningModeType = learningModeType;
    return this;
  }

   /**
   * Conversion learning model type
   * @return learningModeType
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

