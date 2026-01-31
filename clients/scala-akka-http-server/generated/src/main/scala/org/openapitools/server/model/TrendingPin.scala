package org.openapitools.server.model


/**
 * Pin image data for trending topics
 *
 * @param height Height of the pin image in pixels for example: ''null''
 * @param id Unique identifier for the pin for example: ''null''
 * @param src URL of the pin image for example: ''null''
 * @param width Width of the pin image in pixels for example: ''null''
*/
final case class TrendingPin (
  height: Int,
  id: String,
  src: String,
  width: Int
)

