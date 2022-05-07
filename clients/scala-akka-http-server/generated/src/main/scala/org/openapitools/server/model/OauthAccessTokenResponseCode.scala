package org.openapitools.server.model


/**
 * = OAuth access token response =
 *
 * A successful OAuth access token response for the authorization code flow.
 *
 * @param responseType  for example: ''null''
 * @param accessToken  for example: ''null''
 * @param tokenType  for example: ''null''
 * @param expiresIn  for example: ''null''
 * @param scope  for example: ''null''
 * @param refreshToken  for example: ''null''
 * @param refreshTokenExpiresIn  for example: ''null''
*/
final case class OauthAccessTokenResponseCode (
  responseType: Option[String],
  accessToken: String,
  tokenType: String,
  expiresIn: Int,
  scope: String,
  refreshToken: String,
  refreshTokenExpiresIn: Int
)

