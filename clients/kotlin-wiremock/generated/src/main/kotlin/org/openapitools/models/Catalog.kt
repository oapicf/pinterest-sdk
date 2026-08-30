@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Catalog(
    @field:JsonProperty("catalog_type")
    val catalogType: CatalogsType,

    @field:JsonProperty("created_at")
    val createdAt: java.time.OffsetDateTime,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("updated_at")
    val updatedAt: java.time.OffsetDateTime,

)
