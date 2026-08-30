package org.openapitools.server.model


/**
 * = NotificationResponse =
 *
 * @param errorMsg error message when success is false for example: ''null''
 * @param receivedAt Received time. Unix timestamp in seconds. for example: ''null''
 * @param success Returns true if the notification accepted. for example: ''null''
*/
final case class NotificationResponse (
  errorMsg: Option[String] = None,
  receivedAt: Option[Int] = None,
  success: Option[Boolean] = None
)

