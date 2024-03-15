package org.openapitools.server.model


/**
 * = Image metadata =
 *
 * @param itemType  for example: ''null''
 * @param title  for example: ''null''
 * @param description  for example: ''null''
 * @param link  for example: ''null''
 * @param images  for example: ''null''
*/
final case class ImageMetadata (
  itemType: Option[String] = None,
  title: Option[String] = None,
  description: Option[String] = None,
  link: Option[String] = None,
  images: Option[ImageMetadataImages] = None
)

