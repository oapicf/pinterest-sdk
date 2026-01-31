package org.openapitools.server.model


/**
 * @param reportStatus  for example: ''null''
 * @param size  for example: ''null''
 * @param url  for example: ''null''
*/
final case class AdsAnalyticsGetAsyncResponse (
  reportStatus: Option[BulkReportingJobStatus] = None,
  size: Option[Double] = None,
  url: Option[String] = None
)

