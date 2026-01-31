package org.openapitools.server.model


/**
 * = OAuth access token response =
 *
 * A successful OAuth access token response for the refresh token flow.
 *
 * @param accessToken  for example: ''null''
 * @param expiresIn  for example: ''null''
 * @param responseType  for example: ''null''
 * @param scope  for example: ''null''
 * @param tokenType  for example: ''null''
 * @param refreshToken  for example: ''null''
 * @param refreshTokenExpiresAt  for example: ''null''
 * @param refreshTokenExpiresIn  for example: ''null''
*/
final case class OauthAccessTokenResponseRefresh (
  accessToken: String,
  expiresIn: Int,
  responseType: Option[String] = None,
  scope: String,
  tokenType: String,
  refreshToken: String,
  refreshTokenExpiresAt: Int,
  refreshTokenExpiresIn: Int
)

