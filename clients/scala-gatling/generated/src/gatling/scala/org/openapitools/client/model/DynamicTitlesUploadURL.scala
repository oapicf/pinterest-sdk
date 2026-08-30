
package org.openapitools.client.model


case class DynamicTitlesUploadURL (
    /* If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. */
    _existingFilename: Option[String],
    /* Unique identifier for this upload session. Must be passed to the process endpoint. */
    _requestId: String,
    /* Pre-signed S3 PUT URL to upload the reviewed CSV file. */
    _uploadUrl: String
)
object DynamicTitlesUploadURL {
    def toStringBody(var_existingFilename: Object, var_requestId: Object, var_uploadUrl: Object) =
        s"""
        | {
        | "existingFilename":$var_existingFilename,"requestId":$var_requestId,"uploadUrl":$var_uploadUrl
        | }
        """.stripMargin
}
