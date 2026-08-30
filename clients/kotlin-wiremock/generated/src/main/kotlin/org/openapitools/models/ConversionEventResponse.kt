@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionEventResponse(
    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String? = null,

    @field:JsonProperty("conversion_event")
    val conversionEvent: ConversionTagType? = null,

    @field:JsonProperty("conversion_tag_id")
    val conversionTagId: kotlin.String? = null,

    @field:JsonProperty("created_time")
    val createdTime: kotlin.Int? = null,

    @field:JsonProperty("reporting_conversion_event")
    val reportingConversionEvent: kotlin.String? = null,

)
