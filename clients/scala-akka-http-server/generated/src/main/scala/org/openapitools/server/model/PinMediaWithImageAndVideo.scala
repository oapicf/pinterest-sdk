package org.openapitools.server.model


/**
 * = Video and image =
 *
 * Pin with a mix of images and videos.
 *
 * @param mediaType  for example: ''null''
 * @param items  for example: ''null''
*/
final case class PinMediaWithImageAndVideo (
  mediaType: Option[String] = None,
  items: Option[Seq[PinMediaMetadata]] = None
)

