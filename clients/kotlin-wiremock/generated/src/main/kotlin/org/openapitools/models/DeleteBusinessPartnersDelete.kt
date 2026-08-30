@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeleteBusinessPartnersDelete(
    @field:JsonProperty("partner_ids")
    val partnerIds: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("partner_type")
    val partnerType: NullablePartnerType? = null,

)
