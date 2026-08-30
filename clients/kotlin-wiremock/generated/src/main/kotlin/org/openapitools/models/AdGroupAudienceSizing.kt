@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdGroupAudienceSizing(
    @field:JsonProperty("audience_size_lower_bound")
    val audienceSizeLowerBound: java.math.BigDecimal? = null,

    @field:JsonProperty("audience_size_upper_bound")
    val audienceSizeUpperBound: java.math.BigDecimal? = null,

)
