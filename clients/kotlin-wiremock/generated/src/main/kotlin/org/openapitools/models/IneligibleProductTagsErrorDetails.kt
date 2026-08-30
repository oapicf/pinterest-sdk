@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class IneligibleProductTagsErrorDetails(
    @field:JsonProperty("product_tags")
    val productTags: kotlin.collections.List<IneligibleProductTagErrorItem>,

)
