package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsItemValidationIssues
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemsIssuesList200Response(
    val items: kotlin.collections.List<CatalogsItemValidationIssues>,
    val bookmark: kotlin.String? = null
)
