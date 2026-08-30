package org.openapitools.server.api.model

import org.openapitools.server.api.model.EntityLabel
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EntityLabelError(
    val `data`: EntityLabel? = null,
    val errorMessages: kotlin.collections.List<kotlin.String>? = null
)
