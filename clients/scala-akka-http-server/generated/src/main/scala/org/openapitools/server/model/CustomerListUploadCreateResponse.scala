package org.openapitools.server.model


/**
 * = CustomerListUploadCreateResponse =
 *
 * @param customerListUpload The Customer List Upload created. for example: ''null''
 * @param s3MultipartUploadData Pre-signed upload URLs corresponding to each part of the upload. for example: ''null''
*/
final case class CustomerListUploadCreateResponse (
  customerListUpload: CustomerListUpload,
  s3MultipartUploadData: S3MultipartUploadData
)

