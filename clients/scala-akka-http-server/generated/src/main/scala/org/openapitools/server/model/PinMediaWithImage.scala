package org.openapitools.server.model


/**
 * = image =
 *
 * Pin with image.
 *
 * @param images  for example: ''null''
 * @param mediaType  for example: ''null''
*/
final case class PinMediaWithImage (
  images: Option[Map[String, ImageDetails]],
  mediaType: Option[String]
)

