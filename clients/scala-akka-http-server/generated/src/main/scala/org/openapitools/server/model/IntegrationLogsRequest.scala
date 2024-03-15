package org.openapitools.server.model


/**
 * Batch of logs sent from an integration application.
 *
 * @param logs  for example: ''null''
*/
final case class IntegrationLogsRequest (
  logs: Seq[IntegrationLog]
)

