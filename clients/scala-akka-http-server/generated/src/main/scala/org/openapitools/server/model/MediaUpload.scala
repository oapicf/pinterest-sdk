package org.openapitools.server.model


/**
 * = Media upload =
 *
 * Media upload that has been registered but not uploaded/processed yet.
 *
 * @param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation. for example: ''null''
 * @param mediaType  for example: ''null''
 * @param uploadUrl The URL where you will POST your media file. for example: ''https://pinterest-media-upload.s3-accelerate.amazonaws.com/''
 * @param uploadParameters  for example: ''null''
*/
final case class MediaUpload (
  mediaId: Option[String] = None,
  mediaType: Option[MediaUploadType] = None,
  uploadUrl: Option[String] = None,
  uploadParameters: Option[MediaUploadAllOfUploadParameters] = None
)

