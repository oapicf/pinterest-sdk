package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param reportStatus 
 * @param token 
 * @param message 
 */
data class AdsAnalyticsCreateAsyncResponse(

    @field:JsonProperty("report_status") val reportStatus: kotlin.String? = null,

    @field:JsonProperty("token") val token: kotlin.String? = null,

    @field:JsonProperty("message") val message: kotlin.String? = null
) {

}

