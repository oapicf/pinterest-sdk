package org.openapitools.server.model


/**
 * @param reportStatus  for example: ''null''
 * @param token  for example: ''null''
 * @param message  for example: ''null''
*/
final case class AdsAnalyticsCreateAsyncResponse (
  reportStatus: Option[BulkReportingJobStatus] = None,
  token: Option[String] = None,
  message: Option[String] = None
)

