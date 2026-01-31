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
 * A map of filter attributes to their available values.
 * @param brand 
 * @param customLabel0 
 * @param customLabel1 
 * @param customLabel2 
 * @param customLabel3 
 * @param customLabel4 
 */
data class CatalogsHotelFilterValuesMap(

    @Schema(example = "null", description = "")
    @get:JsonProperty("brand") val brand: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("custom_label_0") val customLabel0: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("custom_label_1") val customLabel1: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("custom_label_2") val customLabel2: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("custom_label_3") val customLabel3: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("custom_label_4") val customLabel4: kotlin.collections.List<kotlin.String>? = null
) {

}

