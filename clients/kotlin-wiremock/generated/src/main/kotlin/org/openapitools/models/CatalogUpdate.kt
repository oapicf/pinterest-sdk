@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogUpdate(
    @field:JsonProperty("catalog_type")
    val catalogType: CatalogsType? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

)
