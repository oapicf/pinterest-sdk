package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.S3FilePart
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
 * @param fileParts Array of file parts with pre-signed URLs.
 */
data class S3MultipartUploadData(

    @field:Valid
    @Schema(example = "null", description = "Array of file parts with pre-signed URLs.")
    @get:JsonProperty("file_parts") val fileParts: kotlin.collections.List<S3FilePart>? = null
) {

}

