package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupFilterOperatorTypeCriteria
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LinkFilter(
    val LINK: CatalogsProductGroupFilterOperatorTypeCriteria
)
