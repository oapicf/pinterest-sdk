package org.openapitools.server.model


/**
 * = Generic Error =
 *
 * Default error response
 *
 * @param code  for example: ''null''
 * @param message  for example: ''null''
*/
final case class Error (
  code: Int,
  message: String
)

