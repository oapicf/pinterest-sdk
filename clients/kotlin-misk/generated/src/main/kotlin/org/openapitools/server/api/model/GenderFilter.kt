package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupMultipleGenderCriteria
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GenderFilter(
    val GENDER: CatalogsProductGroupMultipleGenderCriteria
)
