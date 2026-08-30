@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsProductGroupUint32Criteria(
    @field:JsonProperty("operator")
    val `operator`: NumericFilterOperatorType,

    @field:JsonProperty("value")
    val `value`: kotlin.Int,

    @field:JsonProperty("negated")
    val negated: kotlin.Boolean? = null,

)
