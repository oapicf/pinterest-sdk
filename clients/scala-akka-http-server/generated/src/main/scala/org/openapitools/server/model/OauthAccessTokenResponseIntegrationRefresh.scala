package org.openapitools.server.model


/**
 * @param refreshToken  for example: ''null''
 * @param refreshTokenExpiresIn  for example: ''null''
 * @param responseType  for example: ''null''
 * @param accessToken  for example: ''null''
 * @param tokenType  for example: ''null''
 * @param expiresIn  for example: ''null''
 * @param scope  for example: ''null''
*/
final case class OauthAccessTokenResponseIntegrationRefresh (
  refreshToken: String,
  refreshTokenExpiresIn: Int,
  responseType: Option[String] = None,
  accessToken: String,
  tokenType: String,
  expiresIn: Int,
  scope: String
)

