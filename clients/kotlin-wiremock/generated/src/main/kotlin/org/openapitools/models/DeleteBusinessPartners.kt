@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeleteBusinessPartners(
    @field:JsonProperty("deleted_partners")
    val deletedPartners: kotlin.collections.List<kotlin.String>? = null,

)
