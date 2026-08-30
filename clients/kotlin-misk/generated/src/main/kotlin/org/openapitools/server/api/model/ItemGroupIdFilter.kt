package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringCriteria
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemGroupIdFilter(
    val ITEM_GROUP_ID: CatalogsProductGroupMultipleStringCriteria
)
