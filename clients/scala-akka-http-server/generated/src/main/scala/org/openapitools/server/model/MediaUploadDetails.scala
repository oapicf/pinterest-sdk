package org.openapitools.server.model


/**
 * = Media upload details =
 *
 * Media upload details
 *
 * @param mediaId  for example: ''null''
 * @param mediaType  for example: ''null''
 * @param status  for example: ''null''
*/
final case class MediaUploadDetails (
  mediaId: Option[String] = None,
  mediaType: Option[MediaUploadType] = None,
  status: Option[MediaUploadStatus] = None
)

