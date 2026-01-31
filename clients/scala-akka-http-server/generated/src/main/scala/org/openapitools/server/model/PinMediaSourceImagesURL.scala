package org.openapitools.server.model


/**
 * = Object containing images url definitions =
 *
 * Multiple URL-based images media source
 *
 * @param index  for example: ''null''
 * @param items Array with image objects. for example: ''null''
 * @param sourceType The source type of the media. for example: ''null''
*/
final case class PinMediaSourceImagesURL (
  index: Option[Int] = None,
  items: Seq[PinMediaSourceImagesURLItem],
  sourceType: String
)

