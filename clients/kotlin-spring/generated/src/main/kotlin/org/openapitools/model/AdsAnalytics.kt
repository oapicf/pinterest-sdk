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
 * @param AD_ID 
 * @param DATE 
 */
data class AdsAnalytics(

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, description = "")
    @param:JsonProperty("AD_ID", required = true)
    @get:JsonProperty("AD_ID", required = true) val AD_ID: kotlin.String,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("DATE")
    @get:JsonProperty("DATE") val DATE: java.time.LocalDate? = null
) {

}

