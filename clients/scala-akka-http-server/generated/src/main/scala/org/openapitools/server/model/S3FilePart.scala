package org.openapitools.server.model


/**
 * = S3FilePart =
 *
 * @param partNumber Part number for upload. for example: ''1''
 * @param presignedUrl Pre-signed URL. for example: ''null''
*/
final case class S3FilePart (
  partNumber: Int,
  presignedUrl: String
)

