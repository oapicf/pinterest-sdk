package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param requestId Unique identifier for this upload session. Must be passed to the process endpoint.
 * @param uploadUrl Pre-signed S3 PUT URL to upload the reviewed CSV file.
 * @param existingFilename If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
 */
data class DynamicTitlesUploadURL(

    @Schema(example = "549755814107-1099511703602-1714300000-abc123", required = true, description = "Unique identifier for this upload session. Must be passed to the process endpoint.")
    @param:JsonProperty("request_id")
    @get:JsonProperty("request_id", required = true) val requestId: kotlin.String,

    @Schema(example = "https://s3.amazonaws.com/bucket/dynamic_titles/candidate.csv?AWSAccessKeyId=...", required = true, description = "Pre-signed S3 PUT URL to upload the reviewed CSV file.")
    @param:JsonProperty("upload_url")
    @get:JsonProperty("upload_url", required = true) val uploadUrl: kotlin.String,

    @Schema(example = "aid-549755814107/ad_group-1099511703602/validated_approvals.csv", description = "If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("existing_filename")
    @get:JsonProperty("existing_filename") val existingFilename: kotlin.String? = null
) {

}

