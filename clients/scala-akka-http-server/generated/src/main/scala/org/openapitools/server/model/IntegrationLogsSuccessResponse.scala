package org.openapitools.server.model


/**
 * Response when logs are successfully processed.
 *
 * @param message  for example: ''null''
*/
final case class IntegrationLogsSuccessResponse (
  message: Option[String] = None
)

