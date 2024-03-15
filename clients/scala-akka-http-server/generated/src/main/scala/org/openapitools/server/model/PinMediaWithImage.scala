package org.openapitools.server.model


/**
 * = image =
 *
 * Pin with image.
 *
 * @param mediaType  for example: ''null''
 * @param images  for example: ''null''
*/
final case class PinMediaWithImage (
  mediaType: Option[String] = None,
  images: Option[ImageMetadataImages] = None
)

