package org.openapitools.server.model


/**
 * @param reportStatus  for example: ''null''
 * @param url  for example: ''null''
 * @param size  for example: ''null''
*/
final case class AdsAnalyticsGetAsyncResponse (
  reportStatus: Option[String],
  url: Option[String],
  size: Option[Double]
)

