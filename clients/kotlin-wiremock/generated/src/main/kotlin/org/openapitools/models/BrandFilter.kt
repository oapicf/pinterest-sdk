@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BrandFilter(
    @field:JsonProperty("BRAND")
    val BRAND: CatalogsProductGroupMultipleStringCriteria,

)
