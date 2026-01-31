
package org.openapitools.client.model


case class S3MultipartUploadData (
    /* Array of file parts with pre-signed URLs. */
    _fileParts: Option[List[S3FilePart]]
)
object S3MultipartUploadData {
    def toStringBody(var_fileParts: Object) =
        s"""
        | {
        | "fileParts":$var_fileParts
        | }
        """.stripMargin
}
