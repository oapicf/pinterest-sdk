package org.openapitools.server.model


/**
 * = CreateMMMReportResponseData =
 *
 * @param message  for example: ''null''
 * @param reportStatus  for example: ''null''
 * @param status  for example: ''success''
 * @param token  for example: ''null''
*/
final case class CreateMMMReportResponseData (
  message: Option[String] = None,
  reportStatus: Option[BulkReportingJobStatus] = None,
  status: Option[String] = None,
  token: Option[String] = None
)

