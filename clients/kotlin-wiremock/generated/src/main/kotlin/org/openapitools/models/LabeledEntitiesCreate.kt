@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LabeledEntitiesCreate(
    @field:JsonProperty("entity_ids")
    val entityIds: kotlin.collections.List<kotlin.String>,

)
