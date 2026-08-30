package org.openapitools.server.model


/**
 * = OAuth access token request =
 *
 * Describes the valid schema for possible OAuth access token requests.
 *
 * @param accessToken  for example: ''null''
 * @param expiresIn  for example: ''null''
 * @param refreshToken  for example: ''null''
 * @param refreshTokenExpiresAt  for example: ''null''
 * @param refreshTokenExpiresIn  for example: ''null''
 * @param responseType  for example: ''null''
 * @param scope  for example: ''null''
 * @param tokenType  for example: ''null''
*/
final case class OauthAccessToken (
  accessToken: String,
  expiresIn: Int,
  refreshToken: Option[String] = None,
  refreshTokenExpiresAt: Option[Int] = None,
  refreshTokenExpiresIn: Option[Int] = None,
  responseType: Option[TokenGrantType] = None,
  scope: Option[String] = None,
  tokenType: String
)

