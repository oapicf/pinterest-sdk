package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsFeedIngestionDetails
import org.openapitools.server.api.model.CatalogsFeedProcessingStatus
import org.openapitools.server.api.model.CatalogsFeedProductCounts
import org.openapitools.server.api.model.CatalogsFeedValidationDetails
import org.openapitools.server.api.model.CatalogsFeedVideoCounts
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsFeedProcessingResult(
    val createdAt: java.time.OffsetDateTime,
    /** ID of the feed processing result. */
    val id: kotlin.String,
    val ingestionDetails: CatalogsFeedIngestionDetails,
    val productCounts: CatalogsFeedProductCounts,
    val status: CatalogsFeedProcessingStatus,
    val updatedAt: java.time.OffsetDateTime,
    val validationDetails: CatalogsFeedValidationDetails,
    val videoCounts: CatalogsFeedVideoCounts? = null
)
