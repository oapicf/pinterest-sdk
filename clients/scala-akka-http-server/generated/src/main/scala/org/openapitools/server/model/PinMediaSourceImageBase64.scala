package org.openapitools.server.model


/**
 * = Object containing Base64 format =
 *
 * Image Base64-based media source.
 *
 * @param contentType  for example: ''null''
 * @param data  for example: ''null''
 * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. for example: ''null''
 * @param sourceType The source type of the media. for example: ''null''
*/
final case class PinMediaSourceImageBase64 (
  contentType: ContentType,
  data: String,
  isStandard: Option[Boolean] = None,
  sourceType: String
)

