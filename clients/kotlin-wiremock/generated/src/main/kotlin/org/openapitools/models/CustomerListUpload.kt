@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CustomerListUpload(
    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String,

    @field:JsonProperty("creation_time")
    val creationTime: kotlin.Int,

    @field:JsonProperty("customer_list_id")
    val customerListId: kotlin.String,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("operation")
    val operation: UserListOperationType,

    @field:JsonProperty("state")
    val state: WorkloadState,

    @field:JsonProperty("updated_time")
    val updatedTime: kotlin.Int,

    @field:JsonProperty("error_counts")
    val errorCounts: kotlin.collections.List<ErrorDetail>? = null,

    @field:JsonProperty("record_counts")
    val recordCounts: RecordCounts? = null,

)
