package org.openapitools.server.model


/**
 * @param message  for example: ''null''
 * @param reportStatus  for example: ''null''
 * @param token  for example: ''null''
*/
final case class AdsAnalyticsCreateAsyncResponse (
  message: Option[String] = None,
  reportStatus: Option[BulkReportingJobStatus] = None,
  token: Option[String] = None
)

