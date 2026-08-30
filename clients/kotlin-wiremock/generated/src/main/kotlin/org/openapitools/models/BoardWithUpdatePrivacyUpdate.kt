@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BoardWithUpdatePrivacyUpdate(
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("privacy")
    val privacy: BoardUpdatePrivacy? = null,

)
