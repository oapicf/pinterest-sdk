package org.openapitools.server.model


/**
 * = CustomerListUploadCreateResponse =
 *
 * @param customerListUpload  for example: ''null''
 * @param s3MultipartUploadData  for example: ''null''
*/
final case class CustomerListUploadCreateResponse (
  customerListUpload: CustomerListUpload,
  s3MultipartUploadData: S3MultipartUploadData
)

