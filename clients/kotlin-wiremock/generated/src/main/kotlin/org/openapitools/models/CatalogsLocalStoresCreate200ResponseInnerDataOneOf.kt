@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsLocalStoresCreate200ResponseInnerDataOneOf(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("exceptions")
    val exceptions: PinterestLibError,

)
