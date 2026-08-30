package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param logs  for example: ''null''
*/
final case class IntegrationLogsRequestCreate (
  logs: Seq[IntegrationLog]
)

