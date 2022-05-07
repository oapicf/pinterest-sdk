
package org.openapitools.client.model


case class MediaUploadDetails (
    _mediaId: Option[String],
    _mediaType: Option[MediaUploadType],
    _status: Option[MediaUploadStatus]
)
object MediaUploadDetails {
    def toStringBody(var_mediaId: Object, var_mediaType: Object, var_status: Object) =
        s"""
        | {
        | "mediaId":$var_mediaId,"mediaType":$var_mediaType,"status":$var_status
        | }
        """.stripMargin
}
