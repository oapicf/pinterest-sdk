
package org.openapitools.client.model


case class MediaUpload (
    /* Unique identifier for this media upload. Used to track status and for attaching during Pin creation. */
    _mediaId: String,
    _mediaType: MediaUploadType,
    /* The list of parameter key/value pairs you will need to send with your POST request to upload your media file. */
    _uploadParameters: Option[MediaUploadParameters],
    /* The URL where you will POST your media file. */
    _uploadUrl: Option[String]
)
object MediaUpload {
    def toStringBody(var_mediaId: Object, var_mediaType: Object, var_uploadParameters: Object, var_uploadUrl: Object) =
        s"""
        | {
        | "mediaId":$var_mediaId,"mediaType":$var_mediaType,"uploadParameters":$var_uploadParameters,"uploadUrl":$var_uploadUrl
        | }
        """.stripMargin
}
