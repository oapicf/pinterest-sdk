@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeletePartnerAssetAccessBody(
    @field:JsonProperty("accesses")
    val accesses: kotlin.collections.List<DeletePartnerAssetAccessItem>,

)
