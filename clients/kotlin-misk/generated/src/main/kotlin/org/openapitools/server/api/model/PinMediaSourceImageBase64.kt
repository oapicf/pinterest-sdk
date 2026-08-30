package org.openapitools.server.api.model

import org.openapitools.server.api.model.ContentType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinMediaSourceImageBase64(
    val contentType: ContentType,
    val `data`: kotlin.String,
    /** The source type of the media. */
    val sourceType: kotlin.String,
    /** Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    val isStandard: kotlin.Boolean? = true
)
