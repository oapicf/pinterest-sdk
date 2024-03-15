package org.openapitools.server.model


/**
 * = Video ID =
 *
 * Video ID-based media source
 *
 * @param sourceType  for example: ''null''
 * @param coverImageUrl Cover image url. for example: ''null''
 * @param coverImageContentType Content type for cover image Base64. for example: ''null''
 * @param coverImageData Cover image Base64. for example: ''null''
 * @param mediaId  for example: ''null''
 * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. for example: ''null''
*/
final case class PinMediaSourceVideoID (
  sourceType: String,
  coverImageUrl: Option[String] = None,
  coverImageContentType: Option[String] = None,
  coverImageData: Option[String] = None,
  mediaId: String,
  isStandard: Option[Boolean] = None
)

