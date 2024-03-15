package org.openapitools.server.model


/**
 * = Images urls =
 *
 * Multiple images urls-based media source
 *
 * @param sourceType  for example: ''null''
 * @param items Array with image objects. for example: ''null''
 * @param index  for example: ''null''
*/
final case class PinMediaSourceImagesURL (
  sourceType: Option[String] = None,
  items: Seq[PinMediaSourceImagesURLItemsInner],
  index: Option[Int] = None
)

