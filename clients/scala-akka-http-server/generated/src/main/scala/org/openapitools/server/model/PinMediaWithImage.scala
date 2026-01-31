package org.openapitools.server.model


/**
 * = Object containing image definitions. =
 *
 * Pin with image.
 *
 * @param images  for example: ''null''
 * @param mediaType  for example: ''null''
*/
final case class PinMediaWithImage (
  images: Option[ImageSize] = None,
  mediaType: String
)

