package org.openapitools.server.model


/**
 * Schema for log sent from an integration application.
 *
 * @param advertiserId  for example: ''null''
 * @param appVersionNumber Version number of the integration application. for example: ''null''
 * @param clientTimestamp Timestamp in milliseconds of when the log was executed at the client. for example: ''null''
 * @param error  for example: ''null''
 * @param eventType Log event type for example: ''null''
 * @param externalBusinessId  for example: ''null''
 * @param feedProfileId  for example: ''null''
 * @param logLevel Log level type for example: ''null''
 * @param merchantId  for example: ''null''
 * @param message Explanation of the event that occured. for example: ''null''
 * @param platformVersionNumber Version number of the platform the integration application is running on. for example: ''null''
 * @param request  for example: ''null''
 * @param tagId  for example: ''null''
*/
final case class IntegrationLog (
  advertiserId: Option[String] = None,
  appVersionNumber: Option[String] = None,
  clientTimestamp: Int,
  error: Option[IntegrationLogClientError] = None,
  eventType: IntegrationLogEventType,
  externalBusinessId: Option[String] = None,
  feedProfileId: Option[String] = None,
  logLevel: IntegrationLogLevel,
  merchantId: Option[String] = None,
  message: Option[String] = None,
  platformVersionNumber: Option[String] = None,
  request: Option[IntegrationLogClientRequest] = None,
  tagId: Option[String] = None
)

