package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CustomerListUpload
import org.openapitools.model.S3MultipartUploadData
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
 * @param customerListUpload 
 * @param s3MultipartUploadData 
 */
data class CustomerListUploadCreateResponse(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("customer_list_upload", required = true) val customerListUpload: CustomerListUpload,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("s3_multipart_upload_data", required = true) val s3MultipartUploadData: S3MultipartUploadData
) {

}

