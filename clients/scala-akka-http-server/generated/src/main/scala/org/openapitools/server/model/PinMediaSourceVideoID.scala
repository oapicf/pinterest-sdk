package org.openapitools.server.model


/**
 * = Video ID =
 *
 * Video ID-based media source
 *
 * @param sourceType  for example: ''null''
 * @param coverImageUrl  for example: ''null''
 * @param mediaId  for example: ''null''
*/
final case class PinMediaSourceVideoID (
  sourceType: String,
  coverImageUrl: String,
  mediaId: String
)

