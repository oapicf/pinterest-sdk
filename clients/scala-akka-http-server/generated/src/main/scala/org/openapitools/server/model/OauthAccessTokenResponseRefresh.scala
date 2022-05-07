package org.openapitools.server.model


/**
 * = OAuth access token response =
 *
 * A successful OAuth access token response for the refresh token flow.
 *
 * @param responseType  for example: ''null''
 * @param accessToken  for example: ''null''
 * @param tokenType  for example: ''null''
 * @param expiresIn  for example: ''null''
 * @param scope  for example: ''null''
*/
final case class OauthAccessTokenResponseRefresh (
  responseType: Option[String],
  accessToken: String,
  tokenType: String,
  expiresIn: Int,
  scope: String
)

