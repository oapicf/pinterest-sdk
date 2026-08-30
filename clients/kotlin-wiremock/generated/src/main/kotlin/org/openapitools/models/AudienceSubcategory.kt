@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AudienceSubcategory(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("index")
    val index: java.math.BigDecimal? = null,

    @field:JsonProperty("key")
    val key: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("ratio")
    val ratio: java.math.BigDecimal? = null,

)
