@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsItemValidationIssues(
    @field:JsonProperty("errors")
    val errors: CatalogsItemValidationErrors,

    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    @field:JsonProperty("item_number")
    val itemNumber: kotlin.Int,

    @field:JsonProperty("warnings")
    val warnings: CatalogsItemValidationWarnings,

)
