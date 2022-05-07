
package org.openapitools.client.model


case class MediaUploadAllOf (
    /* Unique identifier for this media upload. Used to track status and for attaching during Pin creation. */
    _mediaId: Option[String],
    _mediaType: Option[MediaUploadType],
    /* The URL where you will POST your media file. */
    _uploadUrl: Option[String],
    _uploadParameters: Option[MediaUploadAllOfUploadParameters]
)
object MediaUploadAllOf {
    def toStringBody(var_mediaId: Object, var_mediaType: Object, var_uploadUrl: Object, var_uploadParameters: Object) =
        s"""
        | {
        | "mediaId":$var_mediaId,"mediaType":$var_mediaType,"uploadUrl":$var_uploadUrl,"uploadParameters":$var_uploadParameters
        | }
        """.stripMargin
}
