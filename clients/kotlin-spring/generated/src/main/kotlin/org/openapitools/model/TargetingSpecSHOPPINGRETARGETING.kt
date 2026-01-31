package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param exclusionWindow Number of days ago to stop lookback timeframe for dynamic retargeting
 * @param lookbackWindow Number of days ago to start lookback timeframe for dynamic retargeting
 * @param tagTypes Event types to target for dynamic retargeting
 */
data class TargetingSpecShoppingRetargeting(

    @Schema(example = "14", description = "Number of days ago to stop lookback timeframe for dynamic retargeting")
    @get:JsonProperty("exclusion_window") val exclusionWindow: kotlin.Int? = null,

    @Schema(example = "30", description = "Number of days ago to start lookback timeframe for dynamic retargeting")
    @get:JsonProperty("lookback_window") val lookbackWindow: kotlin.Int? = null,

    @Schema(example = "[0,6]", description = "Event types to target for dynamic retargeting")
    @get:JsonProperty("tag_types") val tagTypes: kotlin.collections.List<kotlin.Int>? = null
) {

}

