package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinMediaSourceImageURL(
    /** The source type of the media. */
    val sourceType: kotlin.String,
    val url: kotlin.String,
    /** Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    val isStandard: kotlin.Boolean? = true
)
