package org.openapitools.server.api.model

import org.openapitools.server.api.model.CustomerListUpload
import org.openapitools.server.api.model.S3MultipartUploadData
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CustomerListUploadCreateResponse(
    /** The Customer List Upload created. */
    val customerListUpload: CustomerListUpload,
    /** Pre-signed upload URLs corresponding to each part of the upload. */
    val s3MultipartUploadData: S3MultipartUploadData
)
