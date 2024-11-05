package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MediaUploadAllOfUploadParameters
import org.openapitools.model.MediaUploadType
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Media upload that has been registered but not uploaded/processed yet.
 * @param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
 * @param mediaType 
 * @param uploadUrl The URL where you will POST your media file.
 * @param uploadParameters 
 */
data class MediaUpload(

    @Schema(example = "null", description = "Unique identifier for this media upload. Used to track status and for attaching during Pin creation.")
    @get:JsonProperty("media_id") val mediaId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("media_type") val mediaType: MediaUploadType? = null,

    @Schema(example = "https://pinterest-media-upload.s3-accelerate.amazonaws.com/", description = "The URL where you will POST your media file.")
    @get:JsonProperty("upload_url") val uploadUrl: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("upload_parameters") val uploadParameters: MediaUploadAllOfUploadParameters? = null
    ) {

}

