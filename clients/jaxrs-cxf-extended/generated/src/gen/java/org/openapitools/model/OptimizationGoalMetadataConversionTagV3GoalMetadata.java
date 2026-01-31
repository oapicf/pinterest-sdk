package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OptimizationGoalMetadataConversionTagV3GoalMetadata  {
  
  @ApiModelProperty(value = "")
  @Valid
  private OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows attributionWindows;

public enum ConversionEventEnum {

    @JsonProperty("PAGE_VISIT") PAGE_VISIT(String.valueOf("PAGE_VISIT")),
    @JsonProperty("SIGNUP") SIGNUP(String.valueOf("SIGNUP")),
    @JsonProperty("CHECKOUT") CHECKOUT(String.valueOf("CHECKOUT")),
    @JsonProperty("CUSTOM") CUSTOM(String.valueOf("CUSTOM")),
    @JsonProperty("VIEW_CATEGORY") VIEW_CATEGORY(String.valueOf("VIEW_CATEGORY")),
    @JsonProperty("SEARCH") SEARCH(String.valueOf("SEARCH")),
    @JsonProperty("ADD_TO_CART") ADD_TO_CART(String.valueOf("ADD_TO_CART")),
    @JsonProperty("WATCH_VIDEO") WATCH_VIDEO(String.valueOf("WATCH_VIDEO")),
    @JsonProperty("LEAD") LEAD(String.valueOf("LEAD")),
    @JsonProperty("APP_INSTALL") APP_INSTALL(String.valueOf("APP_INSTALL"));

    private String value;

    ConversionEventEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConversionEventEnum fromValue(String value) {
        for (ConversionEventEnum b : ConversionEventEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")
  private ConversionEventEnum conversionEvent;

  @ApiModelProperty(value = "")
  private String conversionTagId;

  @ApiModelProperty(value = "")
  private String cpaGoalValueInMicroCurrency;

 /**
  * Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. <br>This parameter is not enabled for all advertisers. <a href=\"https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\">Learn more</a>.
  */
  @ApiModelProperty(value = "Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. <br>This parameter is not enabled for all advertisers. <a href=\"https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\">Learn more</a>.")
  private Boolean isRoasOptimized;

public enum LearningModeTypeEnum {

    @JsonProperty("NOT_ACTIVE") NOT_ACTIVE(String.valueOf("NOT_ACTIVE")),
    @JsonProperty("ACTIVE") ACTIVE(String.valueOf("ACTIVE"));

    private String value;

    LearningModeTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LearningModeTypeEnum fromValue(String value) {
        for (LearningModeTypeEnum b : LearningModeTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

 /**
  * Conversion learning model type
  */
  @ApiModelProperty(example = "ACTIVE", value = "Conversion learning model type")
  private LearningModeTypeEnum learningModeType;

 /**
  * Event name for custom or standard events mapped to an oCPM model
  */
  @ApiModelProperty(example = "INITIATE_CHECKOUT", value = "Event name for custom or standard events mapped to an oCPM model")
  private String reportingEvent;
 /**
  * Get attributionWindows
  * @return attributionWindows
  */
  @JsonProperty("attribution_windows")
  public OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows getAttributionWindows() {
    return attributionWindows;
  }

  /**
   * Sets the <code>attributionWindows</code> property.
   */
 public void setAttributionWindows(OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows attributionWindows) {
    this.attributionWindows = attributionWindows;
  }

  /**
   * Sets the <code>attributionWindows</code> property.
   */
  public OptimizationGoalMetadataConversionTagV3GoalMetadata attributionWindows(OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows attributionWindows) {
    this.attributionWindows = attributionWindows;
    return this;
  }

 /**
  * Get conversionEvent
  * @return conversionEvent
  */
  @JsonProperty("conversion_event")
  public String getConversionEvent() {
    return conversionEvent == null ? null : conversionEvent.value();
  }

  /**
   * Sets the <code>conversionEvent</code> property.
   */
 public void setConversionEvent(ConversionEventEnum conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

  /**
   * Sets the <code>conversionEvent</code> property.
   */
  public OptimizationGoalMetadataConversionTagV3GoalMetadata conversionEvent(ConversionEventEnum conversionEvent) {
    this.conversionEvent = conversionEvent;
    return this;
  }

 /**
  * Get conversionTagId
  * @return conversionTagId
  */
  @JsonProperty("conversion_tag_id")
 @Pattern(regexp="^[0-9]+$")  public String getConversionTagId() {
    return conversionTagId;
  }

  /**
   * Sets the <code>conversionTagId</code> property.
   */
 public void setConversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
  }

  /**
   * Sets the <code>conversionTagId</code> property.
   */
  public OptimizationGoalMetadataConversionTagV3GoalMetadata conversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
    return this;
  }

 /**
  * Get cpaGoalValueInMicroCurrency
  * @return cpaGoalValueInMicroCurrency
  */
  @JsonProperty("cpa_goal_value_in_micro_currency")
 @Pattern(regexp="^[0-9]+$")  public String getCpaGoalValueInMicroCurrency() {
    return cpaGoalValueInMicroCurrency;
  }

  /**
   * Sets the <code>cpaGoalValueInMicroCurrency</code> property.
   */
 public void setCpaGoalValueInMicroCurrency(String cpaGoalValueInMicroCurrency) {
    this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
  }

  /**
   * Sets the <code>cpaGoalValueInMicroCurrency</code> property.
   */
  public OptimizationGoalMetadataConversionTagV3GoalMetadata cpaGoalValueInMicroCurrency(String cpaGoalValueInMicroCurrency) {
    this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
    return this;
  }

 /**
  * Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. &lt;br&gt;This parameter is not enabled for all advertisers. &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\&quot;&gt;Learn more&lt;/a&gt;.
  * @return isRoasOptimized
  */
  @JsonProperty("is_roas_optimized")
  public Boolean getIsRoasOptimized() {
    return isRoasOptimized;
  }

  /**
   * Sets the <code>isRoasOptimized</code> property.
   */
 public void setIsRoasOptimized(Boolean isRoasOptimized) {
    this.isRoasOptimized = isRoasOptimized;
  }

  /**
   * Sets the <code>isRoasOptimized</code> property.
   */
  public OptimizationGoalMetadataConversionTagV3GoalMetadata isRoasOptimized(Boolean isRoasOptimized) {
    this.isRoasOptimized = isRoasOptimized;
    return this;
  }

 /**
  * Conversion learning model type
  * @return learningModeType
  */
  @JsonProperty("learning_mode_type")
  public String getLearningModeType() {
    return learningModeType == null ? null : learningModeType.value();
  }

  /**
   * Sets the <code>learningModeType</code> property.
   */
 public void setLearningModeType(LearningModeTypeEnum learningModeType) {
    this.learningModeType = learningModeType;
  }

  /**
   * Sets the <code>learningModeType</code> property.
   */
  public OptimizationGoalMetadataConversionTagV3GoalMetadata learningModeType(LearningModeTypeEnum learningModeType) {
    this.learningModeType = learningModeType;
    return this;
  }

 /**
  * Event name for custom or standard events mapped to an oCPM model
  * @return reportingEvent
  */
  @JsonProperty("reporting_event")
  public String getReportingEvent() {
    return reportingEvent;
  }

  /**
   * Sets the <code>reportingEvent</code> property.
   */
 public void setReportingEvent(String reportingEvent) {
    this.reportingEvent = reportingEvent;
  }

  /**
   * Sets the <code>reportingEvent</code> property.
   */
  public OptimizationGoalMetadataConversionTagV3GoalMetadata reportingEvent(String reportingEvent) {
    this.reportingEvent = reportingEvent;
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
    OptimizationGoalMetadataConversionTagV3GoalMetadata optimizationGoalMetadataConversionTagV3GoalMetadata = (OptimizationGoalMetadataConversionTagV3GoalMetadata) o;
    return Objects.equals(this.attributionWindows, optimizationGoalMetadataConversionTagV3GoalMetadata.attributionWindows) &&
        Objects.equals(this.conversionEvent, optimizationGoalMetadataConversionTagV3GoalMetadata.conversionEvent) &&
        Objects.equals(this.conversionTagId, optimizationGoalMetadataConversionTagV3GoalMetadata.conversionTagId) &&
        Objects.equals(this.cpaGoalValueInMicroCurrency, optimizationGoalMetadataConversionTagV3GoalMetadata.cpaGoalValueInMicroCurrency) &&
        Objects.equals(this.isRoasOptimized, optimizationGoalMetadataConversionTagV3GoalMetadata.isRoasOptimized) &&
        Objects.equals(this.learningModeType, optimizationGoalMetadataConversionTagV3GoalMetadata.learningModeType) &&
        Objects.equals(this.reportingEvent, optimizationGoalMetadataConversionTagV3GoalMetadata.reportingEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributionWindows, conversionEvent, conversionTagId, cpaGoalValueInMicroCurrency, isRoasOptimized, learningModeType, reportingEvent);
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
    sb.append("    reportingEvent: ").append(toIndentedString(reportingEvent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

