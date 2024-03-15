package org.openapitools.server.model


/**
 * @param code  for example: ''0''
 * @param data  for example: ''null''
 * @param message  for example: ''ok''
 * @param status  for example: ''success''
*/
final case class GetMMMReportResponse (
  code: Option[Double] = None,
  data: Option[GetMMMReportResponseData] = None,
  message: Option[String] = None,
  status: Option[String] = None
)

