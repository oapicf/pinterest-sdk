@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsCreativeAssetsAvailableFilterValues(
    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("filter_values")
    val filterValues: CatalogsCreativeAssetsFilterValuesMap,

)
