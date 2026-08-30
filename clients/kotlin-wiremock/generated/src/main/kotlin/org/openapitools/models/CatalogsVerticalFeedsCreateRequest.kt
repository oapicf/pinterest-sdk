@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsVerticalFeedsCreateRequest(
    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("default_country")
    val defaultCountry: Country,

    @field:JsonProperty("default_locale")
    val defaultLocale: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale,

    @field:JsonProperty("format")
    val format: CatalogsFormat,

    @field:JsonProperty("location")
    val location: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("catalog_id")
    val catalogId: kotlin.String? = null,

    @field:JsonProperty("credentials")
    val credentials: CatalogsFeedCredentials? = null,

    @field:JsonProperty("default_availability")
    val defaultAvailability: ProductAvailabilityType? = null,

    @field:JsonProperty("default_currency")
    val defaultCurrency: NullableCurrency? = null,

    @field:JsonProperty("preferred_processing_schedule")
    val preferredProcessingSchedule: CatalogsFeedProcessingSchedule? = null,

    @field:JsonProperty("status")
    val status: CatalogsStatus? = null,

)
