package org.openapitools.server.model


/**
 * The result, and link out, based on the user’s choice.
 *
 * @param organicPinId  for example: ''null''
 * @param androidDeepLink  for example: ''null''
 * @param iosDeepLink  for example: ''null''
 * @param destinationUrl  for example: ''null''
 * @param resultId  for example: ''null''
*/
final case class QuizPinResult (
  organicPinId: Option[String] = None,
  androidDeepLink: Option[String] = None,
  iosDeepLink: Option[String] = None,
  destinationUrl: Option[String] = None,
  resultId: Option[Double] = None
)

