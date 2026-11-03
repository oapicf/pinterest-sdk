package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param downloadUrl Pre-signed S3 URL to download the CSV file.
 */
data class DynamicTitlesDownloadCSV(

    @Schema(example = "https://s3.amazonaws.com/bucket/dynamic_titles/review.csv?AWSAccessKeyId=...", description = "Pre-signed S3 URL to download the CSV file.")
    @param:JsonProperty("download_url")
    @get:JsonProperty("download_url") val downloadUrl: kotlin.String? = null
) {

}

