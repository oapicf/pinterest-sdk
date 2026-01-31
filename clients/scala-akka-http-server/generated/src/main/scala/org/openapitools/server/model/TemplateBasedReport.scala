package org.openapitools.server.model


/**
 * @param message  for example: ''null''
 * @param reportStatus  for example: ''null''
 * @param templateId Unique identifier of a template. for example: ''null''
 * @param token  for example: ''null''
*/
final case class TemplateBasedReport (
  message: Option[String] = None,
  reportStatus: BulkReportingJobStatus,
  templateId: String,
  token: Option[String] = None
)

