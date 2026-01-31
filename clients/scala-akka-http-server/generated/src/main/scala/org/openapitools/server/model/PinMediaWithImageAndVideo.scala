package org.openapitools.server.model


/**
 * = Object containing video and image definitions. =
 *
 * Pin with a mix of images and videos.
 *
 * @param items  for example: ''null''
 * @param mediaType  for example: ''null''
*/
final case class PinMediaWithImageAndVideo (
  items: Option[Seq[PinMediaMetadata]] = None,
  mediaType: String
)

