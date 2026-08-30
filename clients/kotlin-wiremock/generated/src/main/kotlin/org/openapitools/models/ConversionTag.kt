@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionTag(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String,

    @field:JsonProperty("code_snippet")
    val codeSnippet: kotlin.String? = null,

    @field:JsonProperty("configs")
    val configs: ConversionTagConfigs? = null,

    @field:JsonProperty("enhanced_match_status")
    val enhancedMatchStatus: EnhancedMatchStatusType? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("last_fired_time_ms")
    val lastFiredTimeMs: java.math.BigDecimal? = null,

    @field:JsonProperty("version")
    val version: kotlin.String? = null,

    @field:JsonProperty("status")
    val status: EntityStatus? = null,

)
