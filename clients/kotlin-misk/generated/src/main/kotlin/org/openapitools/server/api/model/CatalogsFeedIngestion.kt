package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsFeedProcessingStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsFeedIngestion(
    /** Timestamp of the feed ingestion. */
    val createdAt: java.time.OffsetDateTime,
    /** Catalog Feed id pertaining to the feed ingestion. */
    val feedId: kotlin.String,
    /** Unique identifier of a feed ingestion. */
    val id: kotlin.String,
    /** Status of the feed ingestion. */
    val status: CatalogsFeedProcessingStatus
)
