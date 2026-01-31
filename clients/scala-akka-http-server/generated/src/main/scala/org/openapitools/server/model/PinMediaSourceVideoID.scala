package org.openapitools.server.model


/**
 * = Object containing Video ID definitions. =
 *
 * Video ID-based media source.
 *
 * @param coverImageContentType Content type for cover image Base64. for example: ''null''
 * @param coverImageData Cover image Base64. for example: ''null''
 * @param coverImageKeyFrameTime Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. for example: ''null''
 * @param coverImageUrl Cover image URL. for example: ''null''
 * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. for example: ''null''
 * @param mediaId  for example: ''null''
 * @param sourceType  for example: ''null''
*/
final case class PinMediaSourceVideoID (
  coverImageContentType: Option[ContentType] = None,
  coverImageData: Option[String] = None,
  coverImageKeyFrameTime: Option[Int] = None,
  coverImageUrl: Option[String] = None,
  isStandard: Option[Boolean] = None,
  mediaId: String,
  sourceType: String
)

