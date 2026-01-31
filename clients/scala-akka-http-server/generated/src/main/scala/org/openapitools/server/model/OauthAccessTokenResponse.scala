package org.openapitools.server.model


/**
 * = OAuth access token response =
 *
 * A successful OAuth access token response.
 *
 * @param accessToken  for example: ''null''
 * @param expiresIn  for example: ''null''
 * @param responseType  for example: ''null''
 * @param scope  for example: ''null''
 * @param tokenType  for example: ''null''
*/
final case class OauthAccessTokenResponse (
  accessToken: String,
  expiresIn: Int,
  responseType: Option[String] = None,
  scope: String,
  tokenType: String
)

