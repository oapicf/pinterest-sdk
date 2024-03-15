package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param name Metric's name.
 * @param category Category name
 * @param definition How the metric is defined.
 * @param displayName Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
 */
data class DeliveryMetricsResponseItemsInner(

    @Schema(example = "AD_GROUP_ID", description = "Metric's name.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "ADS", description = "Category name")
    @get:JsonProperty("category") val category: DeliveryMetricsResponseItemsInner.Category? = null,

    @Schema(example = "Unique ID for your ad group", description = "How the metric is defined.")
    @get:JsonProperty("definition") val definition: kotlin.String? = null,

    @Schema(example = "Ad group ID", description = "Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.")
    @get:JsonProperty("display_name") val displayName: kotlin.String? = null
) {

    /**
    * Category name
    * Values: ADS,ORGANIC
    */
    enum class Category(val value: kotlin.String) {

        @JsonProperty("ADS") ADS("ADS"),
        @JsonProperty("ORGANIC") ORGANIC("ORGANIC")
    }

}

