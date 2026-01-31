package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MediaUploadParameters
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
 * @param uploadParameters The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
 * @param uploadUrl The URL where you will POST your media file.
 */
data class MediaUpload(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "12345", required = true, readOnly = true, description = "Unique identifier for this media upload. Used to track status and for attaching during Pin creation.")
    @get:JsonProperty("media_id", required = true) val mediaId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("media_type", required = true) val mediaType: MediaUploadType,

    @field:Valid
    @Schema(example = "null", readOnly = true, description = "The list of parameter key/value pairs you will need to send with your POST request to upload your media file.")
    @get:JsonProperty("upload_parameters") val uploadParameters: MediaUploadParameters? = null,

    @Schema(example = "https://pinterest-media-upload.s3-accelerate.amazonaws.com/", readOnly = true, description = "The URL where you will POST your media file.")
    @get:JsonProperty("upload_url") val uploadUrl: kotlin.String? = null
) {

}

