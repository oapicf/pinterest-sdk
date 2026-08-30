@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TitleKeywordsFilter(
    @field:JsonProperty("TITLE_KEYWORDS")
    val TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria,

)
