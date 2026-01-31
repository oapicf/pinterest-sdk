package org.openapitools.server.model


/**
 * @param refreshToken  for example: ''null''
 * @param refreshTokenExpiresAt  for example: ''null''
 * @param refreshTokenExpiresIn  for example: ''null''
 * @param accessToken  for example: ''null''
 * @param expiresIn  for example: ''null''
 * @param responseType  for example: ''null''
 * @param scope  for example: ''null''
 * @param tokenType  for example: ''null''
*/
final case class OauthAccessTokenResponseCode (
  refreshToken: Option[String] = None,
  refreshTokenExpiresAt: Option[Int] = None,
  refreshTokenExpiresIn: Option[Int] = None,
  accessToken: String,
  expiresIn: Int,
  responseType: Option[String] = None,
  scope: String,
  tokenType: String
)

