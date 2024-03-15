package org.openapitools.server.model


/**
 * = Detailed Error =
 *
 * Used for including extra details to a base error
 *
 * @param code  for example: ''null''
 * @param message  for example: ''null''
 * @param details  for example: ''null''
*/
final case class DetailedError (
  code: Int,
  message: String,
  details: Any
)

