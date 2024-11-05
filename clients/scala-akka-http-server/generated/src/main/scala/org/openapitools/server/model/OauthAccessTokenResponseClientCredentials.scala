package org.openapitools.server.model


/**
 * = OAuth client token response =
 *
 * A successful OAuth client token response for the client token flow.
 *
 * @param responseType  for example: ''null''
 * @param accessToken  for example: ''null''
 * @param tokenType  for example: ''null''
 * @param expiresIn  for example: ''null''
 * @param scope  for example: ''null''
*/
final case class OauthAccessTokenResponseClientCredentials (
  responseType: Option[String] = None,
  accessToken: String,
  tokenType: String,
  expiresIn: Int,
  scope: String
)

