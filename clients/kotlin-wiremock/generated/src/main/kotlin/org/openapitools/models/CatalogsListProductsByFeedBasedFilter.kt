@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsListProductsByFeedBasedFilter(
    @field:JsonProperty("feed_id")
    val feedId: kotlin.String,

    @field:JsonProperty("filters")
    val filters: CatalogsProductGroupFilters,

)
