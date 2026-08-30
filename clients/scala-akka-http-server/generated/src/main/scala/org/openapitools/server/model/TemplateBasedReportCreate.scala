package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param message  for example: ''null''
 * @param reportStatus  for example: ''null''
 * @param token  for example: ''null''
*/
final case class TemplateBasedReportCreate (
  message: Option[String] = None,
  reportStatus: BulkReportingJobStatus,
  token: Option[String] = None
)

