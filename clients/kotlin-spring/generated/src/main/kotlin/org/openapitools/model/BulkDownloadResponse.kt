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
 * @param requestId ID of the bulk request.
 */
data class BulkDownloadResponse(

    @Schema(example = "2680059592705", description = "ID of the bulk request.")
    @get:JsonProperty("request_id") val requestId: kotlin.String? = null
    ) {

}

