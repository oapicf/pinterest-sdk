@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EntityLabel(
    @field:JsonProperty("entity_id")
    val entityId: kotlin.String,

    @field:JsonProperty("label_id")
    val labelId: kotlin.String,

    @field:JsonProperty("entity_type")
    val entityType: LabelParentType? = null,

    @field:JsonProperty("status")
    val status: EntityLabelStatus? = null,

)
