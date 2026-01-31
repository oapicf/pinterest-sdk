package org.openapitools.server.model


/**
 * The result, and link out, based on the user’s choice.
 *
 * @param androidDeepLink  for example: ''null''
 * @param destinationUrl  for example: ''null''
 * @param iosDeepLink  for example: ''null''
 * @param organicPinId  for example: ''null''
 * @param resultId  for example: ''null''
*/
final case class QuizPinResult (
  androidDeepLink: Option[String] = None,
  destinationUrl: Option[String] = None,
  iosDeepLink: Option[String] = None,
  organicPinId: Option[String] = None,
  resultId: Option[Double] = None
)

