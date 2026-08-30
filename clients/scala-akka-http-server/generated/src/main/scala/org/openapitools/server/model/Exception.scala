package org.openapitools.server.model


/**
 * @param code  for example: ''2''
 * @param message  for example: ''Advertiser not found.''
*/
final case class Exception (
  code: Option[Int] = None,
  message: String
)

