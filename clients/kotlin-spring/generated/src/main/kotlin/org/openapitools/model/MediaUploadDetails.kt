package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MediaUploadStatus
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
 * Media upload details
 * @param mediaId 
 * @param mediaType 
 * @param status 
 */
data class MediaUploadDetails(
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("media_id") val mediaId: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("media_type") val mediaType: MediaUploadType? = null,

    @field:Valid
    @field:JsonProperty("status") val status: MediaUploadStatus? = null
) {

}

