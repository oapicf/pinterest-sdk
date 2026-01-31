package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
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
 * @param propertyValues 
 * @param filterOperatorType 
 * @param negated 
 */
data class CatalogsProductGroupFilterOperatorTypeCriteria(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("values", required = true) val propertyValues: kotlin.collections.List<kotlin.String>,

    @Schema(example = "null", description = "")
    @get:JsonProperty("filter_operator_type") val filterOperatorType: CatalogsProductGroupFilterOperatorTypeCriteria.FilterOperatorType? = FilterOperatorType.IS,

    @Schema(example = "null", description = "")
    @get:JsonProperty("negated") val negated: kotlin.Boolean? = false
) {

    /**
    * 
    * Values: IS,CONTAINS
    */
    enum class FilterOperatorType(@get:JsonValue val value: kotlin.String) {

        IS("IS"),
        CONTAINS("CONTAINS");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): FilterOperatorType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogsProductGroupFilterOperatorTypeCriteria'")
            }
        }
    }

}

