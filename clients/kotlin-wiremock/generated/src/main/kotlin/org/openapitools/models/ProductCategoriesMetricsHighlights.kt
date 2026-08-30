@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ProductCategoriesMetricsHighlights(
    @field:JsonProperty("engagement")
    val engagement: InnerProductCategoriesMetricsHighlights? = null,

    @field:JsonProperty("outbound_clicks")
    val outboundClicks: InnerProductCategoriesMetricsHighlights? = null,

    @field:JsonProperty("pin_saves")
    val pinSaves: InnerProductCategoriesMetricsHighlights? = null,

)
