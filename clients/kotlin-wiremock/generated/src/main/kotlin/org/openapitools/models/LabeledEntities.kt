@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LabeledEntities(
    @field:JsonProperty("entities_labels")
    val entitiesLabels: kotlin.collections.List<EntityLabel>? = null,

    @field:JsonProperty("errors")
    val errors: kotlin.collections.List<EntityLabelError>? = null,

)
