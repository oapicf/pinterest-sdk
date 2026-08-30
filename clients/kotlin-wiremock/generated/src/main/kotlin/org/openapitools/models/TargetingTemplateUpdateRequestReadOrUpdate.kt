@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TargetingTemplateUpdateRequestReadOrUpdate(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("operation_type")
    val operationType: AudienceUpdateOperationType,

    @field:JsonProperty("targeting_attributes")
    val targetingAttributes: TargetingSpecOptimal? = null,

)
