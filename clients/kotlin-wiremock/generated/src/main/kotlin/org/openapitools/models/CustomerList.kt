@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CustomerList(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String? = null,

    @field:JsonProperty("created_time")
    val createdTime: java.math.BigDecimal? = null,

    @field:JsonProperty("exceptions")
    val exceptions: kotlin.Any? = null,

    @field:JsonProperty("is_nca")
    val isNca: kotlin.Boolean? = null,

    @field:JsonProperty("num_batches")
    val numBatches: java.math.BigDecimal? = null,

    @field:JsonProperty("num_removed_user_records")
    val numRemovedUserRecords: java.math.BigDecimal? = null,

    @field:JsonProperty("num_uploaded_user_records")
    val numUploadedUserRecords: java.math.BigDecimal? = null,

    @field:JsonProperty("status")
    val status: CustomerListStatus? = null,

    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("updated_time")
    val updatedTime: java.math.BigDecimal? = null,

)
