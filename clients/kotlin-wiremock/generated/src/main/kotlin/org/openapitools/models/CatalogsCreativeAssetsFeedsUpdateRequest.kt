@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsCreativeAssetsFeedsUpdateRequest(
    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("credentials")
    val credentials: CatalogsFeedCredentials? = null,

    @field:JsonProperty("default_currency")
    val defaultCurrency: NullableCurrency? = null,

    @field:JsonProperty("format")
    val format: CatalogsFormat? = null,

    @field:JsonProperty("location")
    val location: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("preferred_processing_schedule")
    val preferredProcessingSchedule: CatalogsFeedProcessingSchedule? = null,

    @field:JsonProperty("status")
    val status: CatalogsStatus? = null,

)
