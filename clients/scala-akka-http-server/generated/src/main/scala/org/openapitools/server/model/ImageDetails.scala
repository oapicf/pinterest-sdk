package org.openapitools.server.model


/**
 * = Image details containing the URL and dimensions. =
 *
 * @param height  for example: ''null''
 * @param url  for example: ''null''
 * @param width  for example: ''null''
*/
final case class ImageDetails (
  height: Int,
  url: String,
  width: Int
)

