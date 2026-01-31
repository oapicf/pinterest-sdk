package org.openapitools.server.model


/**
 * = Image Base64 =
 *
 * Base64-encoded image media source
 *
 * @param contentType  for example: ''null''
 * @param data  for example: ''null''
*/
final case class ImageBase64 (
  contentType: String,
  data: String
)

