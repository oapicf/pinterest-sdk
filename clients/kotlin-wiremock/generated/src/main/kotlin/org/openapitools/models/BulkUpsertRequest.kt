@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BulkUpsertRequest(
    @field:JsonProperty("create")
    val create: BulkUpsertRequestCreate? = null,

    @field:JsonProperty("update")
    val update: BulkUpsertRequestUpdate? = null,

)
