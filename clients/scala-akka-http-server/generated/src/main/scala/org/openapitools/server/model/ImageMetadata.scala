package org.openapitools.server.model


/**
 * = Image metadata containing the description, images, item type, link, and title. =
 *
 * @param description  for example: ''null''
 * @param images  for example: ''null''
 * @param itemType Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload. for example: ''null''
 * @param link  for example: ''null''
 * @param title  for example: ''null''
*/
final case class ImageMetadata (
  description: Option[String] = None,
  images: Option[ImageSize] = None,
  itemType: String,
  link: Option[String] = None,
  title: Option[String] = None
)

