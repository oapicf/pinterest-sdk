@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ProductGroupReferenceFilter(
    @field:JsonProperty("PRODUCT_GROUP")
    val PRODUCT_GROUP: CatalogsProductGroupMultipleStringCriteria,

)
