package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MediaUploadAllOfUploadParameters
import org.openapitools.model.MediaUploadType
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
 * @param mediaType 
 * @param uploadUrl The URL where you will POST your media file.
 * @param uploadParameters 
 */
data class MediaUploadAllOf(

    @field:JsonProperty("media_id") val mediaId: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("media_type") val mediaType: MediaUploadType? = null,

    @field:JsonProperty("upload_url") val uploadUrl: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("upload_parameters") val uploadParameters: MediaUploadAllOfUploadParameters? = null
) {

}

