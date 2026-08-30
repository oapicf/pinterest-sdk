@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdatePartnerAssetAccessBody(
    @field:JsonProperty("accesses")
    val accesses: kotlin.collections.List<UpdatePartnerAssetAccessItem>,

)
