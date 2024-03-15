package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param attributionWindows 
 * @param conversionEvent 
 * @param conversionTagId 
 * @param cpaGoalValueInMicroCurrency 
 * @param isRoasOptimized Ad group is ROAS optimized
 * @param learningModeType Conversion learning model type
 */
data class OptimizationGoalMetadataConversionTagV3GoalMetadata(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("attribution_windows") val attributionWindows: OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("conversion_event") val conversionEvent: OptimizationGoalMetadataConversionTagV3GoalMetadata.ConversionEvent? = null,

    @get:Pattern(regexp="^[0-9]+$")
    @Schema(example = "null", description = "")
    @get:JsonProperty("conversion_tag_id") val conversionTagId: kotlin.String? = null,

    @get:Pattern(regexp="^[0-9]+$")
    @Schema(example = "null", description = "")
    @get:JsonProperty("cpa_goal_value_in_micro_currency") val cpaGoalValueInMicroCurrency: kotlin.String? = null,

    @Schema(example = "null", description = "Ad group is ROAS optimized")
    @get:JsonProperty("is_roas_optimized") val isRoasOptimized: kotlin.Boolean? = null,

    @Schema(example = "ACTIVE", description = "Conversion learning model type")
    @get:JsonProperty("learning_mode_type") val learningModeType: OptimizationGoalMetadataConversionTagV3GoalMetadata.LearningModeType? = null
) {

    /**
    * 
    * Values: PAGE_VISIT,SIGNUP,CHECKOUT,CUSTOM,VIEW_CATEGORY,SEARCH,ADD_TO_CART,WATCH_VIDEO,LEAD,APP_INSTALL
    */
    enum class ConversionEvent(val value: kotlin.String) {

        @JsonProperty("PAGE_VISIT") PAGE_VISIT("PAGE_VISIT"),
        @JsonProperty("SIGNUP") SIGNUP("SIGNUP"),
        @JsonProperty("CHECKOUT") CHECKOUT("CHECKOUT"),
        @JsonProperty("CUSTOM") CUSTOM("CUSTOM"),
        @JsonProperty("VIEW_CATEGORY") VIEW_CATEGORY("VIEW_CATEGORY"),
        @JsonProperty("SEARCH") SEARCH("SEARCH"),
        @JsonProperty("ADD_TO_CART") ADD_TO_CART("ADD_TO_CART"),
        @JsonProperty("WATCH_VIDEO") WATCH_VIDEO("WATCH_VIDEO"),
        @JsonProperty("LEAD") LEAD("LEAD"),
        @JsonProperty("APP_INSTALL") APP_INSTALL("APP_INSTALL")
    }

    /**
    * Conversion learning model type
    * Values: NOT_ACTIVE,ACTIVE,`null`
    */
    enum class LearningModeType(val value: kotlin.String) {

        @JsonProperty("NOT_ACTIVE") NOT_ACTIVE("NOT_ACTIVE"),
        @JsonProperty("ACTIVE") ACTIVE("ACTIVE"),
        @JsonProperty("null") `null`("null")
    }

}

