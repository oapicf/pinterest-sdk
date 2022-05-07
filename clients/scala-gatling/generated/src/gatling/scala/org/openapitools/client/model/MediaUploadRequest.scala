
package org.openapitools.client.model


case class MediaUploadRequest (
    _mediaType: MediaUploadType
)
object MediaUploadRequest {
    def toStringBody(var_mediaType: Object) =
        s"""
        | {
        | "mediaType":$var_mediaType
        | }
        """.stripMargin
}
