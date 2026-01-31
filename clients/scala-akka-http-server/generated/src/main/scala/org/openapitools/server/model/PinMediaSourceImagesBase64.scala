package org.openapitools.server.model


/**
 * = Object containing Base64 image definitions =
 *
 * Multiple Base64-based images media source
 *
 * @param index  for example: ''null''
 * @param items Array with image objects. for example: ''null''
 * @param sourceType The source type of the media. for example: ''null''
*/
final case class PinMediaSourceImagesBase64 (
  index: Option[Int] = None,
  items: Seq[PinMediaSourceImagesBase64Item],
  sourceType: String
)

