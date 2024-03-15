package org.openapitools.server.model


/**
 * = Images Base64 =
 *
 * Multiple Base64-encoded images media source
 *
 * @param sourceType  for example: ''null''
 * @param items Array with image objects. for example: ''null''
 * @param index  for example: ''null''
*/
final case class PinMediaSourceImagesBase64 (
  sourceType: Option[String] = None,
  items: Seq[PinMediaSourceImagesBase64ItemsInner],
  index: Option[Int] = None
)

