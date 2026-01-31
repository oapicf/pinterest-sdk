
package org.openapitools.client.model


case class S3FilePart (
    /* Part number for upload. */
    _partNumber: Integer,
    /* Pre-signed URL. */
    _presignedUrl: String
)
object S3FilePart {
    def toStringBody(var_partNumber: Object, var_presignedUrl: Object) =
        s"""
        | {
        | "partNumber":$var_partNumber,"presignedUrl":$var_presignedUrl
        | }
        """.stripMargin
}
