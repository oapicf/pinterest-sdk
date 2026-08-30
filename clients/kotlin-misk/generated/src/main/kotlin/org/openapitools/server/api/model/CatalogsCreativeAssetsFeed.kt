package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsFeedCredentials
import org.openapitools.server.api.model.CatalogsFeedProcessingSchedule
import org.openapitools.server.api.model.CatalogsFormat
import org.openapitools.server.api.model.CatalogsStatus
import org.openapitools.server.api.model.Country
import org.openapitools.server.api.model.NullableCurrency
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreativeAssetsFeed(
    /** Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. */
    val catalogId: kotlin.String,
    val catalogType: kotlin.String,
    val createdAt: java.time.OffsetDateTime,
    val defaultCountry: Country,
    /** The locale used within a feed for product descriptions. */
    val defaultLocale: kotlin.String,
    val format: CatalogsFormat,
    /** ID of the feed entity. */
    val id: kotlin.String,
    /** The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    val location: kotlin.String,
    /** A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. */
    val name: kotlin.String,
    val status: CatalogsStatus,
    val updatedAt: java.time.OffsetDateTime,
    val credentials: CatalogsFeedCredentials? = null,
    val defaultCurrency: NullableCurrency? = null,
    val preferredProcessingSchedule: CatalogsFeedProcessingSchedule? = null
)
