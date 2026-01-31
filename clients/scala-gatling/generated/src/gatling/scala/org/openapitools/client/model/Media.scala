
package org.openapitools.client.model


case class Media (
    /* Unique identifier for this media upload. Used to track status and for attaching during Pin creation. */
    _mediaId: String,
    _mediaType: MediaUploadType,
    _status: Option[MediaUploadStatus]
)
object Media {
    def toStringBody(var_mediaId: Object, var_mediaType: Object, var_status: Object) =
        s"""
        | {
        | "mediaId":$var_mediaId,"mediaType":$var_mediaType,"status":$var_status
        | }
        """.stripMargin
}
