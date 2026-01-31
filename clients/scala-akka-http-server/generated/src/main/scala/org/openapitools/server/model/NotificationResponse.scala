package org.openapitools.server.model


/**
 * = NotificationResponse =
 *
 * @param success Returns true if the notification accepted. for example: ''false''
 * @param receivedAt Received time. Unix timestamp in seconds. for example: ''1677003860''
 * @param errorMsg error message when success is false for example: ''null''
*/
final case class NotificationResponse (
  success: Option[Boolean] = None,
  receivedAt: Option[Int] = None,
  errorMsg: Option[String] = None
)

