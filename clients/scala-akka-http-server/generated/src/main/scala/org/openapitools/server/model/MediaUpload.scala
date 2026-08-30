package org.openapitools.server.model


/**
 * = Media upload details =
 *
 * Media upload that has been registered but not uploaded/processed yet.
 *
 * @param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation. for example: ''12345''
 * @param mediaType  for example: ''video''
 * @param uploadParameters The list of parameter key/value pairs you will need to send with your POST request to upload your media file. for example: ''null''
 * @param uploadUrl The URL where you will POST your media file. for example: ''https://pinterest-media-upload.s3-accelerate.amazonaws.com/''
*/
final case class MediaUpload (
  mediaId: String,
  mediaType: MediaUploadType,
  uploadParameters: Option[MediaUploadParameters] = None,
  uploadUrl: Option[String] = None
)

