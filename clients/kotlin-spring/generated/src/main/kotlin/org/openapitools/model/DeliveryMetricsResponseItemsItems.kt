package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
 * @param category Category name
 * @param definition How the metric is defined.
 * @param displayName Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
 * @param name Metric's name.
 */
data class DeliveryMetricsResponseItemsItems(

    @Schema(description = "Category name")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("category")
    @get:JsonProperty("category") val category: DeliveryMetricsResponseItemsItems.Category? = null,

    @Schema(description = "How the metric is defined.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("definition")
    @get:JsonProperty("definition") val definition: kotlin.String? = null,

    @Schema(description = "Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("display_name")
    @get:JsonProperty("display_name") val displayName: kotlin.String? = null,

    @Schema(description = "Metric's name.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null
) {

    /**
    * Category name
    * Values: ADS,ORGANIC
    */
    enum class Category(@get:JsonValue val value: kotlin.String) {

        ADS("ADS"),
        ORGANIC("ORGANIC");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Category {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Category'")
            }
        }
    }

}

