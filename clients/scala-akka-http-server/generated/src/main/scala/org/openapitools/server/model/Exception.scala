package org.openapitools.server.model


/**
 * = Generic exception class to be used within schemas =
 *
 * @param code Exception error code. for example: ''2''
 * @param message Exception message. for example: ''Advertiser not found.''
*/
final case class Exception (
  code: Option[Int] = None,
  message: Option[String] = None
)

