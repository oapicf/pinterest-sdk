@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogCreate(
    @field:JsonProperty("catalog_type")
    val catalogType: CatalogsType,

    @field:JsonProperty("name")
    val name: kotlin.String,

)
