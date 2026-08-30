@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CustomerListUpdateWithRequiredBody(
    @field:JsonProperty("operation_type")
    val operationType: UserListOperationType,

    @field:JsonProperty("records")
    val records: kotlin.String? = null,

    @field:JsonProperty("records_v2")
    val recordsV2: kotlin.collections.List<CustomerListRecordRow>? = null,

)
