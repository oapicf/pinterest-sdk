package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ErrorDetail
import org.openapitools.model.RecordCounts
import org.openapitools.model.UserListOperationType
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
 * @param adAccountId Advertiser ID.
 * @param creationTime Customer List Upload creation_time. Epoch (seconds).
 * @param customerListId ID of the customer list associated with this upload.
 * @param id Customer List Upload ID.
 * @param operation 
 * @param state Workload processing state
 * @param updatedTime Customer List Upload updated_time. Epoch (seconds).
 * @param errorCounts Error counts by error code
 * @param recordCounts 
 */
data class CustomerListUpload(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "9876543210", required = true, description = "Advertiser ID.")
    @get:JsonProperty("ad_account_id", required = true) val adAccountId: kotlin.String,

    @Schema(example = "1728606435", required = true, description = "Customer List Upload creation_time. Epoch (seconds).")
    @get:JsonProperty("creation_time", required = true) val creationTime: kotlin.Int,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "59854745824", required = true, description = "ID of the customer list associated with this upload.")
    @get:JsonProperty("customer_list_id", required = true) val customerListId: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1234567890", required = true, description = "Customer List Upload ID.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("operation", required = true) val operation: UserListOperationType,

    @Schema(example = "RUNNING", required = true, description = "Workload processing state")
    @get:JsonProperty("state", required = true) val state: CustomerListUpload.State,

    @Schema(example = "1728606435", required = true, description = "Customer List Upload updated_time. Epoch (seconds).")
    @get:JsonProperty("updated_time", required = true) val updatedTime: kotlin.Int,

    @field:Valid
    @Schema(example = "[{\"error_code\":42,\"message\":\"Invalid email\",\"count\":20}]", description = "Error counts by error code")
    @get:JsonProperty("error_counts") val errorCounts: kotlin.collections.List<ErrorDetail>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("record_counts") val recordCounts: RecordCounts? = null
) {

    /**
    * Workload processing state
    * Values: NOT_STARTED,RUNNING,PAUSED,SUCCEEDED,FAILED
    */
    enum class State(@get:JsonValue val value: kotlin.String) {

        NOT_STARTED("NOT_STARTED"),
        RUNNING("RUNNING"),
        PAUSED("PAUSED"),
        SUCCEEDED("SUCCEEDED"),
        FAILED("FAILED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): State {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CustomerListUpload'")
            }
        }
    }

}

