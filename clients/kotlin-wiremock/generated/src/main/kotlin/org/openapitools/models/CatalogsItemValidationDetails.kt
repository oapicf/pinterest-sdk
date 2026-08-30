@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsItemValidationDetails(
    @field:JsonProperty("attribute_name")
    val attributeName: NullableCatalogsItemFieldType,

    @field:JsonProperty("provided_value")
    val providedValue: kotlin.String,

)
