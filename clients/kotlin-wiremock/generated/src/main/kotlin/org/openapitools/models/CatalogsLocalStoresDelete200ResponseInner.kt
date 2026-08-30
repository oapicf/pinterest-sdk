@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsLocalStoresDelete200ResponseInner(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("status")
    val status: CampaignAdPreviewDelete200ResponseInnerStatus,

)
