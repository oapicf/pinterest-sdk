package org.openapitools.server.model


/**
 * = Object containing images definitions. =
 *
 * Pin with multiple images.
 *
 * @param items  for example: ''null''
 * @param mediaType  for example: ''null''
*/
final case class PinMediaWithImages (
  items: Option[Seq[ImageMetadata]] = None,
  mediaType: String
)

