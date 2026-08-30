@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsCreativeAssetsProductGroupFilters(
    @field:JsonProperty("any_of")
    val anyOf: kotlin.collections.List<CatalogsCreativeAssetsProductGroupFilterKeys>,

    @field:JsonProperty("all_of")
    val allOf: kotlin.collections.List<CatalogsCreativeAssetsProductGroupFilterKeys>,

)
