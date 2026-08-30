@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BidOptionsAppTypeMultipliers(
    @field:JsonProperty("android_mobile")
    val androidMobile: java.math.BigDecimal? = null,

    @field:JsonProperty("android_tablet")
    val androidTablet: java.math.BigDecimal? = null,

    @field:JsonProperty("ipad")
    val ipad: java.math.BigDecimal? = null,

    @field:JsonProperty("iphone")
    val iphone: java.math.BigDecimal? = null,

    @field:JsonProperty("web")
    val web: java.math.BigDecimal? = null,

    @field:JsonProperty("web_mobile")
    val webMobile: java.math.BigDecimal? = null,

)
