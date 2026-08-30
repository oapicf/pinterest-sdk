package org.openapitools.server.model


/**
 * Pin image data for trending topics
 *
 * @param color Dominant color of the pin image in hex format for example: ''null''
 * @param height Height of the pin image in pixels for example: ''null''
 * @param id Unique identifier for the pin for example: ''null''
 * @param src URL of the pin image for example: ''null''
 * @param verticalOffset The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom. for example: ''null''
 * @param width Width of the pin image in pixels for example: ''null''
*/
final case class TrendingPin (
  color: String,
  height: Int,
  id: String,
  src: String,
  verticalOffset: Option[Double] = None,
  width: Int
)

