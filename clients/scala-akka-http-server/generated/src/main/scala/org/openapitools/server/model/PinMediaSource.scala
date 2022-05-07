package org.openapitools.server.model


/**
 * = Pin media source =
 *
 * Pin media source.
 *
 * @param sourceType  for example: ''null''
 * @param contentType  for example: ''null''
 * @param data  for example: ''null''
 * @param url  for example: ''null''
 * @param coverImageUrl  for example: ''null''
 * @param mediaId  for example: ''null''
*/
final case class PinMediaSource (
  sourceType: String,
  contentType: String,
  data: String,
  url: String,
  coverImageUrl: String,
  mediaId: String
)

