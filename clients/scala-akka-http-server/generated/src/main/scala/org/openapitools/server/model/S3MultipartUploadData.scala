package org.openapitools.server.model


/**
 * = S3MultipartUploadData =
 *
 * @param fileParts Array of file parts with pre-signed URLs. for example: ''null''
*/
final case class S3MultipartUploadData (
  fileParts: Option[Seq[S3FilePart]] = None
)

