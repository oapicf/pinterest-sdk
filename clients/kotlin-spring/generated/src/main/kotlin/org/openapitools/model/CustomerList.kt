package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CustomerListStatus
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
 * @param id Customer list ID.
 * @param name Customer list name.
 * @param adAccountId Associated ad account ID.
 * @param createdTime Creation time. Unix timestamp in seconds.
 * @param exceptions Customer list errors.
 * @param isNca Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
 * @param numBatches Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.
 * @param numRemovedUserRecords Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.
 * @param numUploadedUserRecords Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.
 * @param status Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
 * @param type Always `customerlist`.
 * @param updatedTime Last update time. Unix timestamp in seconds.
 */
data class CustomerList(

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=18)
    @Schema(example = "643", required = true, readOnly = true, description = "Customer list ID.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "The Glengarry Glen Ross leads", required = true, description = "Customer list name.")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "549756359984", readOnly = true, description = "Associated ad account ID.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_account_id")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(example = "1452208622", readOnly = true, description = "Creation time. Unix timestamp in seconds.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("created_time")
    @get:JsonProperty("created_time") val createdTime: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(readOnly = true, description = "Customer list errors.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("exceptions")
    @get:JsonProperty("exceptions") val exceptions: kotlin.Any? = null,

    @Schema(description = "Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_nca")
    @get:JsonProperty("is_nca") val isNca: kotlin.Boolean? = null,

    @Schema(example = "2", readOnly = true, description = "Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("num_batches")
    @get:JsonProperty("num_batches") val numBatches: java.math.BigDecimal? = null,

    @Schema(example = "0", readOnly = true, description = "Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("num_removed_user_records")
    @get:JsonProperty("num_removed_user_records") val numRemovedUserRecords: java.math.BigDecimal? = null,

    @Schema(example = "11", readOnly = true, description = "Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("num_uploaded_user_records")
    @get:JsonProperty("num_uploaded_user_records") val numUploadedUserRecords: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(example = "PROCESSING", readOnly = true, description = "Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: CustomerListStatus? = null,

    @Schema(example = "customerlist", readOnly = true, description = "Always `customerlist`.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("type")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "1461269616", readOnly = true, description = "Last update time. Unix timestamp in seconds.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("updated_time")
    @get:JsonProperty("updated_time") val updatedTime: java.math.BigDecimal? = null
) {

}

