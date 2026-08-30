package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
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
 * User selection of conversion health criteria for a single feature
 * @param status Overall status for this selection item
 * @param conversionType Status for conversion types
 * @param criteria Status for criteria
 * @param ingestionSource Status for ingestion sources
 */
data class ConversionHealthSelectionItem(

    @field:Valid
    @Schema(required = true, description = "Overall status for this selection item")
    @param:JsonProperty("status")
    @get:JsonProperty("status", required = true) val status: kotlin.Any?,

    @field:Valid
    @Schema(description = "Status for conversion types")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("conversionType")
    @get:JsonProperty("conversionType") val conversionType: kotlin.Any? = null,

    @field:Valid
    @Schema(description = "Status for criteria")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("criteria")
    @get:JsonProperty("criteria") val criteria: kotlin.Any? = null,

    @field:Valid
    @Schema(description = "Status for ingestion sources")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ingestionSource")
    @get:JsonProperty("ingestionSource") val ingestionSource: kotlin.Any? = null
) {

}

