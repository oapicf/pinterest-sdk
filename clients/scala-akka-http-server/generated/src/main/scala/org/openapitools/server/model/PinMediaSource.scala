package org.openapitools.server.model


/**
 * = Pin media source =
 *
 * Pin media source.
 *
 * @param sourceType  for example: ''null''
 * @param contentType  for example: ''null''
 * @param data  for example: ''null''
 * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. for example: ''null''
 * @param url  for example: ''null''
 * @param coverImageUrl Cover image url. for example: ''null''
 * @param coverImageContentType Content type for cover image Base64. for example: ''null''
 * @param coverImageData Cover image Base64. for example: ''null''
 * @param mediaId  for example: ''null''
 * @param items Array with image objects. for example: ''null''
 * @param index  for example: ''null''
 * @param isAffiliateLink This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. for example: ''null''
*/
final case class PinMediaSource (
  sourceType: String,
  contentType: String,
  data: String,
  isStandard: Option[Boolean] = None,
  url: String,
  coverImageUrl: Option[String] = None,
  coverImageContentType: Option[String] = None,
  coverImageData: Option[String] = None,
  mediaId: String,
  items: Seq[PinMediaSourceImagesURLItemsInner],
  index: Option[Int] = None,
  isAffiliateLink: Option[Boolean] = None
)

