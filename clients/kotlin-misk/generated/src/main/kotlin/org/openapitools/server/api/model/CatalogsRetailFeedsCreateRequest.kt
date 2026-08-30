package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale
import org.openapitools.server.api.model.CatalogsFeedCredentials
import org.openapitools.server.api.model.CatalogsFeedProcessingSchedule
import org.openapitools.server.api.model.CatalogsFormat
import org.openapitools.server.api.model.CatalogsStatus
import org.openapitools.server.api.model.Country
import org.openapitools.server.api.model.NullableCurrency
import org.openapitools.server.api.model.ProductAvailabilityType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsRetailFeedsCreateRequest(
    val catalogType: kotlin.String,
    val defaultCountry: Country,
    val defaultLocale: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale,
    val format: CatalogsFormat,
    /** The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    val location: kotlin.String,
    /** A human-friendly name associated to a given feed. */
    val name: kotlin.String,
    /** Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. */
    val catalogId: kotlin.String? = null,
    val credentials: CatalogsFeedCredentials? = null,
    val defaultAvailability: ProductAvailabilityType? = null,
    val defaultCurrency: NullableCurrency? = null,
    val preferredProcessingSchedule: CatalogsFeedProcessingSchedule? = null,
    val status: CatalogsStatus? = null
)
