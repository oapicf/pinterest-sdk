package org.openapitools.server.model


/**
 * = Media upload information. =
 *
 * @param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation. for example: ''12345''
 * @param mediaType  for example: ''video''
 * @param status  for example: ''null''
*/
final case class Media (
  mediaId: String,
  mediaType: MediaUploadType,
  status: Option[MediaUploadStatus] = None
)

