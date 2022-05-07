package org.openapitools.server.model


/**
 * = Media upload =
 *
 * Media upload that has been registered but not uploaded/processed yet.
 *
 * @param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation. for example: ''null''
 * @param mediaType  for example: ''video''
 * @param uploadUrl The URL where you will POST your media file. for example: ''https://pinterest-media-upload.s3-accelerate.amazonaws.com/''
 * @param uploadParameters  for example: ''null''
*/
final case class MediaUpload (
  mediaId: Option[String],
  mediaType: Option[MediaUploadType],
  uploadUrl: Option[String],
  uploadParameters: Option[MediaUploadAllOfUploadParameters]
)

