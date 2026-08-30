@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ProductGroupAnalyticsItems(
    @field:JsonProperty("PRODUCT_GROUP_ID")
    val PRODUCT_GROUP_ID: kotlin.String,

    @field:JsonProperty("DATE")
    val DATE: java.time.LocalDate? = null,

)
