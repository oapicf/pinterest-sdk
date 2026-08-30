
package org.openapitools.client.model


case class CustomerListUploadCreateResponse (
    /* The Customer List Upload created. */
    _customerListUpload: CustomerListUpload,
    /* Pre-signed upload URLs corresponding to each part of the upload. */
    _s3MultipartUploadData: S3MultipartUploadData
)
object CustomerListUploadCreateResponse {
    def toStringBody(var_customerListUpload: Object, var_s3MultipartUploadData: Object) =
        s"""
        | {
        | "customerListUpload":$var_customerListUpload,"s3MultipartUploadData":$var_s3MultipartUploadData
        | }
        """.stripMargin
}
