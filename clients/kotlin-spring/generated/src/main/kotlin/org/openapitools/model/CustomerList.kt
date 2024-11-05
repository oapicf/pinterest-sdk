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
 * @param adAccountId Associated ad account ID.
 * @param createdTime Creation time. Unix timestamp in seconds.
 * @param id Customer list ID.
 * @param name Customer list name.
 * @param numBatches Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.
 * @param numRemovedUserRecords Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list.
 * @param numUploadedUserRecords Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list.
 * @param status Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
 * @param type Always \"customerlist\".
 * @param updatedTime Last update time. Unix timestamp in seconds.
 * @param exceptions Customer list errors
 */
data class CustomerList(

    @Schema(example = "549756359984", description = "Associated ad account ID.")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(example = "1452208622", description = "Creation time. Unix timestamp in seconds.")
    @get:JsonProperty("created_time") val createdTime: java.math.BigDecimal? = null,

    @Schema(example = "643", description = "Customer list ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "The Glengarry Glen Ross leads", description = "Customer list name.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "2", description = "Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.")
    @get:JsonProperty("num_batches") val numBatches: java.math.BigDecimal? = null,

    @Schema(example = "0", description = "Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list.")
    @get:JsonProperty("num_removed_user_records") val numRemovedUserRecords: java.math.BigDecimal? = null,

    @Schema(example = "11", description = "Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list.")
    @get:JsonProperty("num_uploaded_user_records") val numUploadedUserRecords: java.math.BigDecimal? = null,

    @Schema(example = "PROCESSING", description = "Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.")
    @get:JsonProperty("status") val status: CustomerList.Status? = null,

    @Schema(example = "customerlist", description = "Always \"customerlist\".")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "1461269616", description = "Last update time. Unix timestamp in seconds.")
    @get:JsonProperty("updated_time") val updatedTime: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(example = "null", description = "Customer list errors")
    @get:JsonProperty("exceptions") val exceptions: kotlin.Any? = null
    ) {

    /**
    * Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
    * Values: PROCESSING,READY,TOO_SMALL,UPLOADING
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        PROCESSING("PROCESSING"),
        READY("READY"),
        TOO_SMALL("TOO_SMALL"),
        UPLOADING("UPLOADING");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().first{it -> it.value == value}
            }
        }
    }

}

