package org.openapitools.server.model


/**
 * = GetMMMReportResponseData =
 *
 * @param reportStatus  for example: ''null''
 * @param url  for example: ''null''
 * @param size  for example: ''null''
*/
final case class GetMMMReportResponseData (
  reportStatus: Option[String] = None,
  url: Option[String] = None,
  size: Option[Double] = None
)

