package org.openapitools.server.model


/**
 * = Image Base64 =
 *
 * Base64-encoded image media source
 *
 * @param sourceType  for example: ''null''
 * @param contentType  for example: ''null''
 * @param data  for example: ''null''
*/
final case class PinMediaSourceImageBase64 (
  sourceType: String,
  contentType: String,
  data: String
)

