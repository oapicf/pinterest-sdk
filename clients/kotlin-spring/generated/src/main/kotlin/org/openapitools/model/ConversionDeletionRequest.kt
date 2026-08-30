package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ConversionDeletionRequestStatus
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
 * Conversion deletion request
 * @param createdTime Timestamp when the conversion deletion request was succesfully created.
 * @param requestId Unique identifier of the conversion deletion request
 * @param status Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
 * @param processedTime Timestamp when the conversion deletion request was processed.
 */
data class ConversionDeletionRequest(

    @field:Valid
    @Schema(required = true, readOnly = true, description = "Timestamp when the conversion deletion request was succesfully created.")
    @param:JsonProperty("created_time")
    @get:JsonProperty("created_time", required = true) val createdTime: java.time.LocalDate,

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=18)
    @Schema(required = true, description = "Unique identifier of the conversion deletion request")
    @param:JsonProperty("request_id")
    @get:JsonProperty("request_id", required = true) val requestId: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.")
    @param:JsonProperty("status")
    @get:JsonProperty("status", required = true) val status: ConversionDeletionRequestStatus,

    @field:Valid
    @Schema(readOnly = true, description = "Timestamp when the conversion deletion request was processed.")
    @param:JsonProperty("processed_time")
    @get:JsonProperty("processed_time") val processedTime: java.time.LocalDate? = null
) {

}

