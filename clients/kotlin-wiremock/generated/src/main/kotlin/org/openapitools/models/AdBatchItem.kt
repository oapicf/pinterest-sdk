@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdBatchItem(
    @field:JsonProperty("data")
    val `data`: Ad? = null,

    @field:JsonProperty("exceptions")
    val exceptions: PinterestLibError? = null,

)
