
package org.openapitools.client.model


case class MediaUploadCreate (
    _mediaType: MediaUploadType
)
object MediaUploadCreate {
    def toStringBody(var_mediaType: Object) =
        s"""
        | {
        | "mediaType":$var_mediaType
        | }
        """.stripMargin
}
