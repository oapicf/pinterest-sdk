package org.openapitools.server.model


/**
 * = Image Base64 =
 *
 * Base64-encoded image media source
 *
 * @param sourceType  for example: ''null''
 * @param contentType  for example: ''null''
 * @param data  for example: ''null''
 * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. for example: ''null''
*/
final case class PinMediaSourceImageBase64 (
  sourceType: String,
  contentType: String,
  data: String,
  isStandard: Option[Boolean] = None
)

