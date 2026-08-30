@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CustomerListCreate(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("is_nca")
    val isNca: kotlin.Boolean? = null,

    @field:JsonProperty("list_type")
    val listType: UserListType? = null,

    @field:JsonProperty("records")
    val records: kotlin.String? = null,

    @field:JsonProperty("records_v2")
    val recordsV2: kotlin.collections.List<CustomerListRecordRow>? = null,

)
