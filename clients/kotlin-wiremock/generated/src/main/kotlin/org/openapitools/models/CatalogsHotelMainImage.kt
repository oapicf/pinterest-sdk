@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsHotelMainImage(
    @field:JsonProperty("link")
    val link: kotlin.String? = null,

    @field:JsonProperty("tag")
    val tag: kotlin.collections.List<kotlin.String>? = null,

)
