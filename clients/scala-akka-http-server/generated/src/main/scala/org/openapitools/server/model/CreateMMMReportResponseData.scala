package org.openapitools.server.model


/**
 * = CreateMMMReportResponseData =
 *
 * @param reportStatus  for example: ''null''
 * @param token  for example: ''null''
 * @param message  for example: ''null''
 * @param status  for example: ''success''
*/
final case class CreateMMMReportResponseData (
  reportStatus: Option[BulkReportingJobStatus] = None,
  token: Option[String] = None,
  message: Option[String] = None,
  status: Option[String] = None
)

