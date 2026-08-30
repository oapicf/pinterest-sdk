package org.openapitools.server.model


/**
 * @param message Message returned from the create report request for example: ''null''
 * @param reportStatus Async report status for example: ''null''
 * @param size Size of the report in bytes for example: ''null''
 * @param token Token returned from the create report request for example: ''null''
 * @param url URL of the report for example: ''null''
*/
final case class ConversionProductReport (
  message: Option[String] = None,
  reportStatus: Option[BulkReportingJobStatus] = None,
  size: Option[Double] = None,
  token: Option[String] = None,
  url: Option[String] = None
)

