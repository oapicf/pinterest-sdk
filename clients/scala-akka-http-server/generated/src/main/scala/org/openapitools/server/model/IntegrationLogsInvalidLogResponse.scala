package org.openapitools.server.model


/**
 * Schema describing the response when a log has invalid fields.
 *
 * @param rejectedLogs  for example: ''null''
*/
final case class IntegrationLogsInvalidLogResponse (
  rejectedLogs: Option[Seq[IntegrationLogsInvalidLogResponseRejectedLogsInner]] = None
)

