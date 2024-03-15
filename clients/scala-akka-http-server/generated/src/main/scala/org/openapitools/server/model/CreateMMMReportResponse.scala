package org.openapitools.server.model


/**
 * @param code  for example: ''0''
 * @param data  for example: ''null''
*/
final case class CreateMMMReportResponse (
  code: Option[Double] = None,
  data: Option[CreateMMMReportResponseData] = None
)

