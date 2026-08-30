package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringCriteria
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TitleKeywordsFilter(
    val TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria
)
