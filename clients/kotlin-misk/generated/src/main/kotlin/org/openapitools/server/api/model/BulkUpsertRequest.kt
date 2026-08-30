package org.openapitools.server.api.model

import org.openapitools.server.api.model.BulkUpsertRequestCreate
import org.openapitools.server.api.model.BulkUpsertRequestUpdate
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BulkUpsertRequest(
    val create: BulkUpsertRequestCreate? = null,
    val update: BulkUpsertRequestUpdate? = null
)
