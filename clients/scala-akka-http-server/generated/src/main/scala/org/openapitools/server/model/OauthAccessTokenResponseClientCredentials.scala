package org.openapitools.server.model


/**
 * = OAuth client token response =
 *
 * A successful OAuth client token response for the client token flow.
 *
 * @param accessToken  for example: ''null''
 * @param expiresIn  for example: ''null''
 * @param responseType  for example: ''null''
 * @param scope  for example: ''null''
 * @param tokenType  for example: ''null''
*/
final case class OauthAccessTokenResponseClientCredentials (
  accessToken: String,
  expiresIn: Int,
  responseType: Option[String] = None,
  scope: String,
  tokenType: String
)

