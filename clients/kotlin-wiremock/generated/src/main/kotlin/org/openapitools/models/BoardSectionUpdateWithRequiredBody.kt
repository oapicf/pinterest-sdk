@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BoardSectionUpdateWithRequiredBody(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

)
