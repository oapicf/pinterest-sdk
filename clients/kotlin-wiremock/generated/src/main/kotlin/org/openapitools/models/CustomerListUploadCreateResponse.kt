@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CustomerListUploadCreateResponse(
    @field:JsonProperty("customer_list_upload")
    val customerListUpload: CustomerListUpload,

    @field:JsonProperty("s3_multipart_upload_data")
    val s3MultipartUploadData: S3MultipartUploadData,

)
