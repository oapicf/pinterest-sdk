package org.openapitools.server.api.model

import org.openapitools.server.api.model.BatchOperationStatus
import org.openapitools.server.api.model.HotelProcessingRecord
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelItemsBatch(
    val catalogType: kotlin.String,
    /** Id of the catalogs items batch */
    val batchId: kotlin.String? = null,
    /** Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss */
    val completedTime: java.time.OffsetDateTime? = null,
    /** Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss */
    val createdTime: java.time.OffsetDateTime? = null,
    /** Array with the catalogs items processing records part of the catalogs items batch */
    val items: kotlin.collections.List<HotelProcessingRecord>? = null,
    val status: BatchOperationStatus? = null
)
