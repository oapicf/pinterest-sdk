@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsAiContentDisclosure(
    @field:JsonProperty("disclosure")
    val disclosure: kotlin.collections.List<CatalogsAiContentDisclosureLabel>,

    @field:JsonProperty("url")
    val url: kotlin.String,

)
