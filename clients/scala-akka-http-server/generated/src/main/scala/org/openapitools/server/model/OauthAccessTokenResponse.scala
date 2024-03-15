package org.openapitools.server.model


/**
 * = OAuth access token response =
 *
 * A successful OAuth access token response.
 *
 * @param responseType  for example: ''null''
 * @param accessToken  for example: ''null''
 * @param tokenType  for example: ''null''
 * @param expiresIn  for example: ''null''
 * @param scope  for example: ''null''
*/
final case class OauthAccessTokenResponse (
  responseType: Option[String] = None,
  accessToken: String,
  tokenType: String,
  expiresIn: Int,
  scope: String
)

