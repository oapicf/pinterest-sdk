package org.openapitools.server.model


/**
 * = Image metadata containing the description, images, item type, link, and title. =
 *
 * @param description  for example: ''null''
 * @param images  for example: ''null''
 * @param itemType  for example: ''null''
 * @param link  for example: ''null''
 * @param title  for example: ''null''
*/
final case class ImageMetadata (
  description: Option[String] = None,
  images: Option[ImageSize] = None,
  itemType: Option[String] = None,
  link: Option[String] = None,
  title: Option[String] = None
)

