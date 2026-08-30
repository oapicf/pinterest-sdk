package org.openapitools.server.model


/**
 * = Conversion access token response =
 *
 * A successful conversion access token response.
 *
 * @param accessToken  for example: ''null''
 * @param tokenType  for example: ''null''
*/
final case class ConversionAccessToken (
  accessToken: String,
  tokenType: Option[String] = None
)

