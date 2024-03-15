package org.openapitools.server.model


/**
 * = OAuth access token response =
 *
 * A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.
 *
 * @param responseType  for example: ''null''
 * @param accessToken  for example: ''null''
 * @param tokenType  for example: ''null''
 * @param expiresIn  for example: ''null''
 * @param scope  for example: ''null''
 * @param refreshToken  for example: ''null''
 * @param refreshTokenExpiresIn  for example: ''null''
 * @param refreshTokenExpiresAt  for example: ''null''
*/
final case class OauthAccessTokenResponseEverlastingRefresh (
  responseType: Option[String] = None,
  accessToken: String,
  tokenType: String,
  expiresIn: Int,
  scope: String,
  refreshToken: String,
  refreshTokenExpiresIn: Int,
  refreshTokenExpiresAt: Int
)

