package org.openapitools.server.model


/**
 * @param `150x150`  for example: ''null''
 * @param `400x300`  for example: ''null''
 * @param `600x`  for example: ''null''
 * @param `1200x`  for example: ''null''
*/
final case class ImageMetadataImages (
  `150x150`: Option[ImageDetails] = None,
  `400x300`: Option[ImageDetails] = None,
  `600x`: Option[ImageDetails] = None,
  `1200x`: Option[ImageDetails] = None
)

