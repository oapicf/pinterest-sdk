package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ErrorDetail
import org.openapitools.model.RecordCounts
import org.openapitools.model.UserListOperationType
import org.openapitools.model.WorkloadState
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
 * @param state 
 * @param updatedTime Customer List Upload updated_time. Epoch (seconds).
 * @param errorCounts Error counts by error code
 * @param recordCounts Record processing counts
 */
data class CustomerListUpload(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "9876543210", required = true, description = "Advertiser ID.")
    @param:JsonProperty("ad_account_id")
    @get:JsonProperty("ad_account_id", required = true) val adAccountId: kotlin.String,

    @Schema(example = "1728606435", required = true, description = "Customer List Upload creation_time. Epoch (seconds).")
    @param:JsonProperty("creation_time")
    @get:JsonProperty("creation_time", required = true) val creationTime: kotlin.Int,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "59854745824", required = true, description = "ID of the customer list associated with this upload.")
    @param:JsonProperty("customer_list_id")
    @get:JsonProperty("customer_list_id", required = true) val customerListId: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=18)
    @Schema(example = "1234567890", required = true, description = "Customer List Upload ID.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("operation")
    @get:JsonProperty("operation", required = true) val operation: UserListOperationType,

    @field:Valid
    @Schema(example = "RUNNING", required = true, description = "")
    @param:JsonProperty("state")
    @get:JsonProperty("state", required = true) val state: WorkloadState,

    @Schema(example = "1728606435", required = true, description = "Customer List Upload updated_time. Epoch (seconds).")
    @param:JsonProperty("updated_time")
    @get:JsonProperty("updated_time", required = true) val updatedTime: kotlin.Int,

    @field:Valid
    @Schema(example = "[{\"error_code\":42,\"message\":\"Invalid email\",\"count\":20}]", description = "Error counts by error code")
    @param:JsonProperty("error_counts")
    @get:JsonProperty("error_counts") val errorCounts: kotlin.collections.List<ErrorDetail>? = null,

    @field:Valid
    @Schema(description = "Record processing counts")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("record_counts")
    @get:JsonProperty("record_counts") val recordCounts: RecordCounts? = null
) {

}

