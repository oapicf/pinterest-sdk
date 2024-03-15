package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.GetMMMReportResponseData
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
 * @param code 
 * @param &#x60;data&#x60; 
 * @param message 
 * @param status 
 */
data class GetMMMReportResponse(

    @Schema(example = "0", description = "")
    @get:JsonProperty("code") val code: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("data") val `data`: GetMMMReportResponseData? = null,

    @Schema(example = "ok", description = "")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(example = "success", description = "")
    @get:JsonProperty("status") val status: kotlin.String? = null
) {

}

