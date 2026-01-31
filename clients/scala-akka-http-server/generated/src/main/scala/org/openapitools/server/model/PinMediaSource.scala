package org.openapitools.server.model


/**
 * Pin media source that can be an image, video, or a mix of both passed in as a request.
 *
 * @param contentType  for example: ''null''
 * @param data  for example: ''null''
 * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. for example: ''null''
 * @param sourceType  for example: ''null''
 * @param url  for example: ''null''
 * @param coverImageContentType Content type for cover image Base64. for example: ''null''
 * @param coverImageData Cover image Base64. for example: ''null''
 * @param coverImageKeyFrameTime Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. for example: ''null''
 * @param coverImageUrl Cover image URL. for example: ''null''
 * @param mediaId  for example: ''null''
 * @param index  for example: ''null''
 * @param items Array with image objects. for example: ''null''
 * @param isAffiliateLink This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. for example: ''null''
*/
final case class PinMediaSource (
  contentType: ContentType,
  data: String,
  isStandard: Option[Boolean] = None,
  sourceType: String,
  url: String,
  coverImageContentType: Option[ContentType] = None,
  coverImageData: Option[String] = None,
  coverImageKeyFrameTime: Option[Int] = None,
  coverImageUrl: Option[String] = None,
  mediaId: String,
  index: Option[Int] = None,
  items: Seq[PinMediaSourceImagesURLItem],
  isAffiliateLink: Option[Boolean] = None
)

