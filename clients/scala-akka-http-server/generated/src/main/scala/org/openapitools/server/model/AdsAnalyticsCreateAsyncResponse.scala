package org.openapitools.server.model


/**
 * @param reportStatus  for example: ''null''
 * @param token  for example: ''null''
 * @param message  for example: ''null''
*/
final case class AdsAnalyticsCreateAsyncResponse (
  reportStatus: Option[String],
  token: Option[String],
  message: Option[String]
)

