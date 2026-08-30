@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsReport(
    @field:JsonProperty("report_status")
    val reportStatus: kotlin.String? = null,

    @field:JsonProperty("size")
    val propertySize: java.math.BigDecimal? = null,

    @field:JsonProperty("url")
    val url: kotlin.String? = null,

)
