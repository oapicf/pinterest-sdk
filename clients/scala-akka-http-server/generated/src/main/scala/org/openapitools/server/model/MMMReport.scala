package org.openapitools.server.model


/**
 * @param message  for example: ''null''
 * @param reportStatus  for example: ''null''
 * @param size  for example: ''null''
 * @param status  for example: ''success''
 * @param token  for example: ''null''
 * @param url  for example: ''null''
*/
final case class MMMReport (
  message: Option[String] = None,
  reportStatus: Option[BulkReportingJobStatus] = None,
  size: Option[Double] = None,
  status: Option[String] = None,
  token: Option[String] = None,
  url: Option[String] = None
)

