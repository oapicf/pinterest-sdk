@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignAdPreviewCreate200ResponseInnerDataOneOf(
    @field:JsonProperty("exceptions")
    val exceptions: PinterestLibError,

)
