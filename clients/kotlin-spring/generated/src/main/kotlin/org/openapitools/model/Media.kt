package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.MediaUploadStatus
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
 * 
 * @param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
 * @param mediaType 
 * @param status 
 */
data class Media(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "12345", required = true, readOnly = true, description = "Unique identifier for this media upload. Used to track status and for attaching during Pin creation.")
    @param:JsonProperty("media_id")
    @get:JsonProperty("media_id", required = true) val mediaId: kotlin.String,

    @field:Valid
    @Schema(example = "video", required = true, description = "")
    @param:JsonProperty("media_type")
    @get:JsonProperty("media_type", required = true) val mediaType: MediaUploadType,

    @field:Valid
    @Schema(readOnly = true, description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: MediaUploadStatus? = null
) {

}

