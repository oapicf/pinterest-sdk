package org.openapitools.server.api.model

import org.openapitools.server.api.model.NumericFilterOperatorType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupUint32Criteria(
    val `operator`: NumericFilterOperatorType,
    val `value`: kotlin.Int,
    val negated: kotlin.Boolean? = null
)
